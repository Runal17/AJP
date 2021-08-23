package dto.pojo;



public class User {

private int id;
private String name;
private  String username;
private String password;
private int rank;


public User() {
	super();
}

public User(String name, String username, String password, int rank) {
	super();
	this.name = name;
	this.username = username;
	this.password = password;
	this.rank = rank;
}

public User(int id,String name, String username, String password, int rank) {
	super();
	this.name = name;
	this.username = username;
	this.password = password;
	this.rank = rank;
}



public User(String username, String password) {
	super();
	this.username = username;
	this.password = password;
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

public String getUsername() {
	return username;
}

public void setUsername(String username) {
	this.username = username;
}

public String getPassword() {
	return password;
}

public void setPassword(String password) {
	this.password = password;
}

public int getRank() {
	return rank;
}

public void setRank(int rank) {
	this.rank = rank;
}

@Override
public String toString() {
	return "User [id=" + id + ", name=" + name + ", username=" + username + ", password=" + password + ", rank=" + rank
			+ "]";
}



	
}
