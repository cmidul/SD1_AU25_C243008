import java.util.Scanner;

public class MyClass {
  public static void main(String args[]) {
    Scanner cin = new Scanner(System.in);
    System.out.println("Put three int number below...");
    int a = cin.nextInt();
    int b = cin.nextInt();
    int c = cin.nextInt();
    
    if(a > b){
        if(a > c)
            System.out.println(a);
        else
            System.out.println(c);
    }
    else {
        if(b>c)
            System.out.println(b);
        else
            System.out.println(c);
    }
  }
}