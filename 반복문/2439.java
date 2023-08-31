import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        // 입력 스트림을 위한 BufferedReader 객체 생성
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int t;
        String star = "", blank= " ", result = " ";
        
        t = Integer.parseInt(br.readLine()); // 테스트 케이스 개수 입력
        
        for (int i=1; i<=t; i++) { // 테스트 케이스 수만큼 반복
            blank = blank.repeat(t-i);
            star += "*";
            result = blank + star;
            bw.write(result);	
            bw.newLine();
            blank = " ";
        }
        
        bw.flush(); // 버퍼에 있는 내용을 출력 스트림으로 강제로 내보냄
        // 또는 bw.close(); 사용해도 됨. 버퍼에 있는 내용을 출력하면서 스트림을 닫음
    }
}
