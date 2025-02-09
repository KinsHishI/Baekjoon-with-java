import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;

        st = new StringTokenizer(br.readLine(), " ");
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        int[] arr = new int[N + 1];
        for(int i = 1; i <=N; i++)
            arr[i] = i;

        for (int k = 0; k < M; k++) {
            st = new StringTokenizer(br.readLine(), " ");
            int i = Integer.parseInt(st.nextToken());
            int j = Integer.parseInt(st.nextToken());
            int temp;
            temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
        }
        for (int k = 1; k <= N; k++)
            bw.write(arr[k] + " ");
        bw.flush();
        bw.close();
        br.close();


    }
}