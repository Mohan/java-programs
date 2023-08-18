abstract class emp{
    abstract void m1();


}
class emps extends emp{
    void m1(){
        System.out.println("m1 method");
    }
    public static void main(String[] args){
        emps a=new emps();
        a.m1();
    }
}