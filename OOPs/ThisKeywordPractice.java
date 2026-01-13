package OOPs;

public class ThisKeywordPractice {
    String name = "Sandipan";
    public void ThisKeywordPractice(String name) {
        this.name = name;
        System.out.println(name);
    }

    public static void main(String[] args) {
        ThisKeywordPractice ths = new ThisKeywordPractice();
        ths.ThisKeywordPractice("Priya");
    }
    
}
