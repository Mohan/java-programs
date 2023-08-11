public class inheritance{
	void m1(){
	System.out.println("m1 method");
}
	void m2(){
	System.out.println("m2 method");
}
}
class child extends inheritance{
	void m3(){
	System.out.println("m3 method");
}
	public static void main(String[] args){
		child a=new child();
		a.m1();
		a.m2();
		a.m3();
}
}