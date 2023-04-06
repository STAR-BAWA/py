// import java.util.LinkedList;
import java.util.*;

public class BFS {
    
    public static void main(String[] args) {
        
    }

    public static ArrayList<Integer> bfsOfGraph(int V,ArrayList<ArrayList<Integer>> adj){

        //the adj is the adjacency list of the graph
        ArrayList<Integer> bfs=new ArrayList<>();
        boolean vis[]=new boolean[V+1];
        Queue<Integer> q=new ArrayDeque<>();
        for(int i=1;i<=V;i++)
        {
            if(vis[i]==false)
            {
               q.add(i);
               vis[i]=true;

               while(!q.isEmpty()){
                int node= q.poll();
                bfs.add(node);
               for (Integer it : q) {
                if(vis[it]==false)
                vis[it]=true;
                q.add(it);
               }
                }

            }
        }

        return q;
    }
}
