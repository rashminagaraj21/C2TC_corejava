package corejava_package;
import java.util.Arraylist;
import java.util.List;
import java.util.stream.collectors;
public class stmapi {

	public static void main(String[] args) {
List<Integer> numbers = new ArrayList<Integer>();


numbers.add(100);
numbers.add(110);
numbers.add(120);
numbers.add(150);
List<Integer>newlist=numbers.stream().filter(n->n>110).collect(collectors.toList());
System.out.println(newlist);
	}
	}





	

}
