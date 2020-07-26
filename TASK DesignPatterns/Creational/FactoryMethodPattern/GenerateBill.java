import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class GenerateBill {
public static void main(String[] args) throws IOException{
	GetPlanFactory planFactory = new GetPlanFactory();
	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	System.out.println("Enter the plan");
	String planName = br.readLine();
	System.out.println("Enter the amount of units burned:");
	int unit = Integer.parseInt(br.readLine());
	Plan plan = planFactory.getPlan(planName);
	System.out.print("Total Amount  : ");
	plan.getRate();
	plan.calculateBill(unit);
}
}
