import java.util.Scanner;

class primeFactors {
   public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in); 
    int n;
    System.out.print("Enter a number: ");
    n = scanner.nextInt();
    
    for (int i = 2; i < n; i++) {
        while(n % i == 0){
          n = n/i;
          System.out.println(i);
        }
    }
    if(n != 1) {
        System.out.println(n);
    }
    
   }
}