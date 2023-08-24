import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
    	Scanner sc = new Scanner(System.in);
    	int hour, min, plus, sum, alpha_H = 0, alpha_M = 0;
    	
    	hour = sc.nextInt();	min = sc.nextInt();
    	plus = sc.nextInt();
    	
    	sum = min + plus;
    	alpha_H = hour + (sum / 60);
    	alpha_M = (sum % 60);
    	
    	if (sum >= 60) {
    		hour = alpha_H;
    		min = alpha_M;
    		if (alpha_H >= 24) {
        		hour = alpha_H - 24;
        	}
    	}
    	else {
    		min = sum;
    	}
    	
    	System.out.print(hour + " " + min);
		
		sc.close();
    	}
}
