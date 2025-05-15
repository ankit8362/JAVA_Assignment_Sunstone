package Sunstone.Training.Programs;

class Bank{
	float roi=2.4f;
	void print() {
		System.out.println("the Roi of the parents is "+roi);
	}
}

class SBI extends Bank{
	float roi=5.6f;
	void print() {
		System.out.println("the ROI of SBI is "+roi);
	}
}
class ICIC extends Bank{
	float roi=10.05f;
	void print() {
		System.out.println("the ROI of ICIC is "+roi);
	}
}

class Axis extends Bank{
	float roi=10.05f;
	void print() {
		System.out.println("the ROI of ICIC is "+roi);
	}
}
public class polyBank {
  public static void main(String []args) {
	  Bank b;
	  b=new ICIC();
	  b.print();
	  b=new SBI(); // 1 object perform multiple class
	  b.print();
	  b=new Axis();
	  b.print();
  }
}
