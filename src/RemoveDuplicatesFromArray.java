import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class RemoveDuplicatesFromArray{

	/**
	 * Remove Duplicates using ArrayList and LinkedHashSet
	 * @param list
	 * @return
	 */
	public static List<String> removesDuplicates(List<String> list) {
		Set<String> linkedHashSet = new LinkedHashSet<>(list);
		list.clear();
		list.addAll(linkedHashSet);
		return list;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
      ArrayList <String> list= new ArrayList<>();
      list.add("Mohan");
      list.add("Ram");
      list.add("Shyam");
      list.add("Ram");
      System.out.println(removesDuplicates(list));
      
      String [] paramArray = new String [] {"11","2", "3", "3", "3", "3", "4", "3", "5"};
      Object [] result = removesDuplicatesUsingArray(paramArray);//removesDuplicatesUsingArrayList(paramArray);
      for(int i=0;i<result.length;i++) {
    	  System.out.print(result[i] + " ");
		}
	}

	/**
	 * Remove Duplicates using ArrayList
	 * @param list
	 * @return
	 */
	public static Object [] removesDuplicatesUsingArrayList(String [] paramArray) {
		ArrayList<String>  result= new ArrayList<>();
		for(int i=0;i<paramArray.length;i++) {
			if(!result.contains(paramArray[i])) {
				result.add(paramArray[i]);
			}
		}
		return result.toArray();
	}
	
	
	/**
	 * Remove Duplicates using Array
	 * @param list
	 * @return
	 */
	public static Object [] removesDuplicatesUsingArray(String [] paramArray) {
		String []  temp= new String [paramArray.length];
		int lastIndex=-1;
		for(int i=0;i<paramArray.length;i++) {
			if(!isElementAlreadyExist(temp, paramArray[i])) {
				temp[lastIndex+1]=paramArray[i];
				lastIndex=lastIndex+1;
			}
		}
		
		String []  result= new String [lastIndex+1];
		for(int i=0;i<=lastIndex;i++) {
				result[i]=temp[i];
		}
		return result;
	}
	
	public static boolean isElementAlreadyExist(String [] array, String element) {
		if(array.length==0)
			return false;
		for(int i=0;i<array.length;i++) {
			if(array[i] != null && array[i].equals(element)) {
				return true;
			}
		}
		return false;
	}

	
}
