public class GetPlanFactory {
	public Plan getPlan(String type) {
		if(type == null)
			return null;
		if( type.equalsIgnoreCase("domestic"))
			return new DomesticPlan();
		else if(type.equalsIgnoreCase("premium") )
			return new PremiumPlan();
		else if(type.equalsIgnoreCase("vip"))
			return new VipPlan();
		return null;
	}
}