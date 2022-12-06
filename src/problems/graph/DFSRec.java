package problems.graph;

import java.util.ArrayList;
import java.util.Stack;

public class DFSRec {


    

    public ArrayList<Integer> dfsOfGraph(int V, ArrayList<ArrayList<Integer>> adj) {

        boolean[] visited = new boolean[V + 1];
        Stack<Integer> stack = new Stack<>();
        stack.push(0);
        ArrayList<Integer> sol = new ArrayList<>();

        Integer actual;
        while (!stack.isEmpty()) {
            actual = stack.peek();
            stack.pop();
            if (!visited[actual]) {
                sol.add(actual);
                stack.addAll(adj.get(actual));
                visited[actual] = true;
            }
        }
        return sol;
    }


}
