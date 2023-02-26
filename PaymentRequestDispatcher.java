import java.util.ArrayList;


public class PaymentRequestDispatcher {

    ArrayList<Interceptor> interceptors;

    public PaymentRequestDispatcher(){
        interceptors = new ArrayList<Interceptor>();
    }

    synchronized public void addInterceptor(Interceptor i){
        
        interceptors.add(i);
    }

    public void removeInterceptor(Interceptor i){
        interceptors.remove(i);
    }

    public void dispatchPaymentInterceptor(Customer customer){
        ArrayList<Interceptor> interceptors_copy = interceptors;

        for (Interceptor ic : interceptors_copy){
            ic.PaymentRequest(customer);
        }
    }

    public void dispatchStatementInterceptor(Customer customer){
        ArrayList<Interceptor> interceptors_copy = interceptors;

        for (Interceptor ic : interceptors_copy){
            ic.StatementRequest(customer);
        }
    }
    
}
