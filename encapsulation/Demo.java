class demo{
    public static void main(String[] args){
        Account a=new Account();
        a.set_minbal(500);
        int bal=a.get_minbal();
        System.out.println(bal);
    }
}