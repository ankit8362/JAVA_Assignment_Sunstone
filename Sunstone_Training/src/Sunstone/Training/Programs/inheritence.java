package Sunstone.Training.Programs;
class employee{
	int empId;
	String name;
	float salary;
	
	employee(int empId, String name,float salary){
		this.empId=empId;
		this.name=name;
		this.salary=salary;
	}
	public void display() {
		System.out.println("Employee Id are: "+empId);
		System.out.println("Employee name are: "+name);
		System.out.println("Employee salary are: "+salary);
	}
}
class subEmployee extends employee{
//	super(100,"Ankit",15500.50f);
	int bonus;
	subEmployee(int empId, String name,float salary,int bonus){
		super(empId,name,salary);
		this.bonus=bonus;
	}
	public void calculate() {
		float finSal=salary+(bonus*salary)/100;
		System.out.println("Final Slary is: "+finSal);
	}
}

class tempEmp extends subEmployee{
	int duration;
	tempEmp(int empId,String name,float salary,int bonus,int duration){
		super(empId,name,salary,bonus);
		this.duration=duration;
	}
	public void duration() {
		System.out.println("Duration is: "+duration);
	}
}

class permanentEmp extends subEmployee{
	int duration;
	permanentEmp(int empId,String name,float salary,int bonus,int duration){
		super(empId,name,salary,bonus);
		this.duration=duration;
	}
	public void duration() {
		System.out.println("Duration is: "+duration);
	}
}

public class inheritence {
   public static void main(String[] args) {
	   tempEmp obj=new tempEmp(100,"Ankit",15500.50f,150,50);
	   obj.calculate();
	   obj.display();
	   obj.duration();
	   
	   System.out.println();
	   
	   permanentEmp obj2=new permanentEmp(150,"Ankit Mishra",22233.50f,200,150);
	   obj2.calculate();
	   obj2.display();
	   obj2.duration();
   }
}
