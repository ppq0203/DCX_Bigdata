package test.employee;

public class Employee {
	private String name;
	public String getTitle() {
		return title;
	}
	public String getPosition() {
		return position;
	}
	public String getComment() {
		return comment;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public void setPosition(String position) {
		this.position = position;
	}
	public void setComment(String comment) {
		this.comment = comment;
	}
	private String no;
	private String phone;
	private String title;
	private String position;
	private String hobby;
	public String getHobby() {
		return hobby;
	}
	public void setHobby(String hobby) {
		this.hobby = hobby;
	}
	private String comment;
	private int pay; //연봉
	public String getName() {
		return name;
	}
	public String getNo() {
		return no;
	}
	public String getPhone() {
		return phone;
	}
	/**
	 * 기본 생성자는 아무 생성자가 없을 경우는 자동 생성
	 * 하지만, 다른 생성자가 존재할 경우 생성되지 않음
	 * ※생성자를 만들 경우 꼭!!! 기본생성자(인자가 없는)를 만들어야 함
	 */
	public Employee() {
	}
	public Employee(String name, String no, String phone, int pay) {
		this.name = name;
		this.no = no;
		this.phone = phone;
		this.pay = pay;
	}
	public int getPay() {
		return pay;
	}
	public int getMonthlyPay() {
		return pay/12;
	}
	@Override
	public String toString() {
		return name + "님의 급여 명세서"+"\n2023년 1월 급여 금 :" + getMonthlyPay()  + "원입니다.";
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setNo(String no) {
		this.no = no;
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
