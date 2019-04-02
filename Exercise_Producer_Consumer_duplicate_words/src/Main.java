

public class Main {
    
    
    
    public static void main(String[] args) {
        Queue q=new Queue();
        
        Producer p=new Producer(q);
        Consumer c=new Consumer(q);
        Consumer c2=new Consumer(q);
        
        Thread prod=new Thread(p);
        prod.start();
        
        Thread cons=new Thread(c);
        cons.start();
        
        Thread cons2=new Thread(c2);
        cons2.start();
        
    }

}
