/** Print PrimeNumber less than n***/
public class Prime {
	
	static boolean isPrime(int n) {
		if(n<2)
			return false;
		for(int i=2;i<n/2+1;i++) {
		if(i!=n && n%i==0)
			return false;
		}
		return true;
		
	}

	public static void main(String args[]) {
		int number=5;
	    System.out.println("Prime numbers less than " + number);

		for (int i=2;i<number;i++) {
		  if(isPrime(i))
		    System.out.print(i + " ");
		}
	}
}
