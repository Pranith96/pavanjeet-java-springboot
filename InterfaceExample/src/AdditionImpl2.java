
public class AdditionImpl2 implements Addition {

	@Override
	public void add(int a, int b) {
		int c = a * b;
		System.out.println(c);
	}

	@Override
	public void sum(int x, int y, int z) {
		int p = x + y + z;
		System.out.println(p);
	}

	@Override
	public String display(String message) {
		String s = "Hello welcome to Spring" + message;
		return s;
	}

}
