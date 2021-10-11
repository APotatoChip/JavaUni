import java.util.Scanner;
public class Hypotenuse {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
		try{
	    System.out.println("Please eneter side A:");
	    int a = sc.nextInt();
		System.out.println("Please enter side B:");
		int b =sc.nextInt();
		double c = Math.sqrt(a*a + b*b);
		System.out.println("The length of the hypotenuse is: "+c);
    }finally{
		sc.close();
	}
}
}