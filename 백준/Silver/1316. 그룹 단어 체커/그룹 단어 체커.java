import java.io.*;
import java.util.*;
import java.lang.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());
        String GroupWord = new String();
        int isGroup = N;
        for (int i = 0; i < N; i++) {
            GroupWord = br.readLine();
            boolean[] Alphabet = new boolean[26];
            for (int j = 0; j < GroupWord.length() - 1; j++) {
                if (GroupWord.charAt(j) != GroupWord.charAt(j + 1) && Alphabet[GroupWord.charAt(j + 1) - 'a'] == true) {
                    isGroup--;
                    break;
                }
                Alphabet[GroupWord.charAt(j) - 'a'] = true;
            }
        }
        bw.write(isGroup + "\n");

        bw.flush();
        bw.close();
        br.close();
    }
}