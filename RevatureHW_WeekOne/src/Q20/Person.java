package Q20;

import java.io.Serializable;

public class Person implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 89246723L;

	
	private String Fname="";
	private String Lname="";
	private int age=0;
	private String state = "Virginia";
	
	public Person() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public Person(String Fname, String Lname, int age, String state) {
		super();
		this.Fname = Fname;
		this.Lname = Lname;
		this.age = age;
		this.state = state;
	}

	public String getFname() {
		return Fname;
	}

	public void setFname(String fname) {
		Fname = fname;
	}

	public String getLname() {
		return Lname;
	}

	public void setLname(String lname) {
		Lname = lname;
	}
	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	@Override
	public String toString() {
		return "Person [Fname=" + Fname + ", Lname=" + Lname + ", age=" + age + ", state=" + state + "]";
	}

	

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((Fname == null) ? 0 : Fname.hashCode());
		result = prime * result + ((Lname == null) ? 0 : Lname.hashCode());
		result = prime * result + age;
		result = prime * result + ((state == null) ? 0 : state.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Person other = (Person) obj;
		if (Fname == null) {
			if (other.Fname != null)
				return false;
		} else if (!Fname.equals(other.Fname))
			return false;
		if (Lname == null) {
			if (other.Lname != null)
				return false;
		} else if (!Lname.equals(other.Lname))
			return false;
		if (age != other.age)
			return false;
		if (state == null) {
			if (other.state != null)
				return false;
		} else if (!state.equals(other.state))
			return false;
		return true;
	}

}
