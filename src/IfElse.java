/*
 * 
 * 
 * 
 * Task: Given an integer, , perform the following conditional actions:
 * If n is odd, print Weird
 * If n is even and in the inclusive range of  to , print Not Weird
 * If n is even and in the inclusive range of  to , print Weird
 * If n is even and greater than , print Not Weird
 */

import java.util.Scanner;

public class IfElse {
    private static final Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
        if(n%2 != 0){
            System.out.println("Weird");
        }else if(n>=2 && n<=5){
            System.out.println("Not Weird");
        }else if(n>=6 && n<=20 ){
            System.out.println("Weird");
        }else{
            System.out.println("Not Weird");
        }
    scanner.close();
    }
}

