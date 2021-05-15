package graphs;

import java.util.ArrayList;
import java.util.Arrays;

public class DirectedGraph {


    public boolean dfs(int N,ArrayList<ArrayList<Integer>>adj ){

        boolean[] visited = new boolean[N];
        boolean[] dfs = new boolean[N];
        Arrays.fill(visited, false);
        Arrays.fill(visited, false);
        for(int i=1; i<=adj.size(); i++){
            if(!visited[i]){
                cycle(adj,visited,dfs,i);
                return true;
            }

        }
        return false;
    }


    public boolean cycle(ArrayList<ArrayList<Integer>>adj, boolean[] visited, boolean[] dfsVisited, int node){

        dfsVisited[node] = true;
        visited[node] = true;

        for(int it : adj.get(node)){
            if(!visited[it]){
                if(cycle(adj,visited, dfsVisited,it)){
                    return true;
                }

            }else{
                if(dfsVisited[it]){
                    return  true;
                }
            }

        }
        dfsVisited[node] =false;
        return false;


    }
}
