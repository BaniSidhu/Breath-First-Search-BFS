import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

class BFS{
     public static class Edge{
        int scr;
        int dest;
        // int wt;
        
        public Edge(int s,int d){
            this.scr=s;
            this.dest=d;
            // this.wt=w;

        }
     }
     public static void createGraph(ArrayList<Edge>graph[]){
        for (int i = 0; i < graph.length; i++) {
            graph[i]= new ArrayList<Edge>();//har index pr ek new arraylist create ho jye ge or har index pr ek 
            
        }
        graph[0].add(new Edge(0, 1));
        graph[0].add(new Edge(0, 2));

        graph[1].add(new Edge(1, 0));
        graph[1].add(new Edge(1, 3));

        graph[2].add(new Edge(2, 0));
        graph[2].add(new Edge(2, 4));
    

         graph[3].add(new Edge(3, 1));
         graph[3].add(new Edge(3, 4));
         graph[3].add(new Edge(3, 5));

         graph[4].add(new Edge(4, 2));
         graph[4].add(new Edge(4, 3));
         graph[4].add(new Edge(4, 5));

         graph[5].add(new Edge(5, 3));
         graph[5].add(new Edge(5, 4));
         graph[5].add(new Edge(5, 6));

         graph[6].add(new Edge(6, 5));
     }
     public static void bsf(ArrayList<Edge>graph[],int V){
        Queue<Integer> q= new LinkedList<>();
        boolean vis[]= new boolean[V];
        q.add(0);//this is the start it can be any 
        while (!q.isEmpty()) {
            int curr=q.remove();
            if(vis[curr]==false){
                System.out.print(curr+"  ");
                vis[curr]=true;

                for (int i = 0; i < graph[curr].size(); i++) {
                    Edge e= graph[curr].get(i);
                    q.add(e.dest);//sare k sare neighbour queue me add ho jyn ge 
                }
            }


            
        }
     }
    public static void main(String[] args) {
        int V=7;
        
        //     1-------3
        //    /        | \
        //    0        |  5---6
        //     \       | /
        //      2------4
        
    ArrayList<Edge> graph[]=new ArrayList[V]; 
    createGraph(graph);
    bsf(graph,V);
    System.out.println(); 
    
    }
}