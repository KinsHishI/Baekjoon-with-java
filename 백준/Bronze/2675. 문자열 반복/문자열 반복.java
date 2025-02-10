import java.io.*;
import java.util.*;
import java.lang.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;
        String str;

        int T = Integer.parseInt(br.readLine());
        for (int i = 0; i < T; i++) {
            st = new StringTokenizer(br.readLine(), " ");
            int R = Integer.parseInt(st.nextToken());
            str = st.nextToken();
            for (int j = 0; j < str.length(); j++) {
                for (int k = 0; k < R; k++)
                    bw.write(str.charAt(j) + "");
            }
            bw.write("\n");
        }


        bw.flush();
        bw.close();
        br.close();
    }
}