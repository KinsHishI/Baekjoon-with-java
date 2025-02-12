import java.io.*;
import java.util.*;
import java.lang.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        double ScoreSum = 0;
        double CreditSum = 0;
        double credit = 0;
        String object;
        String grade;
        String[] gradeList = {"A+", "A0", "B+", "B0", "C+", "C0", "D+", "D0", "F"};
        double[] gradeScore = {4.5, 4.0, 3.5, 3.0, 2.5, 2.0, 1.5, 1.0, 0};
        StringTokenizer st;


        for (int i = 0; i < 20; i++) {
            st = new StringTokenizer(br.readLine());
            object = st.nextToken();
            credit = Double.parseDouble(st.nextToken());
            grade = st.nextToken();

            if (grade.equals("P"))
                continue;
            for (int j = 0; j < 9; j++) {
                if (grade.equals(gradeList[j])) {
                    ScoreSum += credit * gradeScore[j];
                    break;
                }
            }
            CreditSum += credit;
        }
        bw.write(ScoreSum / CreditSum + "\n");

        bw.flush();
        bw.close();
        br.close();
    }
}