
import java.util.LinkedList;




public class Queue<T> {
    
    private LinkedList<T> queue=new LinkedList<>();
    int maxsize=3;
    
    public void put(T element) throws Exception{
        if(queue.size()<maxsize){
            queue.add(element);
            System.out.println(queue.get(0));
        }
        else{
        Thread.currentThread().wait();
            throw new Exception();
        }
    }
    public T getT(){
        return queue.element();
    }
    

}
