package problems.graph;

import java.util.ArrayList;
import java.util.Stack;

public class IsCyclic {

    public boolean isCyclic(int V, ArrayList<ArrayList<Integer>> adj) {

        boolean[] visited = new boolean[V + 1];
        Stack<Integer> stack = new Stack<>();
        stack.push(0);
        ArrayList<Integer> sol = new ArrayList<>();

        Integer actual;

        for (int i = 0; i < adj.size(); i++) {
            stack.push(i);
            while (!stack.isEmpty()) {
                actual = stack.peek();
                stack.pop();
                if (!visited[actual]) {
                    sol.add(actual);
                    stack.addAll(adj.get(actual));
                    visited[actual] = true;

                    return false;
                }
            }

        }
        return false;
    }


}
