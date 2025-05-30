import java.util.Scanner;

public class ReverseRecursion{
	
	static int reverseNum(int num, int rev){
		if (num == 0)
			return rev;
		return reverseNum(num/10,rev*10+num%10);
	}
	
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number: ");
		int num = sc.nextInt();
		
		int reverse = reverseNum(num,0);
		
		System.out.println("Reverse: "+ reverse);
		
		
	}
}