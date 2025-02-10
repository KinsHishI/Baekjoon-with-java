import java.io.*;
import java.util.*;
import java.lang.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;
        String str;

        int[] alphabet = new int[26];
        for (int i = 0; i < 26; i++)
            alphabet[i] = -1;

        str = br.readLine();
        for (int i = 0; i < str.length(); i++) {
            if (alphabet[str.charAt(i) - 'a'] == -1)
                alphabet[str.charAt(i) - 'a'] = i;
        }

        for (int i = 0; i < 26; i++)
            bw.write(alphabet[i] + " ");

        bw.flush();
        bw.close();
        br.close();
    }
}