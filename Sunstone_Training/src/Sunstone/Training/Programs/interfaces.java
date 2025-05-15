package Sunstone.Training.Programs;
interface sampleA{
	int price=450;
	String name="Ankit Mishra";
}

interface sampleB{
	int price=675;
	String name="Ajay";
	void area();
	void display();
}

interface c extends sampleA,sampleB{
	
}

class demo implements c{
     int price=789;
	@Override
	public void area() {
		// TODO Auto-generated method stub
		System.out.println("this is Area method");
		
	}

	@Override
	public void display() {
		// TODO Auto-generated method stub
		System.out.println("this is a display method");
		
	}	
	public void calculate() {
		// TODO Auto-generated method stub
		System.out.println("this is a calculate method");
		
	}
}
public class interfaces {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		demo obj=new demo();
		obj.display();
		obj.area();
		obj.calculate();
		System.out.println("demo price: "+obj.price);
		
		sampleB sample=new demo();
		System.out.println("sampleB price: "+sample.price);

	}

}
