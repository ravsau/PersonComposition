
public class PersonCompositionApp {

	public static void main(String[] args) {
		
		
		Airplane a= new Airplane("business");
		Pilot p=new Pilot("bob");
		
		System.out.printf("The %s airplane is being flown by %s", a.getType(),a.getName(p));

	}

}
