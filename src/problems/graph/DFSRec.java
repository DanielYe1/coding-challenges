package problems.graph;

import java.util.ArrayList;

public class DFSRec {

    public static void dfs(int actualId, ArrayList<ArrayList<Integer>> adj, boolean[] visited, ArrayList<Integer> sol) {

        if (visited[actualId]) {
            return;
        }

        visited[actualId] = true;
        sol.add(actualId);

        for (Integer neighbour : adj.get(actualId)) {
            dfs(neighbour, adj, visited, sol);
        }
    }

    public ArrayList<Integer> dfsOfGraph(int V, ArrayList<ArrayList<Integer>> adj) {

        boolean[] visited = new boolean[V + 1];

        ArrayList<Integer> sol = new ArrayList<>();

        dfs(0, adj, visited, sol);
        return sol;
    }

}
