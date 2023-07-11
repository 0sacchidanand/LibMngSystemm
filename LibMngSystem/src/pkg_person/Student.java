package pkg_person;

public class Student extends Person {
	private int rollNo;
	private int std;
	private String devision;
	public int getRollNo() {
		return rollNo;
	}
	public void setRollNo(int rollNo) {
		this.rollNo = rollNo;
	}
	public int getStd() {
		return std;
	}
	public void setStd(int std) {
		this.std = std;
	}
	public String getDevision() {
		return devision;
	}
	public void setDevision(String devision) {
		this.devision = devision;
	}
	public Student(String name, String emailId, String phoneNumber, String address, String dob, int rollNo, int std,
			String devision) {
		super(name, emailId, phoneNumber, address, dob);
		this.rollNo = rollNo;
		this.std = std;
		this.devision = devision;
	}
	public Student() {
		super();
	}
	@Override
	public String toString() {
		return "Student [rollNo=" + rollNo + ", std=" + std + ", devision=" + devision + ", name=" + name + ", emailId="
				+ emailId + ", phoneNumber=" + phoneNumber + ", address=" + address + ", dob=" + dob + "]";
	}
	
	
	

}
