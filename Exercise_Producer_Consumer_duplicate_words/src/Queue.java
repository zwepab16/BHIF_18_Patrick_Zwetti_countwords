
import java.util.LinkedList;




public class Queue<T> {
    
    private LinkedList<T> queue=new LinkedList<>();
    int maxsize=3;
    
    public void put(T element) throws Exception{
        if(queue.size()<maxsize){
            queue.add(element);
            
        }
        else{
      
        }
    }
    public T getT(){
        return queue.remove();
    }
    

}
