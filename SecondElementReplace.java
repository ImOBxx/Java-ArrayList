import java.util.ArrayList;
import java.util.List;

public class SecondElementReplace {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> list_String = new ArrayList<String>();
		list_String.add("Red");
		list_String.add("Green");
		list_String.add("Orange");
		list_String.add("White");
		list_String.add("Black");
		System.out.println(list_String);
		String new_color = "White";
		list_String.set(1, new_color);
		int num = list_String.size();
		System.out.println("Replace second element with 'White'."); 
		  for(int i=0;i<num;i++)
		  System.out.println(list_String.get(i));

	}

}
