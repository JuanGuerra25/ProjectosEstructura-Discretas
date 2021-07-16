package dfs;
import java.util.*;
import java.util.Stack;

public class GradoDFS {
 
    private char[] vertices;
 
    private  int[][] arcs;  
 
    private int vexnum;
 
    private boolean[] visited;
 
    public GradoDFS(int n) {
          vexnum = n;
          vertices = new char[n];
          arcs = new int[n][n];
          visited = new boolean[n];
          for (int i = 0; i < vexnum; i++) {
             for (int j = 0; j < vexnum; j++) {
                 arcs[i][j] = 0;
             }
          }
    }
         
    public void addEdge(int i, int j) {
 
          if (i == j)return;
 
          arcs[i][j] = 1;
          arcs[j][i] = 1;
    }
 
    public void setVertices(char[] vertices) {
        this.vertices = vertices;
    }
 
    public void setVisited(boolean[] visited) {
        this.visited = visited;
    }
 
    public void visit(int i){
        System.out.print(vertices[i] + " ");
    }
 
    private void traverse(int i){
        visited[i] = true;
        visit(i);
        for(int j=0;j<vexnum;j++){
            if(arcs[i][j]==1 && visited[j]==false){
                traverse(j);
            }
        }
    }
 
    public void DFSrecorrido(){
        for (int i = 0; i < vexnum; i++) {
            visited[i] = false;
        }
        for(int i=0;i<vexnum;i++){
            if(visited[i]==false){
                traverse(i);
            }
        }
    }
 
    public void DFSrecorrido2(){
        for (int i = 0; i < vexnum; i++) {
            visited[i] = false;
        }
        Stack<Integer> s = new Stack<Integer>();
        for(int i=0;i<vexnum;i++){
            if(!visited[i]){
                s.add(i);
                do{ 
                    int curr = s.pop();
                    
                    if(visited[curr]==false){
   
                        visit(curr);
                        visited[curr] = true;
 
                        for(int j=vexnum-1; j>=0 ; j-- ){
                            if(arcs[curr][j]==1 && visited[j]==false){
                                s.add(j);
                            }
                        }
                    }
                }while(!s.isEmpty());
            }
        }
    }
 
    public static void main(String[] args) {
    	GradoDFS g = new GradoDFS(4);
        char[] vertices = {'A','B','C','D'};
        g.setVertices(vertices);
 
        g.addEdge(0, 2);
        g.addEdge(0, 3);
        g.addEdge(1, 2);
        g.addEdge(1, 3);
        g.addEdge(2, 0);
        g.addEdge(2, 1);
        g.addEdge(2, 3);
        g.addEdge(3, 0);
        g.addEdge(3, 1);
        g.addEdge(3, 2);
 
                 System.out.print ("primer recorrido en profundidad (recursivo):");
        g.DFSrecorrido();
 
        System.out.println();
 
                 System.out.print ("Recorrido en profundidad primero (no recursivo):");
        g.DFSrecorrido2();
    }	
}
