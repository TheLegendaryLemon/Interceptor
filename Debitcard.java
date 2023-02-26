public class Debitcard {

    private String name;
    private int cardNo;
    private double balance;
    
    public Debitcard(String name, int cardNo, double balance){
        this.name = name;
        this.cardNo = cardNo;
        this.balance = balance;
    }

    public void setName(String name){
        this.name = name;
    }

    public void setCardNo(int cardNo){
        this.cardNo = cardNo;
    }

    public void setBalance(double balance){
        this.balance = balance;
    }

    public String getName(){
        return name;
    }

    public int getCardNo(){
        return cardNo;
    }

    public double getBalance(){
        return balance;
    }

    public String infoToString(){
        return "Card name:" + name + "\nFirst four digits: " + Integer.toString(cardNo).substring(0,4)
        + "\nBalance: " + balance;
    }
}
