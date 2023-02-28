-- Implement your solution here

-- get total value - fee value
select a.value + b.debts as result
-- calculate total value
from (select sum(amount) as value from transactions) as a
         cross join
     -- calculate fee value counting values
         (select CASE
                     WHEN count(*) != 0 THEN (12 - count(*) + sum(total)) * -5
                     ELSE -60
                     END as debts
          from (
                   -- select 0 if should not pay fee or 1 if have to pay
                   select *,
                          CASE
                              WHEN (totalValue <= -100) and (totalTimes > 2) THEN 0
                              else 1
                              END as total
                   from (
                            -- get sum of transactions and amount of transactions by month
                            SELECT sum(amount) as totalValue, count(*) as totalTimes, to_char(date, 'yyyy-mm') as month
                            from transactions
                            where amount < 0
                            GROUP BY month) as sc) as se) as b;