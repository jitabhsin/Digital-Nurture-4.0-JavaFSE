public class Logger {
        

    public static Logger obj;

    private Logger(){
        System.out.println("Logger initialized");
    }
    public static Logger instance(){
        if(obj==null){
            obj=new Logger();
        }
        return obj;
    } 

    public void display(){
        System.out.println("Logger is working");
    }
}
