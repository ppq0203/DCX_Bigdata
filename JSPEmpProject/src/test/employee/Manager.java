package test.employee;

import java.util.ArrayList;

public class Manager extends Engineer { 
	private ArrayList teamList = new ArrayList();
	private int count;
	public Manager(String name, String no, String phone, String dept, int pay) {
		super(name, no, phone, dept, pay);
	}
	@Override
	public String toString() {
		return "\n-----------------------------" + "\n["+getDept()+"]" + super.toString();
	}

	public int getMonthlyPay() {
		int bonus = 0;
		for (int i = 0; i < count; i++) {
			bonus = (int) (bonus + ((Manager) teamList.get(i)).getMonthlyPay()*0.1);
		}
		return super.getMonthlyPay() + bonus;
	}
	public void addTeam(Employee emp)
	{
		teamList.add(emp);
	}
	public void deleteTeam(Employee emp)
	{
		teamList.remove(emp);
	}
}