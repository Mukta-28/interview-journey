import java.util.Scanner;

public class ReverseString{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter he number: ");
		int num = sc.nextInt();
		
		String reverseStr = new StringBuilder(Integer.toString(num)).reverse().toString();
		
		System.out.println("Reverse : "+reverseStr);
		
	}
}