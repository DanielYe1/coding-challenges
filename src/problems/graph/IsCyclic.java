package problems.graph;

import java.util.ArrayList;

public class IsCyclic {

    public boolean dfs(int actualId, ArrayList<ArrayList<Integer>> adj, boolean[] visited, boolean[] recStack) {

        if (recStack[actualId]) {
            return true;
        }
        if (visited[actualId]){
            return false;
        }

        visited[actualId] = true;
        recStack[actualId] = true;

        for (Integer neighbour : adj.get(actualId)) {
            if(dfs(neighbour, adj, visited, recStack)){
                return true;
            }
        }
        recStack[actualId] = false;
        return false;
    }

    public boolean isCyclic(int V, ArrayList<ArrayList<Integer>> adj) {

        boolean[] visited = new boolean[V + 1];
        boolean[] recStack = new boolean[V + 1];

        for (int i = 0; i < V; i++) {
            if(dfs(i, adj, visited, recStack)){
                return true;
            }
        }

        return false;
    }

}
