package example01;

public class Employee {

    /**
     * 필드 정의
     */
    private String name;        // 이름
    private String phone;       // 전화번호
    private String dept;        // 부서
    private int empNo;          // 사원번호
    private int salary;         // 월급 (정수, 단위: 원)
    private String account;     // 계좌번호
    private String position;    // 직급 (예: "사원", "대리", "과장", "부장")

    /**
     * 생성자 오버로딩
     */
    public Employee(String name, String phone) {
        this.name = name;
        this.phone = phone;
        this.dept = "미정";
        this.empNo = 0;
        this.salary = 0;
        this.account = "";
        this.position = "사원";
    }

    public Employee(String name, String phone, String dept) {
        this.name = name;
        this.phone = phone;
        this.dept = dept;
        this.empNo = 0;
        this.salary = 0;
        this.account = "";
        this.position = "사원";
    }

    public Employee(String name, String phone, String dept, int empNo, int salary, String account, String position) {
        this.salary = salary;
        this.name = name;
        this.dept = dept;
        this.phone = phone;
        this.empNo = empNo;
        this.account = account;
        this.position = position;
    }

    /**
     * 메서드 정의
     */
    // 사원 정보 출력 메서드
    public void printInfo() {
        System.out.print("이름 /" + name + " ");
        System.out.print("전화번호 /" + phone + " ");
        System.out.print("부서 /" + dept + " ");
        System.out.print("사원번호 /" + empNo + " ");
        System.out.print("월급 /" + salary + " ");
        System.out.print("계좌번호 /" + account + " ");
        System.out.println("직급 /" + position + " ");
    }

    // 사원 정보 수정용 메서드(Setter)

    public void setName(String name) {
        this.name = name;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public void setDept(String dept) {
        this.dept = dept;
    }

    public void setEmpNo(int empNo) {
        this.empNo = empNo;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public void setAccount(String account) {
        this.account = account;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    // 사원 정보 출력용 메서드(Getter)


    public String getName() {
        return name;
    }

    public String getPhone() {
        return phone;
    }

    public String getDept() {
        return dept;
    }

    public int getEmpNo() {
        return empNo;
    }

    public int getSalary() {
        return salary;
    }

    public String getAccount() {
        return account;
    }

    public String getPosition() {
        return position;
    }

    // 연봉 계산 메서드(기본)
    public int calcYearSalary() {
        return this.salary * 12;

    }

    // 연봉 + 직급별 보너스를 포함한 연봉(심화)
    public int calcYearSalaryWithBouns() {
        int totalSal = calcYearSalary();
        if (position.equals("사원")) {
            totalSal = (int) (calcYearSalary() * 1.1);
        }
        if (position.equals("대리")) {
            totalSal = (int) (calcYearSalary() * 1.2);
        }
        if (position.equals("과장")) {
            totalSal = (int) (calcYearSalary() * 1.3);
        }
        if (position.equals("부장")) {
            totalSal = (int) (calcYearSalary() * 1.4);
        }

        return totalSal;
    }

    // 승진 메서드
    public void promote() {
        if (position.equals("사원")) {
            this.position = "대리";
            this.salary = (int) (salary * 1.1);
            return;
        }
        if (position.equals("대리")) {
            this.position = "과장";
            this.salary = (int) (salary * 1.1);
            return;

        }
        if (position.equals("과장")) {
            this.position = "부장";
            this.salary = (int) (salary * 1.1);
            return;
        }
        if (position.equals("부장")) {
            this.position = "부장";

        }
    }




}
