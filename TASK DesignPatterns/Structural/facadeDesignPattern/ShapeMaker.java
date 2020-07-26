public class ShapeMaker {
	private Shape rectangle;
	private Shape square;
	private Shape circle;
	public ShapeMaker() {
		circle = new Circle();
		square = new Square();
		rectangle = new Rectange();
	}
	public void displayCircle() {
		circle.display();
	}
	public void displayRectangle() {
		rectangle.display();
	}
	public void displaySquare() {
		square.display();
	}
}
