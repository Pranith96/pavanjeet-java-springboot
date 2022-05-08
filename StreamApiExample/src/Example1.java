import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Example1 {

	public static void main(String[] args) {

//		List<Integer> list = new ArrayList<>();
//		list.add(1);
//		list.add(2);

		List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
		Stream<Integer> stream = list.stream().filter(x -> x % 2 == 0);
		System.out.println(stream);
		System.out.println("...............................");
		List<Integer> filterList = list.stream().filter(x -> x % 2 == 0).collect(Collectors.toList());
		System.out.println(filterList);
		System.out.println("...............................");
		List<Integer> mapList = list.stream().map(y -> y * 5).collect(Collectors.toList());
		System.out.println(mapList);
		System.out.println("...............................");
		list.stream().filter(x -> x % 2 == 0).map(y -> y * 5).forEach(data -> System.out.println(data));
		System.out.println("...............................");
		long count = list.stream().filter(x -> x % 2 == 0).map(y -> y * 5).count();
		System.out.println(count);
		System.out.println("...............................");
	}
}
