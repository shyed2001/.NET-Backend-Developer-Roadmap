package inheritance;
//child class
public class InternationalStudents extends Student {
	private String CountryOfOrigin;
	private double OshcFees;
	
	//constructor
	public InternationalStudents(){
		super();
		this.CountryOfOrigin="Unknown";
		this.OshcFees=3500;
		
	}
	public InternationalStudents(String country, double oshc){
		super();
		this.CountryOfOrigin=country;
		this.OshcFees=oshc;
	}
	
	public InternationalStudents(String id, String name, String contact, String country, double oshc){
		super(id,name,contact);
		this.CountryOfOrigin=country;
		this.OshcFees=oshc;
	}
	
	//getters
	public String getCountry(){
		return this.CountryOfOrigin;
	}
	public double getOSHC(){
		return this.OshcFees;
	}
	
	//setters
	public void setCountry(String country){
		this.CountryOfOrigin=country;
	}
	public void setOSHC(double oshc){
		this.OshcFees=oshc;
	}
	//other methods- overridden method
	public double calculateFees(){
		
		double fees;
		fees=super.calculateFees()+this.OshcFees;
		return fees;
	}
	
	public String toString(){
		return "The Name of internation student is "+super.getName()+
				"\nThe id of international student is "+super.getID()+
				"\nThe contact of International student is "+super.getContact()
				+"\nFees of international student is "+this.calculateFees();
	}
	
}
