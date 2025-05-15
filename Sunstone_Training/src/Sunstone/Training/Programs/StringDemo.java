package Sunstone.Training.Programs;

public class StringDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="Java"; 
		String gtr="Language";
        String s1=str.concat(gtr);
//        System.out.println(s1);
        
//        String c1="Java";  // string pool
//        String c2=new String("Python");  // heap
//        String c3="Java";  //  sp
//        String c4="java";
//        String c5=new String("Python");  // heap
//        String c6=new String("Java");  // string pool
//        System.out.println(c1.equals(c6));
//        System.out.println(c1==c6);
//        
//        System.out.println(c1.equals(c2));
//        System.out.println(c1==c2);
        String t="Delhi";
        String o="Mumbai";
        String k="delhi";
        String y=new String("Mumbai");
        String l=new String("delhi");
        String p=new String("Hello");
        
        System.out.println(o.equals(l));
        System.out.println(o==l);
        
        System.out.println(y.equals(o));
        System.out.println(y==o);
        
        System.out.println(t.equals(o));
        System.out.println(t==o);
        
        System.out.println(k.equals(y));
        System.out.println(k==y);
        
        System.out.println(p.equals(y));
        System.out.println(p==y);
        
        System.out.println(k.equals(l));
        System.out.println(k==l);
	}

}
