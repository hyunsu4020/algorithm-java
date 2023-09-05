import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) {
        // 입력을 읽는 BufferedReader와 출력을 작성하는 BufferedWriter 생성
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int a = 1, b = 1, sum = 0;

        try {
            // a와 b가 모두 0이 아닌 동안 반복
            while (a != 0 & b != 0) {
                // 입력된 줄을 공백으로 구분하여 파싱하기 위한 StringTokenizer 생성
                StringTokenizer st = new StringTokenizer(br.readLine());

                // 첫 번째 정수 입력 받기
                a = Integer.parseInt(st.nextToken());

                // 두 번째 정수 입력 받기
                b = Integer.parseInt(st.nextToken());

                // 두 정수의 합 구하기
                sum = a + b;

                // a와 b가 모두 0이 아닌 경우에만 결과 출력
                if (a != 0 & b != 0) {
                    // 합계를 문자열로 변환하여 BufferedWriter를 통해 출력
                    bw.write(Integer.toString(sum));
                    // 새로운 줄로 이동
                    bw.newLine();
                }
            }

            // BufferedWriter 버퍼 비우기
            bw.flush();
        } catch (IOException e) {
            // IOException 예외를 처리하는 코드
            e.printStackTrace();
        }
    }
}
