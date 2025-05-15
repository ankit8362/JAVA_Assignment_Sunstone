package Sunstone.Training.Programs;

abstract class MNC{
	abstract public void leaves();
	abstract public void holidays();
	public void normal() {
		System.out.println("normal method MNC");
	}
}

abstract class infosys extends MNC{
	abstract public void leaves();
	public void holidays() {
		System.out.println("its holidays from infosys class");
	}
}

class Hello extends infosys{

	@Override
	public void leaves() {
		// TODO Auto-generated method stub
		System.out.println("this is leaves method from the hello class");
	}
	public void normal() {
		// TODO Auto-generated method stub
		System.out.println("this is normal class but in hello class");
	}
	
}


public class abstractExcercise {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MNC obj=new Hello();
		obj.leaves();
		obj.normal();
		
		System.out.println();
		
		infosys obj2=new Hello();
		obj2.holidays();
		obj2.normal();
		obj2.leaves();
	}

}
