import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
    	Scanner sc = new Scanner(System.in);
    	int x, n, a, b, sum = 0;
    	
    	x = sc.nextInt();	
    	n = sc.nextInt();
    	
    	for (int i=0; i<n; i++) {
    		a = sc.nextInt();	b = sc.nextInt();
    		sum += a*b;
    	}
    	
    	if (sum == x) {
    		System.out.println("Yes");
    	}
    	else {
    		System.out.println("No");
    	}
    	
		sc.close();
    	}
}
