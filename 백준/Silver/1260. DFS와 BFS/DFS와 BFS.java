import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {
    static int[][] graph;
    static boolean[] visited;
    static int N;
    static int M;
    static int V;
    static Queue<Integer> queue = new LinkedList<>();

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());
        V = Integer.parseInt(st.nextToken());

        graph = new int[N+1][N+1];

        for(int i = 0; i < M; i++){
            st = new StringTokenizer(br.readLine());

            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());

            graph[a][b] = 1;
            graph[b][a] = 1;
        }

        visited = new boolean[N+1];
        dfs(V);
        System.out.println();
        visited = new boolean[N+1];
        bfs(V);

        br.close();
    }

    static void dfs(int v){
        visited[v] = true;

        System.out.print(v + " ");
        for(int i = 1; i <= N; i++) {
            if(graph[v][i] == 1 && visited[i] == false) {
                dfs(i);
            }
        }
    }

    static void bfs(int v){
        queue.add(v);
        visited[v] = true;
        System.out.print(v + " ");

        while(!queue.isEmpty()){
            int cur = queue.poll();
            for(int i = 1; i <= N; i++) {
                if(graph[cur][i] == 1 && visited[i] == false) {
                    queue.add(i);
                    visited[i] = true;
                    System.out.print(i + " ");
                }
            }
        }
    }
}