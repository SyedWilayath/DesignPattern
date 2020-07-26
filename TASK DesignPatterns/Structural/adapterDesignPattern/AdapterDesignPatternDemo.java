public class AdapterDesignPatternDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HummingBird hummingBird = new HummingBird();
		ToyDuck toyDuck = new PlasticToyDuck();
		ToyDuck birdAdapter = new BirdAdapter(hummingBird);
		System.out.println("Hummming bird :");
		hummingBird.fly();
		hummingBird.makeSound();
		System.out.println("Toy Duck :");
		toyDuck.squeak();
		System.out.println("Bird Adapter :");
		birdAdapter.squeak();
	}
}
