interface logindata{
    void login();
    void logout();
}
class loginimp implements logindata{
    public void login(){
        System.out.println("succesfully login");
    }
    public void logout(){
        System.out.println("succesfully logout");
    }
    public static void main(String[] args){
        loginimp b=new loginimp();
        b.login();
        b.logout();
    }
}
