import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    Scanner wysokosc = new Scanner(System.in);
    System.out.print("Podaj wysokosc choinki: ");
    int Wysokosc = wysokosc.nextInt();
    for(int i = 1; i < Wysokosc; i++)
      {
        for(int j = 0; j < Wysokosc - i; j++)
          {
            System.out.print(" ");
          }
        for(int k = 0; k < (2*i)-1; k++)
          {
        System.out.print("*");
          }
        System.out.println("");
      }
    }
}
