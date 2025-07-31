
public class Loggertest {

 public static void main(String[]args) {
     Logger logger1 = Logger.instance();
     Logger logger2 = Logger.instance();

     logger1.display();
     logger2.display();

     if(logger1==logger2){
 
         System.out.print("Only one instance used");
     }else{
         System.out.print("Multiple instance");
     }
 }


}
