import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;
        String str;

        str = br.readLine();
        int i = Integer.parseInt(br.readLine());  
        bw.write(str.charAt(i - 1));
        
        bw.flush();
        bw.close();
        br.close();
    }
}