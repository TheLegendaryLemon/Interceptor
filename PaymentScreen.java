import java.util.Vector;
public class PaymentScreen {


    public void callInterceptors(Customer customer, Boolean payNow){
        Interceptor interceptor = new Interceptor(){
            public void StatementRequest(Customer customer){
                System.out.println("Retrieving customer statement");
                System.out.println(customer.statement());
            }

            public void PaymentRequest(Customer customer){

                if(customer.getCard().getBalance() > customer.getTotalCharge()){
                    System.out.println("Card Used:");
                    System.out.println(customer.getCard().infoToString());
                    System.out.println("\nTransaction Successful");

                    System.out.println("\n");

                    Vector<Rental> rentals = customer.getRentals();
                    rentals.clear();
                }else{
                    System.out.println("Insufficuent Funds");
                    System.out.println("\nPayment Failed");
                    System.out.println("\n");
                    
                }
            }
        };
        
        PaymentRequestDispatcher dispatcher = new PaymentRequestDispatcher();
        dispatcher.addInterceptor(interceptor);

        dispatcher.dispatchStatementInterceptor(customer);

        if(payNow){
            System.out.println("\nProceeding to Payment");
            dispatcher.dispatchPaymentInterceptor(customer);
            
        }else{
            System.out.println("\nPayment Cancelled");
            System.out.println("\n");
        }
       
    }
     
}
