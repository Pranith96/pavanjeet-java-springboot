import java.util.Random;

public class MainMethod {

	public static void main(String[] args) {
		AdditionImpl additionImpl = new AdditionImpl(); // compile time
		additionImpl.add(5, 5);

		Addition ad = new AdditionImpl(); // runtime polymorphism
		ad.add(10, 10);

		Addition ad1 = (x, y) -> {
			int z = x + y;
			System.out.println(z);
		};
		ad1.add(15, 10);

		Addition ad2 = (x, y) -> System.out.println(x + y);
		ad2.add(15, 10);

		Summation sm = message -> System.out.println(message.toLowerCase());
		sm.test("WELCOME");

		Welcome wl = () -> {
			Random rn = new Random();
			int num = rn.nextInt();
			return num;
		};
		int result = wl.display();
		System.out.println(result);
	}

}
