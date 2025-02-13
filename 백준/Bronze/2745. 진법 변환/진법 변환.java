import java.io.*;
import java.util.*;
import java.lang.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int temp = 1, sum = 0;

        StringTokenizer st = new StringTokenizer(br.readLine());
        String N = st.nextToken();
        int B = Integer.parseInt(st.nextToken());

        for(int i = N.length() - 1; i >= 0; i--) {
            char ch = N.charAt(i);

            if('A' <= ch && ch <= 'Z')
                sum += (ch - 'A' + 10) * temp;
            else
                sum += (ch - '0') * temp;
            temp *= B;
        }
        bw.write(sum + "");

        bw.flush();
        bw.close();
        br.close();
    }
}