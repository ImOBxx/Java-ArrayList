import java.util.ArrayList;
import java.util.List;

public class CloneList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> list_String = new ArrayList<String>();
		list_String.add("Red");
		list_String.add("Green");
		list_String.add("Orange");
		list_String.add("White");
		list_String.add("Black");
		Object list_String3 = ((ArrayList<String>) list_String).clone();
		System.out.println("Cloned Array: " + list_String3);
        
	}

}
