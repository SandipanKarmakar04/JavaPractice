package Super;

public class InnerSuperKeyWordPractice extends SuperKeyWordPractice{
    
    String name = "Priya";

    void nameDisplay() {
        System.out.println(name);
        System.out.println(super.name);
    }
    
    public static void main(String[] args) {
        InnerSuperKeyWordPractice inSup = new InnerSuperKeyWordPractice();
        inSup.nameDisplay();
    }
}