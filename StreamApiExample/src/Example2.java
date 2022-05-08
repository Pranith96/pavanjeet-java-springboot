import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class Example2 {

	public static void main(String[] args) {

		List<Integer> list = Arrays.asList(1, 12, 32, 21, 13, 2, 3, 11, 32, 4, 5, 6, 7, 8, 16, 19, 14, 9, 10);

		List<Integer> sortedList = list.stream().sorted().collect(Collectors.toList());
		System.out.println(sortedList);
		System.out.println("...............................");

		Optional<Integer> maxNum = list.stream().max((x, y) -> x.compareTo(y));
		System.out.println(maxNum);
		System.out.println(maxNum.get());
		System.out.println("...............................");
		
		Optional<Integer> minNum = list.stream().min((x, y) -> x.compareTo(y));
		System.out.println(minNum);
		System.out.println(minNum.get());
		System.out.println("...............................");

		List<Integer> reverseSortedList = list.stream().sorted((x, y) -> y.compareTo(x)).collect(Collectors.toList());
		System.out.println(reverseSortedList);
		System.out.println("...............................");

		List<Student> studentList = Arrays.asList(new Student(1, "ABC", 18, 1234567890),
				new Student(2, "XYZ", 19, 1234567860), new Student(3, "QWE", 20, 1234566190),
				new Student(4, "PQR", 21, 1234567820), new Student(5, "AVS", 18, 1234547890));

		List<Student> sortedStudentList = studentList.stream().sorted((x, y) -> x.getAge().compareTo(y.getAge()))
				.collect(Collectors.toList());
		System.out.println(sortedStudentList);
		System.out.println("...............................");

		List<Student> reverseSortedStudentList = studentList.stream().sorted((x, y) -> y.getAge().compareTo(x.getAge()))
				.collect(Collectors.toList());
		System.out.println(reverseSortedStudentList);
		System.out.println("...............................");

		List<Student> filterStudentList = studentList.stream().filter(data -> data.getAge() > 18)
				.collect(Collectors.toList());
		System.out.println(filterStudentList);
		System.out.println("...............................");

	}
}