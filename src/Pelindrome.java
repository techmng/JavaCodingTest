import java.util.ArrayList;
import java.util.List;

/**
 * Pelindrome is string which is equals of it's reverse. Eg. "ada", "121", "SitonapotatopanotiS"
 * @author manoj
 *
 */
public class Pelindrome {
	
	public static boolean isStringPelindrome(String str) {
		for(int i=0;i<=str.length()/2;i++) {
			if(str.toLowerCase().charAt(i)!=str.toLowerCase().charAt(str.length()-(i+1)))
				return false;
		}
		return true;
	}
	
	public static boolean isIntegerPelindrome(int number) {
		int reverse=0;
		int temp = number;
		while(temp>0) {
			reverse=reverse*10+temp%10;
			temp=temp/10;
		}
		if(number!=reverse)
			return false;
		return true;
	}
	
	public static void main(String args []) {
		List<String> pelindromeList = new ArrayList<>(); 
		pelindromeList.add("SitonapotatopanotiS");
		pelindromeList.add("ada");
		pelindromeList.add("TacocaT");
		pelindromeList.add("Tacocat");
		pelindromeList.add("123321");
		
		pelindromeList.forEach(str->{
		 System.out.println("is " + str + " pendindrome ? " + isStringPelindrome(str));
		});
		
		System.out.println("is 21212 pelindrome ? " + isIntegerPelindrome(21212));

	}
	
	
    
}
