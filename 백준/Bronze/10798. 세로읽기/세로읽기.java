import java.io.*;
import java.util.*;
import java.lang.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int max = 0;
        char[][] str = new char[5][15];

        for (int i = 0; i < 5; i++) {
            String sentence = br.readLine();
            if (max < sentence.length())
                max = sentence.length();

            for (int j = 0; j < sentence.length(); j++) {
                str[i][j] = sentence.charAt(j);
            }
        }

        for (int i = 0; i < max; i++) {
            for (int j = 0; j < 5; j++) {
                if (str[j][i] == '\0')
                    continue;
                bw.write(str[j][i]);
            }
        }

        bw.flush();
        bw.close();
        br.close();
    }
}