package pojo;

public class Student {

	
 private String name;
 private String Stdid;
 private String emailid;
 private String college;
 private String gender;
 private String username;
 private String mobileno;
 private String password;
 
 
 
public Student(String name, String stdid, String emailid, String college, String gender, String username, String mobileno,
		String password) {
	super();
	this.name = name;
	Stdid = stdid;
	this.emailid = emailid;
	this.college = college;
	this.gender = gender;
	this.username = username;
	this.mobileno = mobileno;
	this.password = password;
}





public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getStdid() {
	return Stdid;
}
public void setStdid(String stdid) {
	Stdid = stdid;
}
public String getEmailid() {
	return emailid;
}
public void setEmailid(String emailid) {
	this.emailid = emailid;
}
public String getCollege() {
	return college;
}
public Student() {
	super();
	// TODO Auto-generated constructor stub
}





public void setCollege(String college) {
	this.college = college;
}
public String getGender() {
	return gender;
}
public void setGender(String gender) {
	this.gender = gender;
}
public String getUsername() {
	return username;
}
public void setUsername(String username) {
	this.username = username;
}
public String getMobileno() {
	return mobileno;
}
public void setMobileno(String mobileno) {
	this.mobileno = mobileno;
}
public String getPassword() {
	return password;
}
public void setPassword(String password) {
	this.password = password;
}





@Override
public String toString() {
	return "Student [name=" + name + ", Stdid=" + Stdid + ", emailid=" + emailid + ", college=" + college + ", gender="
			+ gender + ", username=" + username + ", mobileno=" + mobileno + ", password=" + password + "]";
}
 

 
	
	
	
}
