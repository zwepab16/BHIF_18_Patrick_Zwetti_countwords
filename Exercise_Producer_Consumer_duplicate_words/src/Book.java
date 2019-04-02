
import java.util.HashMap;

public class Book {

    private String inputfilename, text;

    public Book(String inputfilename, String text) {
        this.inputfilename = inputfilename;
        this.text = text.replaceAll("[^ 0-9A-Za-z]", "");
        this.text.replaceAll(" +", " ");

    }

    public String getInputfilename() {
        return inputfilename;
    }

    public String getText() {
        return text;
    }

    public HashMap<String, Integer> countW() {
        String w[] = text.split(" ");
        HashMap<String, Integer> zähler = new HashMap<>();
        for (String wort : w) {
            if (zähler.containsKey(wort)) {
                zähler.put(wort, zähler.get(wort) + 1);

            } else {
                zähler.put(wort, 1);
            }
        }
        return zähler;

    }

}
