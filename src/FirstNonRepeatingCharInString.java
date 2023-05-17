import java.util.LinkedHashMap;
import java.util.Map;

public class FirstNonRepeatingCharInString {

	public static void getFirstNonRepeatingChar(String str) {
		Map<Character, Integer> charCount = new LinkedHashMap<>();
		for(int i=0;i<str.length();i++) {
			if(charCount.containsKey(str.charAt(i))) {
				charCount.put(str.charAt(i), charCount.get(str.charAt(i))+1);
			}else {
				charCount.put(str.charAt(i), 1);
			}
		}
		System.out.println(charCount);
        //char ch='"';  enable this for last non repeating char
		for(char c:charCount.keySet()){
			if(charCount.get(c)==1) {
			//	ch=c;
				System.out.println(c);
				break;
			}	
		}
		//System.out.println(ch);

	}
	public static void main(String[] args) {
		getFirstNonRepeatingChar("lloahlab");
	}

}
