package tech.javapackes;

public class Lecturer {                                                              

	private int id;
	private String name;
	private String email;
	private long   phonenumber;
	public Lecturer() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Lecturer(int id, String name, String email, long phonenumber) {
		super();
		this.id = id;
		this.name = name;
		this.email = email;
		this.phonenumber = phonenumber;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public long getPhonenumber() {
		return phonenumber;
	}
	public void setPhonenumber(long phonenumber) {
		this.phonenumber = phonenumber;
	}
	
	
}
