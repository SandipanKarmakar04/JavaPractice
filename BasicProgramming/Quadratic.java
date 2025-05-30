class Quadratic {
    public static void main(String[] args) {
        double a = 1, b = -3, c = 4;
        double D = b * b - 4 * a * c;

        if (D >= 0) {
            double root1 = (-b + Math.sqrt(D)) / (2 * a);
            double root2 = (-b - Math.sqrt(D)) / (2 * a);
            System.out.println(D == 0 ? "One root: " + root1 : "Two roots: " + root1 + " and " + root2);
        } else {
            System.out.println("Complex roots");
        }
    }
}
