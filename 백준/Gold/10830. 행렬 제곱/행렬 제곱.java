import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        st = new StringTokenizer(br.readLine(), " ");

        int N = Integer.parseInt(st.nextToken());
        long B = Long.parseLong(st.nextToken());
        int[][] Matrix = new int[N][N];

        for(int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine(), " ");

            for(int j = 0; j < N; j++) {
                Matrix[i][j] = Integer.parseInt(st.nextToken()) % 1000;
            }
        }

        printMatrix(ExpMatrix(Matrix, N, B), N);

        br.close();
    }

    public static int[][] ExpMatrix(int[][] Matrix, int N, long B) {
        int[][] result = new int[N][N];

        if (B == 0) {
            for (int i = 0; i < N; i++) {
                for (int j = 0; j < N; j++)
                    result[i][j] = 1;
            }
            return result;
        }

        if (B == 1) {
            return Matrix;
        }

        int[][] half = ExpMatrix(Matrix, N, B / 2);

        if (B % 2 == 0)
            return matrixMulti(half, half, N);
        else
            return matrixMulti(Matrix, matrixMulti(half, half, N), N);
    }

    public static int[][] matrixMulti(int[][] A, int[][] B, int N) {
        int[][] C = new int[N][N];

        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                C[i][j] = 0;
                for (int k = 0; k < N; k++)
                    C[i][j] = (C[i][j] + A[i][k] * B[k][j]) % 1000;
            }
        }

        return C;
    }

    public static void printMatrix(int[][] matrix, int N) {
        for(int i = 0; i < N; i++) {
            for(int j = 0; j < N; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }
}