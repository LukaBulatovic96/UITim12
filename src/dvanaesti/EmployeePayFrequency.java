package dvanaesti;

import java.io.Serializable;

public class EmployeePayFrequency implements Serializable{
	
	private int payFrequency;
	private double rate;
	private int employeeId;
	private boolean nameStyle;
	private String title;
	private String firstName;
	private String lastName;
	private String middleName;
	
	
	public EmployeePayFrequency(int payFrequency, double rate, int employeeId, boolean nameStyle, String title,
			String firstName, String lastName, String middleName) {
		this.payFrequency = payFrequency;
		this.rate = rate;
		this.employeeId = employeeId;
		this.nameStyle = nameStyle;
		this.title = title;
		this.firstName = firstName;
		this.lastName = lastName;
		this.middleName = middleName;
	}


	public EmployeePayFrequency() {
	}


	public int getPayFrequency() {
		return payFrequency;
	}


	public void setPayFrequency(int payFrequency) {
		this.payFrequency = payFrequency;
	}


	public double getRate() {
		return rate;
	}


	public void setRate(double rate) {
		this.rate = rate;
	}


	public int getEmployeeId() {
		return employeeId;
	}


	public void setEmployeeId(int employeeId) {
		this.employeeId = employeeId;
	}


	public boolean isNameStyle() {
		return nameStyle;
	}


	public void setNameStyle(boolean nameStyle) {
		this.nameStyle = nameStyle;
	}


	public String getTitle() {
		return title;
	}


	public void setTitle(String title) {
		this.title = title;
	}


	public String getFirstName() {
		return firstName;
	}


	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}


	public String getLastName() {
		return lastName;
	}


	public void setLastName(String lastName) {
		this.lastName = lastName;
	}


	public String getMiddleName() {
		return middleName;
	}


	public void setMiddleName(String middleName) {
		this.middleName = middleName;
	}


	@Override
	public String toString() {
		return "EmployeePayFrequency [payFrequency=" + payFrequency + ", rate=" + rate + ", employeeId=" + employeeId
				+ ", nameStyle=" + nameStyle + ", title=" + title + ", firstName=" + firstName + ", lastName="
				+ lastName + ", middleName=" + middleName + "]" + "\n";
	}	

}
