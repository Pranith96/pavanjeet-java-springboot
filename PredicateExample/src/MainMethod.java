import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class MainMethod {

	public static void main(String[] args) {
		Predicate<Integer> result = new PredicateImpl();
		boolean rs = result.test(5);
		System.out.println(rs);
		
		System.out.println("...............................");
		Predicate<Integer> rs1 = (x) ->  {
			if (x % 2 == 0) {
				return true;
			}
			return false;
		};
		boolean rst = rs1.test(6);
		System.out.println(rst);
		System.out.println("...............................");

		Predicate<Integer> rs3 = x -> x % 2 == 0;
		boolean rst1 = rs3.test(6);
		System.out.println(rst1);
		
		String s = "Hello world";
		Supplier<String> str = () -> {
			return s.toUpperCase();
		};
		System.out.println(str.get());
		
		Consumer<Integer> cn = (x) ->{
			System.out.println(x);
		};
		cn.accept(10);
	}
}
