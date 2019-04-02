
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Consumer implements Runnable {

    private Queue q;

    public Consumer(Queue q) {
        this.q = q;
    }

    @Override
    public void run() {
        while (true) {
            Book book = null;

            synchronized (q) {
                try {
                    book = (Book) q.getT();
                    q.notifyAll();
                } catch (Exception e) {
                    q.notifyAll();
                    try {
                        q.wait();
                    } catch (InterruptedException ex) {
                        Logger.getLogger(Consumer.class.getName()).log(Level.SEVERE, null, ex);
                    }
                }

            }

            if (book != null) {

                File file = new File("output.txt");

                try {
                    FileWriter filewriter = new FileWriter(file);
                    BufferedWriter writer = new BufferedWriter(filewriter);
                    writer.append(String.format("........ %s .........", book.getInputfilename()));
                    writer.newLine();
                    for (Map.Entry<String, Integer> e : book.countW().entrySet()) { //--> Hier wurde mir geholfen.
                        if (e.getValue() >= 2) {
                            writer.append("" + e);
                            writer.newLine();
                        }
                    }
                    writer.append("......................");
                    writer.newLine();
                    writer.newLine();

                    writer.flush();
                    writer.close();

                } catch (IOException ex) {
                    Logger.getLogger(Consumer.class.getName()).log(Level.SEVERE, null, ex);
                }

            }

        }

    }

}
