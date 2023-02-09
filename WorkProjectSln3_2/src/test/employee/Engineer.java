package test.employee;

public class Engineer extends Employee{
	private String dept;
	
//	@Override
//	public String toString() {
//		return getName() + " 님의 급여 명세서\n23년 1월 금  " + getMonthlyPay() + " 만원";
//	}

	/**
	 * @param no
	 * @param name
	 * @param phone
	 * @param pay
	 * @param dept
	 */
	public Engineer(String no, String name, String phone, int pay, String dept) {
		super(no, name, phone, pay);
		this.dept = dept;
	}

//	@Override
//	public int getPay()
//	{
//		int pay = super.getPay()/12;
//		return pay;
//	}

	public String getDept() {
		return dept;
	}

	public void setDept(String dept) {
		this.dept = dept;
	}


}
