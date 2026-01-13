import java.util.ArrayList;

public class ForEachLoop1 {

    public static void main(String[] args) {
        ArrayList<> ar = new ArrayList<>();
        ar.add("4");
        ar.add("January");
        ar.add("2000");

        for (String s : ar) {
            System.out.println(s);            
        }
    }
}
