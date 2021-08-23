package Com.ecommerce.beans;

public class User {

	
	private int id;
	private String name;
	private String enamil;
	private String password;
	private String questions;
	private long mobile;
	private String answers;
	private String address;
	private String city;
	private String state;
	private String country;																						
	
	public User() {}

	public User(int id, String name, String enamil, String password, String questions, long mobile, String answers,
			String address, String city, String state, String country) {
		super();
		this.id = id;
		this.name = name;
		this.enamil = enamil;
		this.password = password;
		this.questions = questions;
		this.mobile = mobile;
		this.answers = answers;
		this.address = address;
		this.city = city;
		this.state = state;
		this.country = country;
	}

	public User(String name, String enamil, String password, String questions, long mobile, String answers,
			String address, String city, String state, String country) {
		super();
		this.name = name;
		this.enamil = enamil;
		this.password = password;
		this.questions = questions;
		this.mobile = mobile;
		this.answers = answers;
		this.address = address;
		this.city = city;
		this.state = state;
		this.country = country;
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

	public String getEnamil() {
		return enamil;
	}

	public void setEnamil(String enamil) {
		this.enamil = enamil;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getQuestions() {
		return questions;
	}

	public void setQuestions(String questions) {
		this.questions = questions;
	}

	public long getMobile() {
		return mobile;
	}

	public void setMobile(long mobile) {
		this.mobile = mobile;
	}

	public String getAnswers() {
		return answers;
	}

	public void setAnswers(String answers) {
		this.answers = answers;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}
	
	

}




