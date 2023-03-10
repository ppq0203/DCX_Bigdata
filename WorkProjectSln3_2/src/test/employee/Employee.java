package test.employee;

public class Employee {
	private String id;
	private String pwd;
	private String no;
	private String name;
	private String level;
	private String phone;
	private int pay;
	
	/**
	 * @param no
	 * @param name
	 * @param phone
	 * @param pay
	 */
	public Employee(String no, String name, String phone, int pay) {
		this.no = no;
		this.name = name;
		this.phone = phone;
		this.pay = pay;
	}
	

	@Override
	public String toString() {
		return name + " 님의 급여 명세서\n23년 1월 금  " + getMonthlyPay() + " 만원";
	}
	public void print() {
		System.out.println(this);
	}

	public int getMonthlyPay() {
		return pay/12;
	}

	public int getPay() {
		return pay;
	}	

	public void setPay(int pay) {
		this.pay = pay;
	}
	
	public String getNo() {
		return no;
	}
	
	public void setNo(String no) {
		this.no = no;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}	
	
	public String getPhone() {
		return phone;
	}
	
	public void setPhone(String phone) {
		this.phone = phone;
	}


	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getPwd() {
		return pwd;
	}

	public void setPwd(String pwd) {
		this.pwd = pwd;
	}

	public String getLevel() {
		return level;
	}

	public void setLevel(String level) {
		this.level = level;
	}


}
