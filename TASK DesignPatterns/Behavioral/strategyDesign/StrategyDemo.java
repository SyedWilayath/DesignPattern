public class StrategyDemo {
public static void main(String[] args) {
	Cart cart = new Cart();
	Item item1 = new Item("676534",45.5);
	Item item2 = new Item("345324",67.09);
	cart.addItem(item1);
	cart.addItem(item2);
	cart.payAmount(new CreditCard("Neeraja","21344676783443","345","10/25"));
	cart.payAmount(new UPI("9348453934@apl","1678"));
}
}