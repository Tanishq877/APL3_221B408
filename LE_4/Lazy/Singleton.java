public class Singleton {
	private static Singleton uniqueinstance;
	private static int counter = 0;
	private Singleton() {
		counter++;
		System.out.println("Counter : " + counter);	
	}

	public static Singleton getInstance() {
		if (uniqueinstance == null) {
			uniqueinstance = new Singleton();
        	}
        	return uniqueinstance;
    	}

	public static void main(String[] args) {
		Singleton s1 = Singleton.getInstance();
		Singleton s2 = Singleton.getInstance();
	}
}
