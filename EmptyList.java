import java.util.ArrayList;
import java.util.List;

public class EmptyList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> list_String = new ArrayList<String>();
		list_String.add("Red");
		list_String.add("Green");
		list_String.add("Orange");
		list_String.add("White");
		list_String.add("Black");
		System.out.println(list_String);
		list_String.clear();
		System.out.println(list_String);

	}

}
