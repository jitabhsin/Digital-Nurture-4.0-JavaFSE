public class Forecast {

    public static void main(String[] args) {
        int yr = 7;
        double r = 7.075;
        double amt = 757575;

         double val = recur(yr, r, amt);

  System.out.println("Financial Forecasted Value is " + val);
    }

    public static double recur(int yr, double r, double amt) {
        if (yr == 0) {
            return amt;
        } else {
            double intr = (amt * r) / 100;
            amt += intr;
            return recur(yr - 1, r, amt);
        }
    }
}
