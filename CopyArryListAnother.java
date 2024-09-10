import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CopyArryListAnother {

	public static void main(String[] args) {
	
		List<String> list_String = new ArrayList<String>();
		list_String.add("Red");
		list_String.add("Green");
		list_String.add("Orange");
		list_String.add("White");
		list_String.add("Black");
		System.out.println(list_String);
		
		List<String> list_String2 = new ArrayList<String>();
		list_String2.add("1");
		list_String2.add("2");
		list_String2.add("3");
		list_String2.add("4");
		list_String2.add("5");
		System.out.println(list_String2);
		
		Collections.copy(list_String, list_String2);
		System.out.println(list_String);
		System.out.println(list_String2);
		
		

	}

}
