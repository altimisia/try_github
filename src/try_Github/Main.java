package try_Github;

public class Main {

	public static void main(String[] args) {
		System.out.println("Hello Git with Eclipse");

		Add add = new Add();
		Sub sub = new Sub();

		int a = 23;
		int b = 12;


		System.out.println(add.add(a,b) + sub.sub(a, b));

	}

}
