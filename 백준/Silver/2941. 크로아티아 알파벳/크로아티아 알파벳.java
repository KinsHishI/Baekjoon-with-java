import java.io.*;
import java.util.*;
import java.lang.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String[] CroatiaAlphabet = {"c=", "c-", "dz=", "d-", "lj", "nj", "s=", "z="};
        String str = br.readLine();
        for (int i = 0; i < CroatiaAlphabet.length; i++) {
            if (str.contains(CroatiaAlphabet[i])) {
                str = str.replace(CroatiaAlphabet[i], " ");
            }
        }
        bw.write(str.length() + "\n");
        
        bw.flush();
        bw.close();
        br.close();
    }
}