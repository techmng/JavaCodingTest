//Print Fibnacci Seriese till 10 eg 1,1,2,3,5,8,13
public class FibnacciSeries {
	public static void printFibabicci(int n){
		 int fib1=1;
		 int fib2=1;
		 int fib=1;
		 if(1==n)
			System.out.print(1 + " ");
		 if(n>=2) {
			 System.out.print(fib1 + " " + fib2 + " ");
		 }
		  for (int i=3;i<=n;i++) {
			   fib = fib1+ fib2;
				fib1=fib2;
				fib2=fib;
			   System.out.print(fib + " ");
					  
		  }
	}
	
	public static int fibonacciRecurssion(int num) {
		
		if(num==1||num==2) {
			return 1;
		}
		
		return fibonacciRecurssion(num-1)+fibonacciRecurssion(num-2);
		
	}
	public static void main (String args[]) {
		//printFibabicci(5);
		for(int i=1;i<=5;i++)
		 System.out.print(fibonacciRecurssion(i)+ " ");  
	}
}