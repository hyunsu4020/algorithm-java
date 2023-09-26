import java.io.IOException;
import java.util.Scanner;

public class Main {
	
	public static void main(String[] args){
		// Scanner 객체를 생성하여 사용자 입력을 읽습니다.
		Scanner sc = new Scanner(System.in);
		int a, b, sum = 0;
		
		// hasNextInt() 메서드를 사용하여 무한 루프를 설정합니다.
		while(sc.hasNextInt()) {
			// 사용자로부터 두 개의 정수를 읽어와 변수 a와 b에 저장합니다.
			a = sc.nextInt();
			b = sc.nextInt();
			
			// 두 정수를 더한 값을 변수 sum에 저장합니다.
			sum = a + b;
			
			// 결과를 출력합니다.
			System.out.println(sum);
		}
		
		// Scanner를 닫아 리소스를 정리합니다.
		sc.close();
	}
}
