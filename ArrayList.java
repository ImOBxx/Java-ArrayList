import java.util.Collections;
import java.util.List;

public class ArrayList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> list_String = new ArrayList<String>();
		list_String.add("Red");
		list_String.add("Green");
		list_String.add("Orange");
		list_String.add("White");
		list_String.add("Black");
		Collections.swap(list_String, 2, 3);
		System.out.println(list_String);

	}

}
