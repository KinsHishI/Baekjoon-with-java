import java.io.*;
import java.util.*;
import java.lang.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        for (int i = 0; i < N; i++) {
            for(int j = i + 1; j < N; j++)
                bw.write(" ");
            for(int j = 0; j <= 2 * i; j++)
                bw.write("*");
            bw.write("\n");
        }
        for(int i = 1; i < N; i++) {
            for(int j = 0; j < i ; j++)
                bw.write(" ");
            for(int j = 2 * i; j < 2 * N - 1; j++)
                bw.write("*");
            bw.write("\n");
        }

        bw.flush();
        bw.close();
        br.close();
    }
}