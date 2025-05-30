import java.util.Scanner;

class Prime{
	public static void main(String arg[]){
		int i = 0;
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a number: ");
		int num = sc.nextInt();
		
		if (num < 2) {
            System.out.println("It is not a prime number, enter a valid number.");
        } else if (num == 2) {
            System.out.println("It is a prime number.");
        } else if (num % 2 == 0) {
            System.out.println("It is not a prime number.");
        } else {
			for (i = 3; i*i<=num; i+=2){
				if(num % i == 0){
					System.out.print("It is not a prime number");
					break;
				} else {
					System.out.print("It is PRIME.");
					break;
				}
			}
		}
	}
}