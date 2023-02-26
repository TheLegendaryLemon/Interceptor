public interface CustomerInterface {
    public void addRental(Rental arg);

    public String getName();

    public Debitcard getCard();

    public String statement();

    public String htmlStatement();

    public double getTotalCharge();

}
