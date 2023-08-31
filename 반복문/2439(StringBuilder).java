import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
    public static void main(String[] args) throws IOException {
        // 입력 스트림을 위한 BufferedReader 객체 생성
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int t; // 테스트 케이스 개수
        
        t = Integer.parseInt(br.readLine()); // 테스트 케이스 개수 입력
        
        for (int i = 1; i <= t; i++) { // 테스트 케이스 수만큼 반복
        	StringBuilder result = new StringBuilder(); // 결과 문자열을 저장할 변수
            result.append(" ".repeat(t - i)); // 공백 문자열을 (t - i)번 반복하여 이어붙임
            result.append("*".repeat(i)); // '*' 문자열을 i번 반복하여 이어붙임
            bw.write(result.toString()); // StringBuilder 객체를 문자열로 변환하여 출력 버퍼에 추가
            bw.newLine(); // 다음 줄로 이동
            
        }
        
        bw.flush(); // 버퍼에 있는 내용을 출력 스트림으로 강제로 내보냄
        // 또는 bw.close(); 사용해도 됨. 버퍼에 있는 내용을 출력하면서 스트림을 닫음
    }
}
