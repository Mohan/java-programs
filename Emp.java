class Emp{
    static int a=100;
    int b=10;
    
    public static void main(String[] args){
        int c=200;
        Emp t1=new Emp();
        System.out.println(t1.b);
        System.out.println(a);
        t1.b=350;
        System.out.println(t1.b);
            
    }
}