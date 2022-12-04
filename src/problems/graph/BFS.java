package problems.graph;

import java.sql.Array;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class BFS {

        public ArrayList<Integer> bfsOfGraph(int V, ArrayList<ArrayList<Integer>> adj) {

            boolean[] visited = new boolean[V+1];
            Queue<Integer> queue = new LinkedList<Integer>();
            queue.add(0);
            ArrayList<Integer> sol = new ArrayList<>();

            Integer actual;
            while(!queue.isEmpty()){
                actual = queue.peek();
                if(!visited[actual]){
                    sol.add(actual);
                    queue.addAll(adj.get(actual));
                    visited[actual] = true;
                }
                queue.remove();
            }
            return sol;
        }

}
