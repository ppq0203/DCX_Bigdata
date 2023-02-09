package test.employee;

import java.util.ArrayList;
import java.util.List;

public class Main {

	public static void main(String[] args) {		
		List<Employee> allEmList = new ArrayList<Employee>();
//		Employee[] allEmList = new Employee[10];
		for(int i = 0; i < 6; ++i)
		{
			allEmList.add(new Engineer("no_e"+i, "e"+i, "e"+i+"-000-000", 5000, "p"+(i<4?0:1)));
		}
		
		for(int i = 0; i < 2; ++i)
		{
			allEmList.add(new Manager("no_m"+i, "m"+i, "m"+i+"-000-000", "p"+i, allEmList));
		}

		for(int i = 0; i < 2;++i)
		{
			allEmList.add(new Sales("no_s"+i, "s"+i, "s"+i+"-000-000", 4000, 1000000-200000*i));			
		}
//		allEmList[i++] = new Engineer("no_e1", "e1", "e1-000-000", 5000, "p1");
//		allEmList[i++] = new Engineer("no_e2", "e2", "e2-000-000", 5000, "p1");
//		allEmList[i++] = new Engineer("no_e3", "e3", "e3-000-000", 5000, "p1");
//		allEmList[i++] = new Engineer("no_e4", "e4", "e4-000-000", 5000, "p1");
//		allEmList[i++] = new Engineer("no_e5", "e5", "e5-000-000", 5000, "p2");
//		allEmList[i++] = new Engineer("no_e6", "e6", "e6-000-000", 5000, "p2");
//		allEmList[i++] = new Manager("no_m1", "m1", "m1-000-000", "p1", allEmList);
//		allEmList[i++] = new Manager("no_m2", "m2", "m2-000-000", "p2", allEmList);
//		allEmList[i++] = new Sales("no_s1", "s1", "s1-000-000", 4000, 1000000);
//		allEmList[i++] = new Sales("no_s2", "s2", "s2-000-000", 4000, 800000);
		
//		for(i = 0; i <10; i++)
//		{
////			System.out.println(allEmList[i].getPay());
//			allEmList[i].print();
//			System.out.println();
//		}
		for(Employee e: allEmList)
		{
//			System.out.println(allEmList[i].getPay());
			e.print();
			System.out.println();
		}
//		System.out.println(allEmList[6].getNo());
//		System.out.println(allEmList[6].getPay());
//		System.out.println(allEmList[6].getPhone());
//		System.out.println(allEmList[6].getName());
//		System.out.println(((Manager)allEmList[6]).getDept());
//		System.out.println(((Manager)allEmList.get(6)).getTeam());

//		Employee emp1 = new Employee("no_emp1", "emp1", "emp1-000-000", 5000);
//		emp1.print();
	}
}
