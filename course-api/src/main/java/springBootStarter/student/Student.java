package springBootStarter.student;

public class Student {

	String id;
	private String name;
	private int rollno;
	private String address;
	
	public Student(String id,String name, int rollno, String address) {
		super();
		this.id=id;
		this.name = name;
		this.rollno = rollno;
		this.address = address;
		
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getRollno() {
		return rollno;
	}
	public void setRollno(int rollno) {
		this.rollno = rollno;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	
}
