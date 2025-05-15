package Sunstone.Training.Programs;

class product{
	int id;
	String name;
	product(int id,String name){
		this.id=id;
		this.name=name;
	}
	public void display() {
		System.out.println("id is: "+id+" name is: "+name);
	}	
}
class ChildA extends product{
	int count;
	String category;
	ChildA(int id,String name,int count,String category){
		super(id,name);
		this.count=count;
		this.category=category;
	}
	public void display() {
		System.out.println("id is: "+id+" name is: "+name);
		System.out.println("count is: "+count+" category is: "+category);
	}
}
// this is B
class B extends product{
	int count;
	String category;
	B(int id,String name,int count,String category){
		super(id,name);
		this.count=count;
		this.category=category;
	}
	public void display() {
		System.out.println("id is: "+id+" name is: "+name);
		System.out.println("count is: "+count+" category is: "+category);
	}
}

public class inheritenceExcercise {
	public static void main(String[] args) {
		ChildA obj=new ChildA(70,"Ankit",50,"butter");
		obj.display();
		B obj2=new B(5,"Ankit",90,"milk");
		obj2.display();

	}

}
