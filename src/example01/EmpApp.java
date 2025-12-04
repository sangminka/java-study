package example01;

public class EmpApp {

    static void paySalary(Employee e) {
        // 예시 출력

        System.out.println(e.getName() + "님께" + e.getSalary()+ "원이" + e.getAccount() +"계좌로 지급되었습니다.");
        // [급여 이체 완료] 홍길동님께 3000000원이 123-456-7890 계좌로 지급되었습니다.
    }
    public static void main(String[] args) {
        Employee[] empArr = new Employee[10];  // 최대 10명
        int count = 0;
        int monthSal = 0;
        int totalSal = 0;
        int totalSalWithBonus= 0;


        // 사원 등록하기
        if (count < 10){
            empArr[count] = new Employee("홍길0","010-1111-0000");
            count++;
        }else {
            System.out.println("불가능");
        }
        if (count < 10){
            empArr[count] = new Employee("홍길1","010-1111-0001");
            count++;
        }else {
            System.out.println("불가능");
        }
        if (count < 10){
            empArr[count] = new Employee("홍길2","010-1111-0002");
            count++;
        }else {
            System.out.println("불가능");
        }
        if (count < 10){
            empArr[count] = new Employee("홍길3","010-1111-0003","개발팀");
            count++;
        }else {
            System.out.println("불가능");
        }
        if (count < 10){
            empArr[count] = new Employee("홍길4","010-1111-0004","행정팀");
            count++;
        }else {
            System.out.println("불가능");
        }
        if (count < 10){
            empArr[count] = new Employee("홍길5","010-1111-0005","인사팀");
            count++;
        }else {
            System.out.println("불가능");
        }
        if (count < 10){
            empArr[count] = new Employee("홍길6","010-1111-0006","개발팀",1001,3000000,"221-0000-0000-01","대리");
            count++;
        }else {
            System.out.println("불가능");
        }
        if (count < 10){
            empArr[count] = new Employee("홍길7","010-1111-0007","행정팀",1002,3000000,"221-0000-0000-02","대리");
            count++;
        }else {
            System.out.println("불가능");
        }
        if (count < 10){
            empArr[count] = new Employee("홍길8","010-1111-0008","인사팀",1003,3000000,"221-0000-0000-03","과장");
            count++;
        }else {
            System.out.println("불가능");
        }
        if (count < 10){
            empArr[count] = new Employee("홍길9","010-1111-0009","개발팀",1004,3000000,"221-0000-0000-04","과장");
            count++;
        }else {
            System.out.println("불가능");
        }
        if (count < 10){
            empArr[count] = new Employee("홍길10","010-1111-0010","개발팀",1005,3000000,"221-0000-0000-01","부장");
            count++;
        }else {
            System.out.println("불가능");
        }
        System.out.println(count);

        // 전체 사원수 변수가 10 이상일때 전체 사원수를 10으로
        if(count >= 10){
            count = 9;
        }
        System.out.println(count);
        
        // setter 목적 상태변경 (생성자의목적 초기화)
        empArr[0].setDept("개발0");
        empArr[0].setEmpNo(1005);
        empArr[0].setSalary(2500000);
        empArr[0].setAccount("221-0000-0000-05");

        empArr[1].setDept("개발1");
        empArr[1].setEmpNo(1006);
        empArr[1].setSalary(2500000);
        empArr[1].setAccount("221-0000-0000-06");

        empArr[2].setDept("개발2");
        empArr[2].setEmpNo(1007);
        empArr[2].setSalary(2500000);
        empArr[2].setAccount("221-0000-0000-07");

        empArr[3].setEmpNo(1008);
        empArr[3].setSalary(2500000);
        empArr[3].setAccount("221-0000-0000-08");

        empArr[4].setEmpNo(1009);
        empArr[4].setSalary(2500000);
        empArr[4].setAccount("221-0000-0000-09");

        empArr[5].setEmpNo(1010);
        empArr[5].setSalary(2500000);
        empArr[5].setAccount("221-0000-0000-10");



        //전체 사원 목록 출력하기
        for (int i = 0; i <= count; i++) {
            empArr[i].printInfo();
        }

        // 이번 달 전체 월급 합계
        for (int i = 0; i <= count ; i++) {
            monthSal=monthSal + empArr[i].getSalary();
        }
        System.out.println("이번 달 회사가 지급해야하는 월급 총액" + monthSal);
        
        // 전체 연봉 합계
        for (int i = 0; i <= count ; i++) {
            totalSal=totalSal + empArr[i].calcYearSalary();
        }
        System.out.println("1년동안 회사가 지급해야하는 기본 연봉 총액" + totalSal);

        //보너스를 포함한 전체 연봉 합계
        for (int i = 0; i <= count ; i++) {
            totalSalWithBonus=totalSalWithBonus + empArr[i].calcYearSalaryWithBouns();
        }
        System.out.println("1년동안 회사가 지급해야하는 기본 연봉 총액" + totalSalWithBonus);

        // 특정 사원 승진 시키기 empNo 1001 승진
        for (int i = 0; i <= count; i++) {
            if (empArr[i].getEmpNo() == 1001 ){
                empArr[i].printInfo();
                empArr[i].promote();
                empArr[i].printInfo();

            }
        }

        // 월급 이체 시뮬레이션

        for (int i = 0; i <= count; i++) {
            EmpApp.paySalary(empArr[i]);
        }














    }
}