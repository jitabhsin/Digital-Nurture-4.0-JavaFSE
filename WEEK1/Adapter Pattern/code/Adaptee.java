public class Adaptee {
    //GATEWAY


class paytm {
    public void gateway(double amount) {
        System.out.println("Payment done using paytm " + amount);
    }
}

class phonepe {
    public void gateway(double amount) {
        System.out.println("Payment done using phonepe " + amount);
    }
}
}