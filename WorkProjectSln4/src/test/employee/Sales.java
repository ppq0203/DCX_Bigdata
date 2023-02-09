package test.employee;

public class Sales extends Employee{
	
	private int sales;

	/**
	 * @param no
	 * @param name
	 * @param phone
	 * @param pay
	 * @param sales
	 */
	public Sales(String no, String name, String phone, int pay, int sales) {
		super(no, name, phone, pay);
		this.sales = sales;
	}
	@Override
	public int getMonthlyPay()
	{
//		int payment = 0;
		int bonus = 0;
		bonus = ((sales / 12) * 5) / 100;
//		payment = (pay / 12) + ((sales / 12) * 5) / 100;
		return super.getMonthlyPay()+bonus;
	}
//	
//	public int getPay(int pay, int sales)
//	{
//		int payment = 0;
//		payment = (pay / 12) + ((sales / 12) * 5) / 100;
//		return payment;
//	}
	
//	@Override
//	public String toString() {
//		return getName() + "님의 1월 급여 명세서 \n23년 1월 금 " + getPayment() + "만원";
//	}
}
