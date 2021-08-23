package dto.pojo;



public class Hero {

	private String name;
	private String type;
	private String attr;
	private String ulti;
	
	
	public Hero() {}


	public Hero(String type, String attr, String ulti) {
		super();
		this.type = type;
		this.attr = attr;
		this.ulti = ulti;
	}


	public Hero(String name, String type, String attr, String ulti) {
		super();
		this.name = name;
		this.type = type;
		this.attr = attr;
		this.ulti = ulti;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getType() {
		return type;
	}


	public void setType(String type) {
		this.type = type;
	}


	public String getAttr() {
		return attr;
	}


	public void setAttr(String attr) {
		this.attr = attr;
	}


	public String getUlti() {
		return ulti;
	}


	public void setUlti(String ulti) {
		this.ulti = ulti;
	}


	@Override
	public String toString() {
		return "Hero [name=" + name + ", type=" + type + ", attr=" + attr + ", ulti=" + ulti + "]";
	}
	
	
	
}
