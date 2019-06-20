package bo;

import java.util.Date;

public class ClientJ7 {
	private String name;
	private String firstName;
	private Date adhesion;
	
	public ClientJ7() {
		super();
	}

	public ClientJ7(String name, String firstName, Date adhesion) {
		super();
		this.name = name;
		this.firstName = firstName;
		this.adhesion = adhesion;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public Date getAdhesion() {
		return adhesion;
	}

	public void setAdhesion(Date adhesion) {
		this.adhesion = adhesion;
	}

	@Override
	public String toString() {
		return name + " " + firstName + ", " + adhesion;
	}
	
	
}
