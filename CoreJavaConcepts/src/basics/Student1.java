package basics;

public class Student1 {
	
	int rollno;
	String name;
	
	public void insertRecord(int r, String n)	{
		rollno = r;
		name = n;
	}
	
	public void display()	{
		System.out.println(rollno+" "+name);
	}
	
}
