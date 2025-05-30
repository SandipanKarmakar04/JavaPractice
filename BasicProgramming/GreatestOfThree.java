  class GreatestOfThree {
    public static void main(String[] args) {
        int a = 6, b = 7, c = 2; // predefined numbers
        int max;

        if (a > b && a > c) {
            max = a;
         }
         else if (b > c) {
            max = b;
         }
         else {
            max = c;
         }
          System.out.println("Greatest number: " + max);
    }
}
