public class Adapter {
  public class paytmadapter implements PaymentProcessor {
        private Adaptee.paytm amt;
   public paytmadapter(Adaptee.paytm paytm) {
            this.amt = paytm;
        }

        @Override
         public void processPayment(double amount) {
            amt.gateway(amount);
        }
    }

    public class phonepeadapter implements PaymentProcessor {
        private Adaptee.phonepe amt;

        public phonepeadapter(Adaptee.phonepe phonepe) {
            this.amt = phonepe;
        }

        @Override
        public void processPayment(double amount) {
            amt.gateway(amount);
        }
    }
}
