
public interface Addition {

	public void add(int a, int b);

	public void sum(int x, int y, int z);

	public String display(String message);

	default void calc(int a, int b) {
		System.out.println(a + b);
	}
	
	public static void print() {
		System.out.println("welcome");
	}
}
