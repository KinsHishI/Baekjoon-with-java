import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.lang.StringBuilder;

public class Main {
    static int[][] c;
    static int[][] b;
    static StringBuilder sb = new StringBuilder();

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String str1, str2;
        str1 = br.readLine();
        str2 = br.readLine();

        int m = str1.length();
        int n = str2.length();
        c = new int[m + 1][n + 1];
        b = new int[m + 1][n + 1];

        Lcs(m, n, str1, str2);

        sb.append(c[m][n]);

        System.out.print(sb);
        br.close();
    }

    public static void Lcs(int m, int n, String str1, String str2) {
        for (int i = 1; i <= m; i++) {
            for (int j = 1; j <= n; j++) {
                if (str1.charAt(i - 1) == str2.charAt(j - 1)) {
                    c[i][j] = c[i - 1][j - 1] + 1;
                    b[i][j] = 1;
                } else {
                    c[i][j] = Math.max(c[i][j-1], c[i-1][j]);
                    if(c[i][j-1] > c[i-1][j]) {
                        b[i][j] = 2;
                    } else {
                        b[i][j] = 3;
                    }
                }
            }
        }
    }

    public static String getLcs(int i, int j, int[][] b, String str) {
        if (i == 0 || j == 0) {
            return "";
        }
        if (b[i][j] == 1) {
            return getLcs(i - 1, j - 1, b, str) + str.charAt(i-1);
        } else if (b[i][j] == 2) {
            return getLcs(i, j - 1, b, str);
        } else {
            return getLcs(i - 1, j, b, str);
        }
    }
}