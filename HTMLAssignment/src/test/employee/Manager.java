package test.employee;

import java.util.ArrayList;
import java.util.List;

public class Manager extends Engineer{
	private List<Employee> team;
	/**
	 * @param no
	 * @param name
	 * @param phone
	 * @param pay
	 * @param dept
	 * @param team
	 */
	public Manager(String no, String name, String phone, int pay, String dept, List<Employee> team) {
		super(no, name, phone, pay, dept);
		this.setTeam(team);
	}
	
	public Manager(String no, String name, String phone, String dept, List<Employee> team) {
		this(no, name, phone, 10000, dept, team);
	}
	
	@Override
	public int getMonthlyPay()
	{
		int bonus = 0;
		for(Employee em : team)
			if (em != null)
				bonus += em.getMonthlyPay()/10;
		return super.getMonthlyPay()+bonus;
	}
	
//	public String getDept() {
//		return dept;
//	}
	public List<Employee> getTeam() {
		return team;
	}
	
//	public void setDept(String dept) {
//		this.dept = dept;
//	}
	public void setTeam(List<Employee> team) {
		this.team = new ArrayList<Employee>();
		
		for(Employee em : team)
		{
			if (em instanceof Engineer && ((Engineer)em).getDept().equals(getDept()) )
			{
				this.team.add(em);
			}
		}
	}
	
	public void addTeam(Employee emp)
	{
		team.add(emp);
	}
	
	public void removeTeam(Employee emp)
	{
		team.remove(emp);
	}
}
