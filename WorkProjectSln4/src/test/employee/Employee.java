package test.employee;

public class Employee {
	private String no;
	private String name;
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


	public int getPay() {
		return pay;
	}
	
	public int getMonthlyPay() {
		return pay/12;
	}

	public String getNo() {
		return no;
	}

	public String getName() {
		return name;
	}

	public String getPhone() {
		return phone;
	}
	
	public void setPhone(String phone) {
		this.phone = phone;
	}


	public void setPay(int pay) {
		this.pay = pay;
	}


	public void print() {
		System.out.println(this);
	}
}
