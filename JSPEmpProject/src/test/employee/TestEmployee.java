package test.employee;

public class TestEmployee {

	public static void main(String[] args) {
		Employee[] empList = new Employee[10];
		empList[0] = new Manager ("첫째관리직", "03", "010-3333-3333", "매니저", 100000000);
		empList[1] = new Sales ("첫번째영업직", "01", "010-1111-1111", "세일즈", 40000000);
		empList[2] = new Engineer ("첫째개발자", "05", "010-5555-5555", "엔지니어", 50000000);
		empList[3] = new Engineer ("둘째개발자", "06", "010-6666-6666", "엔지니어", 50000000);
		empList[4] = new Engineer ("셋째개발자", "07", "010-7777-7777", "엔지니어", 50000000);
		empList[5] = new Engineer ("넷째개발자", "08", "010-8888-8888", "엔지니어", 50000000);
		empList[6] = new Engineer ("다섯째개발자", "09", "010-9999-9999", "엔지니어", 50000000);
		empList[7] = new Manager ("둘째관리직", "04", "010-4444-4444", "매니저", 100000000);
		empList[8] = new Engineer ("여섯째개발자", "00", "010-0000-0000", "엔지니어", 50000000);
		empList[9] = new Sales ("두번째영업직", "02", "010-2222-2222", "세일즈", 40000000);
		
		// 매니저에 팀원 추가

		Manager manager = (Manager) empList[7];
		manager.addTeam(empList[2]);
		manager.addTeam(empList[5]);
		manager.addTeam(empList[8]);
		// 매출이 발생, 실적 발생
		// 첫번째영업직 = 100억, 두번째영업직 = 80억
		for (Employee employee : empList) {
			if(employee instanceof Sales)
			{
				Sales sales = (Sales) employee;
				sales.setSales(10000000000L);
			}
		}
		for (Employee employee : empList) {
			employee.print();
		}
	}
}
