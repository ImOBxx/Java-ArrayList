import java.util.ArrayList;
import java.util.List;

public class JoinList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> list_String = new ArrayList<String>();
		list_String.add("Red");
		list_String.add("Green");
		list_String.add("Orange");
		list_String.add("White");
		list_String.add("Black");
		System.out.println(list_String);
		List<String> list_String2 = new ArrayList<String>();
		list_String2.add("Red");
		list_String2.add("Green");
		list_String2.add("Orange");
		list_String2.add("White");
		list_String2.add("Black");
		
		ArrayList<String> list_String3 = new ArrayList<String>();
        list_String3.addAll(list_String);
        list_String3.addAll(list_String2);
        System.out.println("New array: " + list_String3);
        
		

	}

}
