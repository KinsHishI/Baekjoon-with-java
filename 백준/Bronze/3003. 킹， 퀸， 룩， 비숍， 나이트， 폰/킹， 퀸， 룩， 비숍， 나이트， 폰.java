import java.io.*;
import java.util.*;
import java.lang.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int[] found = new int[6];
        for (int i = 0; i < 6; i++)
            found[i] = Integer.parseInt(st.nextToken());
        int[] chess = {1, 1, 2, 2, 2, 8};
        for (int i = 0; i < 6; i++) {
            chess[i] -= found[i];
            bw.write(chess[i] + " ");
        }

        bw.flush();
        bw.close();
        br.close();
    }
}