package contests.two;

public class P1 {

    int[] solution(int[] numbers) {

        int[] sol = new int[numbers.length-2];
        for (int i = 1; i < numbers.length-1; i++) {
            if((numbers[i-1] > numbers[i] && numbers[i+1] > numbers[i]) || (numbers[i-1] < numbers[i] && numbers[i+1] < numbers[i])){
                sol[i-1]= 1;
            }else{
                sol[i-1] = 0;
            }
        }

        return sol;
    }

}
