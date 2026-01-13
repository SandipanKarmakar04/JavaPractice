package Encapsulation;

class Employee {
    private int empId;

    public int getEmpId() {
        return empId;
    }

    public void setEmpId(int empId) {
        this.empId = empId;
    }
}

public class EncapsulationPractice {
    public static void main(String[] args) {
        Employee emp = new Employee();
        emp.setEmpId(10101);
        System.out.println(emp.getEmpId());
    }

}
