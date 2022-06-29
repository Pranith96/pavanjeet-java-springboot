
public class Example3 {

	public static void main(String[] args) {
//		try {
//			int i = 10;
//			int j = i / 0;
//
//			System.out.println(j);
//		} catch (ArithmeticException ex) {
//			ex.printStackTrace();
//		}

		try {
			int age = 18;
			if (age < 19) {
				throw new RuntimeException("Age is less than 19");
			}
		} catch (RuntimeException ex) {
			ex.printStackTrace();
		}
		System.out.println("Hi");
		System.out.println("Hello");
		System.out.println("java");

	}
}
