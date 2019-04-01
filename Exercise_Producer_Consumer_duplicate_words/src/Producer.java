
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.logging.Level;
import java.util.logging.Logger;



public class Producer implements Runnable{
    
    private Queue q;
    
    public Producer(Queue q){
        this.q=q;
        
    }
    

    @Override
    public void run() {
        System.out.println("Hi");
        while(true){
            
            try {
                File f=new File("files");
                
                
                for (File file : f.listFiles()) {
                
                    BufferedReader in= new BufferedReader(new FileReader(file));
                     String st;
                     String text="";
                    try{
                        while(((st=in.readLine()))!=null){
                           text+=st;
                        }
                        
                        Book b=new Book(file.getName(), text.replaceAll("[^ a-zA-Z]", ""));
                    
                        q.put(b);
                    }catch(Exception ex){
                        
                    }
                
               }
            } catch (FileNotFoundException ex) {
                Logger.getLogger(Producer.class.getName()).log(Level.SEVERE, null, ex);
            }
            
        }
    }

}
