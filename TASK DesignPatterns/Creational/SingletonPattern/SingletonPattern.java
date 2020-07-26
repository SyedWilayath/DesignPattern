public class SingletonPattern {
	private static final SingletonPattern instance = new SingletonPattern() ;
	private SingletonPattern() {
		//This is a private constructor...
	}
	public static SingletonPattern getInstance() {
		return instance;
	}
	public void showMessage() {
		System.out.println("singleton class");
	}
}
