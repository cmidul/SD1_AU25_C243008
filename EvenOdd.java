import java.util.Scanner;

public class EvenOdd {
  public static void main(String args[]) {
    System.out.print("Input the number, you want know if it is even or odd ");
    
    Scanner sc = new Scanner(System.in);
    int num = sc.nextInt();
    if(num%2 == 0)
        System.out.println(num + " is even.");
    else
        System.out.println(num + " is odd.");
  }
}