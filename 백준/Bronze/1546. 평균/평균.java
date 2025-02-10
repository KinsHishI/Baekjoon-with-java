import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;
        double sum = 0;
        int max = -1;
        int N = Integer.parseInt(br.readLine());
        int[] arr = new int[N];
        st = new StringTokenizer(br.readLine(), " ");
        for (int i = 0; i < N; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
            if (max < arr[i])
                max = arr[i];
        }
        for (int i = 0; i < N; i++)
            sum += (double) arr[i] / max * 100;
        bw.write((sum / N) + "\n");
        bw.flush();
        bw.close();
        br.close();
    }
}