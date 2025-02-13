import java.io.*;
import java.util.*;
import java.lang.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;

        int[][] arr = new int[9][9];
        int max = -1, maxRow = -1, maxColumn = -1;
        for (int i = 0; i < 9; i++) {
            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < 9; j++) {
                arr[i][j] = Integer.parseInt(st.nextToken());
                if (arr[i][j] > max) {
                    max = arr[i][j];
                    maxRow = i;
                    maxColumn = j;
                }
            }
        }
        bw.write(max + "\n");
        bw.write((maxRow + 1) + " " + (maxColumn + 1) + "\n");

        bw.flush();
        bw.close();
        br.close();
    }
}