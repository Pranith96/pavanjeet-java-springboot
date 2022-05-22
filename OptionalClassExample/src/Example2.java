import java.util.Optional;

public class Example2 {

	public static void main(String[] args) {

		String[] str = new String[5];
		// String ss = str[3].toUpperCase();
		// System.out.println(ss);

		Optional<String> data = Optional.ofNullable(str[3]);
		if (data.isPresent()) {
			String s = str[3].toUpperCase();
			System.out.println(s);
		} else {
			System.out.println(data);
		}

		Optional<String> value = Optional.of("ABC");
		System.out.println(value);
		System.out.println(value.get());
	}
}
