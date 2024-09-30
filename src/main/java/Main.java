import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
Scanner l = new Scanner(System.in);
    
System.out.println("digite um valor");
    double num = l.nextDouble();

    if(num > 0 ){
      System.out.println("O valor é positivo");
    }else{
      System.out.println("O valor é negativo");
    }
  }
}