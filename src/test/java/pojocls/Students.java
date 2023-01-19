package pojocls;

public class Students {
	  String name;
	  String age;
	  String[] phoneno;
	  public Students(String name,String age,String[] phoneno) {
		  this.name=name;
		  this.age=age;
		  this.phoneno=phoneno;
	  }
	  public Students() {}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAge() {
		return age;
	}
	public void setAge(String age) {
		this.age = age;
	}
	public String getPhoneno(int i) {
		return phoneno[i];
	}
	public void setPhoneno(String[] phoneno) {
		this.phoneno = phoneno;
	}
	}
