package corejava_package;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;
import java.util.Optional;

public class stddemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer>numbers=new ArrayList<Integer>();
		numbers.add(100);
		numbers.add(110);
		numbers.add(120);
		numbers.add(150);
		System.out.println(numbers);
		Stream<Integer>Stream=numbers.stream();
		Optional<Integer>sum=Stream.reduce(Integer::sum);
		System.out.println("ans="+sum.get());
		
		

	}

}
