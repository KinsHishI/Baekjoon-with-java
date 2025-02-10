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
        for(int i = 0; i < T; i++) {
            str = br.readLine();
            bw.write(str.substring(0,1) + str.substring(str.length() - 1, str.length()) + "\n");
        }

        bw.flush();
        bw.close();
        br.close();
    }
}