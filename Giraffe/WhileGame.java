package nanapig;

import java.util.Scanner;

public class WhileGame {
  public static void main(String[] args) {
    Scanner keyboardInput = new Scanner(System.in);
    String guess = "";
    int guessCount = 0;
    int guessLimit = 3;
    Boolean outOfLoop = false;

    while (!guess.equals("迪迦") && !outOfLoop) {
      if (guessCount < guessLimit) {
        System.out.print("输入一个猜的奥特曼名字: ");
        guess = keyboardInput.nextLine();
        guessCount++;
      } else {
        outOfLoop = true;
      }
    }

    if (outOfLoop) {
      System.out.println("You Lose!");
    } else {
      System.out.println("You Win!");
    }

    keyboardInput.close();
  }
}
