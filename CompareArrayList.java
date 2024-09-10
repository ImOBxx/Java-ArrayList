import java.util.ArrayList;
import java.util.List;

public class CompareArrayList {

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
		list_String.add("Violet");
		list_String.add("Cyan");
		list_String.add("Maroon");
		list_String.add("Red");
		list_String.add("Purple");
		System.out.println(list_String2);
		ArrayList<String> l3 = new ArrayList<String>();
        for (String e : list_String)
           l3.add(list_String2.contains(e) ? "Yes" : "No");
        System.out.println(l3);
		
		

	}

}
