import java.util.ArrayList;
import java.util.HashSet;

public class Test {
  
   public static void main(String[] args) {
	/* String str ="ssstr";
	   int count=0;
	   ArrayList<Character> strSet = new ArrayList<>();
	   for (int i=0; i<str.length();i++) {
		   
		   if(strSet.contains(str.charAt(i))) {
			   count=count+1;
		   }else {
			   strSet.add(str.charAt(i));
		   }
		   
		   
  }
	   System.out.println("count:: " + count);*/
	   
	 // printConscutivePrime2(5);
	   
	   //System.out.println(isPrime(8));
	  // printPrime(1,10);
	   //int count=countSetBits(5);
	   
	   //System.out.println(count);
	   
	   printPrime(0,23);
	   
}
   
   public  static void printConscutivePrime(int n) {
	   Integer[] listBid = new Integer[n];
	   Integer[] listNec = new Integer[n];
	   for(int i=0;i<n;i++) {
		   listBid[i]=i+1;
		   //listNec[i]=i+1;
	   }
	   listNec[0]=listBid[0];  
     for(int x=0;x<n;x++) {
	   for(int i=x ;(i< (n-1));i++) {
			   if(isPrime(listBid[i]+ listBid[i+1]) ){
				   listNec[i+1]=listBid[i+1];
			   }
			   else {
				    for(int g=i;g<n-1;g++) {
				    	if(isPrime(listBid[i]+ listBid[g])) {
						   listNec[i+1]=listBid[g];
				    	}
				    }
				      
				   
			   }
	   }
	   
	   for(int i=0;i<n;i++)
            System.out.print(listNec[i] + " ");
	     System.out.println(" ");

      }
   }
   
   
   public  static void printConscutivePrime2(int n) {
	   Integer[] listBid = new Integer[n];
	   Integer[] listNec = new Integer[n];
	   for(int i=0;i<n;i++) {
		   listBid[i]=i+1;
		   //listNec[i]=i+1;
	   }
	   listNec[0]=listBid[0]; 
	   listNec[1]=listBid[1];
	   listNec[2]=listBid[2];
     for(int x=2;x<n;x++) {
	   //for(int i=x ;i<(n-1);i++) {
		       int num=listBid[x]+ listBid[x+1];
			   if(isPrime(num) && num<=n ){
				   listNec[x+1]=listBid[x+1];
				   //listNec[x+2]=num;
			   }
	  // }
	   
	   for(int i=0;i<n;i++)
            System.out.print(listNec[i] + " ");
	     System.out.println(" ");

      }
   }
   
   /** is number Prime**/
   public static boolean isPrime(int n) {
	   if(n==1)
		   return true;
	   for(int i =2;i<=n/2+1;i++) {
	   if(n!=i && n%i==0)
		   return false;
	   }
	   return true;
	   
   }
   
   /** Print all prime between 2 numbers**/
   
   public static void printPrime(int start, int end) {
	   if(start>end) {
		   System.out.println("Start can not be > than end..");
		   return ;
	   }
	
	   for(int i=start;i<end;i++) {
	   if(isPrime(i)) {
			  System.out.println(i);

		   }
	   }
	   
   }
   
   static int countSetBits(int n)
   {
       int count = 0;
       while (n > 0) {
           count += n & 1;
           n >>= 1;
       }
       return count;
   }
}
