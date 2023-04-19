
package mx.edu.itson.rpc.rabbit.client;

public class FibonacciRpcClient {
    
    public String call(int number){
        return String.valueOf(fibonacci(number));
    }
    
    private int fibonacci(int number){
        if (number == 0) return 0;
        if (number == 1) return 1;
        
        return fibonacci(number - 1) + fibonacci(number - 2);
    }
    
}
