package bo;

import java.time.LocalDate;

public class ClientJ8 {
	private String name;
	private String firstName;
	private LocalDate adhesion;
	
	public ClientJ8() {
		super();
	}

	public ClientJ8(String name, String firstName, LocalDate localDate) {
		super();
		this.name = name;
		this.firstName = firstName;
		this.adhesion = localDate;
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

	public LocalDate getAdhesion() {
		return adhesion;
	}

	public void setBirthDate(LocalDate adhesion) {
		this.adhesion = adhesion;
	}

	@Override
	public String toString() {
		return name + " " + firstName + ", " + adhesion;
	}
	
	
}
