package test.employee;

public class Engineer extends Employee { 
	private String dept;
	public Engineer(String name, String no, String phone, String dept, int pay) {
		super(name, no, phone, pay);
		this.dept = dept;
	}
	public String getDept() {
		return dept;
	}
	@Override
	public String toString() {
		return "\n-----------------------------" + "\n["
				+ getDept()+"]" + super.toString();
	}
	public void setDept(String dept) {
		this.dept = dept;
	}
}




