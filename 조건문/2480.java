import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
    	Scanner sc = new Scanner(System.in);
    	int a, b, c, sum = 0;
    	
    	a = sc.nextInt();	b = sc.nextInt();	c = sc.nextInt();
    	
    	if (a == b & a == c) {
    		sum = 10000 + (a*1000);
    	}
    	else if ((a == b & a != c) | (a != b & a == c)) {
    		sum = 1000 + (a*100);
    	}
    	else if ((b == c & b != a) | (b != c & b == a)) {
    		sum = 1000 + (b*100);
    	}
    	else if ((c == a & c != b) | (c != a & c== b)) {
    		sum = 1000 + (c*100);
    	}
    	else if (a != b & a != c & b != c) {
    		if (a >= b & a >= c) {
    			sum = a * 100;
    		}
    		else if (b >= a & b >= c) {
    			sum = b * 100;
    		}
    		else if (c >= b & c >= a) {
    			sum = c * 100;
    		}
    	}
    	System.out.println(sum);
		
		sc.close();
    	}
}
