import java.time.LocalDate;
import java.time.Month;
import java.util.*;
import java.util.Date;

class Student  {
    private String id;
    private String name;
    private Date dob;
    private String gender;
    static ArrayList<Student > list;
    
    public Student (String id, String name, Date dob, String gender) {
		super();
		this.id = id;
		this.name = name;
		this.dob = dob;
		this.gender = gender;
	}
    
    public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public Date getDob() {
		return dob;
	}
	public void setDob(Date dob) {
		this.dob = dob;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
}
