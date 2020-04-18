package basics;
//Java Program to illustrate how to define a class and fields  
//Defining a Student class.  
public class Student {
	
	int id;
	String name;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student s1 = new Student();
		s1.id = 101;
		s1.name = "Sonoo";
		System.out.print(s1.id+" ");		//accessing member through reference variable.
		System.out.println(s1.name);
	}

}
