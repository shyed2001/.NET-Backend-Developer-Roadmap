package inheritance;
//child class
public class DomesticStudents extends Student{
		private double rebate;
		
		public DomesticStudents(){
			super();
			this.rebate=4000;
		}
		
		public DomesticStudents(String id, String name,String contact, double rebate){
			super(id,name,contact);
			this.rebate=rebate;
		}
		
		//getter
		public double getRebate(){
			return this.rebate;
		}
		
		//setter method
		public void setRebate(double rebate){
			this.rebate=rebate;
		}
		
		//other method- overriding calculatefees()
		public double calculateFees(){
			double fees;
			
			fees=super.calculateFees()-this.rebate;
			
			return fees;
		}
		public String toString(){
			return "The Name of internation student is "+super.getName()+
					"\nThe id of international student is "+super.getID()+
					"\nThe contact of International student is "+super.getContact()
					+"\nFees of international student is "+this.calculateFees();
		}
}
