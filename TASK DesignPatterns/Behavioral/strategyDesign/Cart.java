import java.util.ArrayList;
import java.util.List;

public class Cart {
	 
	List<Item>  items;
	public Cart() {
		this.items=new ArrayList<Item>();
	}
	public void addItem(Item item) {
		this.items.add(item);
	}
	public void removeItem(Item item) {
		this.items.remove(item);
	}
	public double calculateTotal() {
		double sum=0;
		for(Item item:items) {
			sum+=item.getPrice();
		}
		return sum;
	}
	public void payAmount(Payment type) {
		double amount = calculateTotal();
		type.pay(amount);
	}
}
