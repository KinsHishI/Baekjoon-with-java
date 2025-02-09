import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int[] arr = new int[42];
        int count = 0;
        for(int i = 0; i < 10; i++) {
            int a = Integer.parseInt(br.readLine());
            int rest = a % 42;

            if(++arr[rest] == 1)
                count++;
        }
        bw.write(String.valueOf(count));
        bw.flush();
        bw.close();
        br.close();
    }
}