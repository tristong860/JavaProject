import java.util.*;

public class interviewQOne{


	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Welcome to the palindrome checker!");
		System.out.println("What is the thing you want to check?");
		String checker = sc.nextLine();

		int len = checker.length();
		int lenHalf = len / 2;
		StringBuffer sb1 =  new StringBuffer("");
		StringBuffer sb2 =  new StringBuffer("");

		for(int i = 0; i<lenHalf; i++)
		{
			sb1.append(checker.charAt(i));
		}

		if(checker.length() %2 == 0){
			for(int i = len -1 ; i >= lenHalf ;i--){
				sb2.append(checker.charAt(i));
			}
		}
		else if(checker.length() %2 != 0)
		{
			for(int i = len -1 ; i >= lenHalf ;i--)
			{
				sb2.append(checker.charAt(i));
			}}
		if(sb1.toString().equals(sb2.toString()))
		{
			System.out.println("Your string is a Palindrome!");
		}else
			System.out.println("Your string is not a Palindrome!");

	}



}
