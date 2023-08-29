import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
    	Scanner sc = new Scanner(System.in);
    	int n;
    	String s = "";
    	
    	n = sc.nextInt();
    	
    	for (int i=4; i <= n; i++) {
    		if (i % 4 == 0) {
    			s += "long ";
    		}
    	}
    	
    	System.out.println(s + "int");
    	
		sc.close();
    	}
}
