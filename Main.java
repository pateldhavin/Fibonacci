import java.util.Scanner;

/* The purpose of this Program is to allow the user to manually input a number from the Fibonacci sequence 
 * and complete the function usiing both a iteration loop as well as a recursive loop. Then the runtime in 
 * nanoseconds is displayed
 */

public class Main {

  

    // iteration loop
	static long startTime = System.nanoTime();
	static long endTime = System.nanoTime();
	
    static int i(int n) {
    	
        int a = 0, b = 1, sum = 1;
        startTime = System.nanoTime();
        for (int i = 0; i < n; i++) {
        	
        	a = b;
            b = sum;
            sum = a + b;
            endTime = System.nanoTime();
        }
        return a;
    }
    
    // recursive loop
    
    static int r(int n) {
        if ((n == 1) || (n == 0)) {
        	
            return n;      
        }
       
        return r(n - 1) + i(n - 2);
    }


    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        

        // nth term user input
        System.out.print("Enter nth term of sequece: ");
        int n = s.nextInt();
        // iteration loop results
        System.out.println("Iteration Method:");
        
        System.out.printf("Fibonacci sequence(nth term : %d) = %d \n", n, i(n));
        System.out.printf("Runtime: %d ns\n", endTime - startTime);

        // recursive loop results
        System.out.println("Recursion Method:");
        long start = System.nanoTime();
        System.out.printf("Fibonacci sequence(nth term : %d) = %d \n", n, r(n));
        System.out.printf("Runtime: %d ns\n", System.nanoTime() - start);
    }
}