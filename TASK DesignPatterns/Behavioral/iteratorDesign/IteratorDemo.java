import java.util.Iterator;

public class IteratorDemo {

	public static void main(String[] args) {
		NameRepository nameRepository = new NameRepository();
		for(Iterator iterator = nameRepository.getInterator();iterator.hasNext();) {
			String Rname = (String)iterator.next();
			System.out.println("Name :  "+Rname);
		}
	}

}
