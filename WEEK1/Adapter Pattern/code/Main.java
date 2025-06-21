public class Main {
    public static void main(String[] args) {
        
        Adaptee adaptee = new Adaptee();
         Adaptee.paytm paytmGateway = adaptee.new paytm();
        Adaptee.phonepe phonepeGateway = adaptee.new phonepe();
         Adapter adapter = new Adapter();
         Adapter.paytmadapter paytmAdapter = adapter.new paytmadapter(paytmGateway);
        Adapter.phonepeadapter phonepeAdapter = adapter.new phonepeadapter(phonepeGateway);

        paytmAdapter.processPayment(678.00);
        phonepeAdapter.processPayment(74567.50);
    }
}
