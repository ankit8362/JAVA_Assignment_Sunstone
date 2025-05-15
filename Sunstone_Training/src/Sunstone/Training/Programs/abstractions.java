package Sunstone.Training.Programs;

abstract class Customer{
	Customer(){
		System.out.println("This is construction Customer class");
	}
	public void details() {
		System.out.println("this is non abstract class");
	}
	abstract public void purchase();
	abstract public void sell();
}
abstract class emp extends Customer{

	@Override
	abstract public void purchase();
	abstract public void sell(); 
	abstract public void leaves();
	
}

abstract class retailer extends Customer{

	@Override
	abstract public void purchase();

	@Override
	public void sell() {
		// TODO Auto-generated method stub
		System.out.println("retailer");
		
	}
}
class person extends retailer{

	@Override
	public void purchase() {
		// TODO Auto-generated method stub
		System.out.println("purchase");
	}	
}

class sample extends emp{

	@Override
	public void purchase() {
		// TODO Auto-generated method stub
		System.out.println("purchase from sample class");
		
	}

	@Override
	public void sell() {
		// TODO Auto-generated method stub
		System.out.println("sell from sample class");
		
	}

	@Override
	public void leaves() {
		// TODO Auto-generated method stub
		System.out.println("leave from the leave class");
		
	}
	
}
public class abstractions {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Customer cust =new person();
        cust.purchase();
        cust.sell();
        
        emp cust2=new sample();
        cust2.purchase();
        cust2.sell();
        cust2.leaves();
        
	}

}
