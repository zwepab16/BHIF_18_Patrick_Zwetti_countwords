

public class Consumer implements Runnable{
    
    Queue q;

    public Consumer(Queue q) {
        this.q = q;
    }
    

    @Override
    public void run() {
        while(true){
            Book b=(Book)q.getT();
            System.out.println(b.toString());
        }
      
    }

}
