package inheritance;

public class TestClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//testing calculatefees method
		InternationalStudents IS1= new InternationalStudents("67536","john","863982","india",2400.50);
		InternationalStudents IS2= new InternationalStudents();
		InternationalStudents IS3= new InternationalStudents("india",2387.65);
		
		Student s1=new Student();
		
		System.out.println(s1.toString());
		
		Student s2=new Student("273587","marrie","8737876419");
		
		DomesticStudents d1=new DomesticStudents();
		DomesticStudents d2=new DomesticStudents("82389","daniel","7269721",3498);
		
		System.out.println(" International Students details");
		System.out.println(IS1.toString());
		
		IS2.setName("Charlie");
		IS2.setContact("726749");
		IS2.setID("k27382");

		
		
		System.out.println();
		System.out.println(IS2.toString());
		System.out.println();
		System.out.println(IS3.toString());
		
		
		

		
		
		
		
		
	}

}
