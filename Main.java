public class Main {
    public static void main(String[] args) {
        Movie m1 = new Movie("Inception", 0);
        Movie m2 = new Movie("Batman Arkham Knight", 0);
        Movie m3 = new Movie("AntMan and the Wasp: Quantumania", 1);

        Rental r1 = new Rental(m1, 7);
        Rental r2 = new Rental(m3, 15);

        Debitcard d1 = new Debitcard("Sean", 565656565, 100.99);

        Customer c1 = new Customer("Sean", d1);
        c1.addRental(r1);
        c1.addRental(r2);

        PaymentScreen ps = new PaymentScreen();

        ps.callInterceptors(c1, true);

        Debitcard d2 = new Debitcard("Adam", 42742819, 5.01);
        Customer c2 = new Customer("Sean", d2);
        Rental r3 = new Rental(m2, 8);
        c2.addRental(r3);


        ps.callInterceptors(c2, true);

        ps.callInterceptors(c1, false);


    }
}
