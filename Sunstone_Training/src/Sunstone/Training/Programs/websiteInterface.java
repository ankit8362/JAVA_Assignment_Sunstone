package Sunstone.Training.Programs;

interface Login{
	public void register();
	public void login();
}

interface Cart{
	public void payment();
	public void wallet();
}

interface Logout{
	public void login();
	public void out();
}

interface Dashboard {
	public void register();
	public void profile();
}

interface website extends Login, Logout, Cart, Dashboard{
	
}

class Ecommerce implements website{

	@Override
	public void profile() {
		System.out.println("Profile module");
		
	}

	@Override
	public void out() {
		System.out.println("out module");
		
	}

	@Override
	public void payment() {
		System.out.println("payment module");
		
	}

	@Override
	public void wallet() {
		System.out.println("wallet module");
		
	}

	@Override
	public void register() {
		System.out.println("register module");
		
	}

	@Override
	public void login() {
		System.out.println("Login Module");
		
	}
	
}

public class websiteInterface {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Login obj=new Ecommerce();
		obj.login();
		obj.register();

	}

}
