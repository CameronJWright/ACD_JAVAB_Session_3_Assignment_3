package hello.world;

class Chain {

	Chain(int x, int y) {
		this(x);
		System.out.println("Chain x: " + x + " Chain y: " + y);
	}

	Chain(int x) {
		this();
		System.out.println("Chain x: " + x);
	}

	Chain() {
		System.out.println("Chain End");
	}
}

class SubChain extends Chain {
	SubChain(int x, int y) {
		super(x);
		System.out.println("SubChain x: " + x + " SubChain y: " + y);

	}

	SubChain(int x) {
		super();
		System.out.println("SubChain x: " + x);
	}
}

public class ConstructorChaining {

	public static void main(String[] args) {

		Chain chn = new Chain(10, 5);
		SubChain schn= new SubChain(6,4);

	}

}
