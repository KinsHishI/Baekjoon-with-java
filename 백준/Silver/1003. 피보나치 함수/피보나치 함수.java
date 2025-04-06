import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int T = Integer.parseInt(br.readLine());

        int[][] fib = new int[41][2];
        fib[0][0] = 1;
        fib[0][1] = 0;
        fib[1][0] = 0;
        fib[1][1] = 1;

        for(int i = 0; i < T; i++) {
            int N = Integer.parseInt(br.readLine());

            for(int j = 2; j <= N; j++) {
                fib[j][0] = fib[j-1][0] + fib[j-2][0];
                fib[j][1] = fib[j-1][1] + fib[j-2][1];
            }

            System.out.println(fib[N][0] + " " + fib[N][1]);
        }

        br.close();
    }
}