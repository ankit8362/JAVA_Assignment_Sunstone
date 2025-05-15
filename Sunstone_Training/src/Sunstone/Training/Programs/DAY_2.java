package Sunstone.Training.Programs;

class A{
	private int empId;
    private String name;
    
    public void setEmp(int empId) {
    	this.empId=empId;
    }
    public int getEmp() {
    	return this.empId;
    }
    public void setName(String name) {
    	this.name=name;
    }
    public String getName() {
    	return this.name;
    }
}
public class DAY_2 { 
	public static void main(String[] args) {
		A obj =new A();
		obj.setEmp(7);
		System.out.println(obj.getEmp());
		obj.setName("ankit");
		System.out.println(obj.getName());
	}
}
