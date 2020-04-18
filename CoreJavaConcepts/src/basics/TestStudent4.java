package basics;

//Object and Class Example: Initialization through method
public class TestStudent4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student1 s1 = new Student1();
		Student1 s2 = new Student1();
		
		s1.insertRecord(101, "Karan");
		s2.insertRecord(102, "Arjun");
		
		s1.display();
		s2.display();
	}

}
