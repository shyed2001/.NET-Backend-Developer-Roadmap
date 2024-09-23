package inheritance;
//parent class
public class Student {
	private String ID;
	private String Name;
	private String Contact;
	private double feesPerUnit;
	private int numOfUnits;
	
	//constructor
	public Student(){
		this.ID="1001";
		this.Name="unknown";
		this.Contact="unknown";
		this.feesPerUnit=2000;
		this.numOfUnits=4;
	}
	// parametrized constructor
	public Student(String id, String name, String contact){
		this.ID=id;
		this.Name=name;
		this.Contact=contact;
		this.feesPerUnit=2000;
		this.numOfUnits=4;
		
	}
	
	//getters
	public String getName(){
		return this.Name;
	}
	public String getContact(){
		return this.Contact;
	}
	public String getID(){
		return this.ID;
	}
	public double getFees(){
		return this.feesPerUnit;
	}
	public int getUnits(){
		return this.numOfUnits;
	}
	
	//setters- no setter for fees and unit because i don't want other classes to change these values
	public void setName(String name){
		this.Name=name;
	}
	public void setID(String id){
		this.ID=id;
	}
	public void setContact(String contact){
		this.Contact=contact;
	}
	
	//other methods
	public double calculateFees(){
		return this.feesPerUnit*this.numOfUnits;
	}
	// oevrridding tostring() of object class
	public String toString(){
		return "the name of student is "+this.getName()+"\n"+
				"The id of student is "+this.getID()+"\n"+
				"the contact of student is "+this.getContact()+"\n"+
				"the fees is "+this.calculateFees();
	}
	
	
	
	
	
	
	
}
