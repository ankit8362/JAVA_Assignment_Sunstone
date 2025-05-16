package Assignments;

abstract class Mark{
	abstract int calculatePercentage();
}
class A extends Mark{
	int sub1;
	int sub2;
	int sub3;
	A(int sub1,int sub2,int sub3){
		this.sub1=sub1;
		this.sub2=sub2;
		this.sub3=sub3;
	}
	public int calculatePercentage(){
		return (sub1+sub2+sub3)/3;
		
	}
}
class B extends Mark{
	int sub1;
	int sub2;
	int sub3;
	int sub4;
	B(int sub1,int sub2,int sub3,int sub4){
		this.sub1=sub1;
		this.sub2=sub2;
		this.sub3=sub3;
		this.sub4=sub4;
	}
    public int calculatePercentage(){
    	return (sub1+sub2+sub3+sub4)/4;
		
	}
}
public class Assignment4 {
	public static void main(String[] args) {
		A obj1=new A(70,85,65);
		int studnet1=obj1.calculatePercentage();
		System.out.println("The percentage of the First student is "+studnet1);
		
		B obj2=new B(56,78,95,45);
		int student2=obj2.calculatePercentage();
		System.out.println("The percentage of the Seconed student is "+student2);
	}

}
