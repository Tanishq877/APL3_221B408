public class EagerSingleton {
	private static final EagerSingleton uniqueinstance = new EagerSingleton();
	private static int counter = 0;

	private EagerSingleton() {
		counter++;
		System.out.println("Counter : " + counter);
	}

	public static EagerSingleton getInstance() {
		return uniqueinstance;
	}

	public static void main(String[] args) {
		EagerSingleton s1 = EagerSingleton.getInstance();
		EagerSingleton s2 = EagerSingleton.getInstance();
	}
}
