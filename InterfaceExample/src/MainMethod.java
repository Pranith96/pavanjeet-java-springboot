
public class MainMethod {

	public static void main(String[] args) {
		Addition ad = new AdditionImpl(); // object will be create at runtime
		ad.add(5, 5);
		ad.calc(5, 10);
		String result = ad.display("ABC");
		System.out.println(result);
		ad.sum(5, 5, 5);

		Addition.print();

		AdditionImpl2 ad2 = new AdditionImpl2(); // object will be create at runtime
		ad2.add(5, 5);
		ad2.calc(5, 10);
		String result1 = ad2.display("ABC");
		System.out.println(result1);
		ad2.sum(5, 5, 5);

		AdditionImpl3 ad3 = new AdditionImpl3(); // object will be create at runtime
		ad3.add(5, 5);
		ad3.calc(5, 10);
		String result3 = ad3.display("ABC");
		System.out.println(result3);
		ad3.sum(5, 5, 5);

	}
}
