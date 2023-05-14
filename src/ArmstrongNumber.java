/*
 * A number is called an Armstrong number if it is equal to the cube of its every digit. For example, 
 * 153 is an Armstrong number because of 153= 1+ 125+27, which is equal to 1^3+5^3+3^3.
 */
public class ArmstrongNumber {
	
	public static boolean isArmstrong(int number) {
		int result=0;
		int temp=number;
		
		while(temp>0) {
			int remainder = temp%10;
			result=result+(remainder*remainder*remainder);
			temp=temp/10;
		}
		
		if(number == result)
			return true;
					
		return false;			
					
	}
	
	public static void main(String[] args) {
		System.out.println("is 153 Armstrong ?  " + isArmstrong(153));
	}

}
