
public class Pilot extends Person {
	
	
	private String name;
	
	public Pilot(String name){
		
		this.name=name;
	}
	public String jobDuty(){
		
		return "A pilot flies a plane";
	}
	
	
	
	public String salary(){
		
		return "A pilot makes $100,000";
	}
	
	public String getName(){
		
		return name;
	}

}
