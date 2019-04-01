
import java.util.LinkedList;




public class Queue<T> {
    
    private LinkedList<T> queue=new LinkedList<>();
    int maxsize=3;
    
    public void put(T element){
        if(queue.size()<=maxsize){
            queue.add(element);
            
        }
    }

}
