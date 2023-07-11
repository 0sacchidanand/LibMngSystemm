package pkg_transaction;

public class BookTransaction {
	private int isbn;
	private int rollNo;
	
	private String issuedate;
	private String returndate;
	public int getIsbn() {
		return isbn;
	}
	public void setIsbn(int isbn) {
		this.isbn = isbn;
	}
	public int getRollNo() {
		return rollNo;
	}
	public void setRollNo(int rollNo) {
		this.rollNo = rollNo;
	}
	public String getIssuedate() {
		return issuedate;
	}
	public void setIssuedate(String issuedate) {
		this.issuedate = issuedate;
	}
	public String getReturndate() {
		return returndate;
	}
	public void setReturndate(String returndate) {
		this.returndate = returndate;
	}
	public BookTransaction(int isbn, int rollNo, String issuedate, String returndate) {
		super();
		this.isbn = isbn;
		this.rollNo = rollNo;
		this.issuedate = issuedate;
		this.returndate = returndate;
	}
	public BookTransaction() {
		super();
	}
	@Override
	public String toString() {
		return "BookTransaction [isbn=" + isbn + ", rollNo=" + rollNo + ", issuedate=" + issuedate + ", returndate="
				+ returndate + "]";
	}
	
	
}
