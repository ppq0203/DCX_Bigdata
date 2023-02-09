package test.employee;

public class Sales extends Employee { 
	long sales;// 연 매출
	public Sales(String name, String no, String phone, String dept, int pay) {
		super(name, no, phone, pay);
	}
	@Override
	public String toString() {
		return super.toString() +"\n-----------------------------" + "\n["
				+"]" + getName() + "님의 급여 명세서"+"\n2023년 1월 금 :" + getMonthlyPay()  + "원입니다.";
	}

	public int getMonthlyPay() {
		int bonus = (int) (sales/12 * 0.05);
		return super.getMonthlyPay() + bonus;
	}
	public void setSales(long l) {
		this.sales = l;
	}
}