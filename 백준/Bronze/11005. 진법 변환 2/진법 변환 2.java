import java.io.*;
import java.util.*;
import java.lang.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();

        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int B = Integer.parseInt(st.nextToken());
        while (N > 0) {
            if (N % B >= 10)
                sb.append((char) ((N % B) - 10 + 'A'));
            else
                sb.append((char) (N % B + '0'));
            N /= B;
        }
        bw.write(sb.reverse().toString());

        bw.flush();
        bw.close();
        br.close();
    }
}