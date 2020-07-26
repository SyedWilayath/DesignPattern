public class BirdAdapter implements ToyDuck {
	Bird bird;
	public BirdAdapter(Bird bird) {
		// TODO Auto-generated constructor stub
		this.bird=bird;
	}
	@Override
	public void squeak() {
		// TODO Auto-generated method stub
		bird.makeSound();	
	}
}