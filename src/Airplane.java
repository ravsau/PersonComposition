
public class Airplane extends Vehicle{
	
	private Pilot pilot;
	private String type;  // passenger,cargo,business 
	
	
	public Airplane(String type){
		
		this.type=type;
		
		
	}
	
	
	public String getName(Pilot p){
		
		return p.getName();
		
		
	}
	
	
	public String fly(){
		
		
		return "The "+type+ " plane flies";
		}
	
	
   public String getType(){
	   
	   return type;
   }
}


