import java.io.*;
import java.util.*;
import java.lang.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;
        String str;

        st = new StringTokenizer(br.readLine(), " ");
        bw.write(st.countTokens() + "");

        bw.flush();
        bw.close();
        br.close();
    }
}