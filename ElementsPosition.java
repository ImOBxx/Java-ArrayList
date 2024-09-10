import java.util.ArrayList;
import java.util.List;

public class ElementsPosition {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> list_String = new ArrayList<String>();
		list_String.add("Red");
		list_String.add("Green");
		list_String.add("Orange");
		list_String.add("White");
		list_String.add("Black");
		System.out.println(list_String);
		int num = list_String.size();
		for (int index = 0; index < num; index++)
		{
			System.out.println("List Index " + index + " : " + list_String.get(index));
		}
		

	}

}
