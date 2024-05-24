package nanapig;

import java.util.Scanner;

public class Count {
  public static void main(String[] args) {
    Scanner keyboardInput = new Scanner(System.in);
    System.out.print("输入一个数字: ");
    Double num1 = keyboardInput.nextDouble();

    System.out.print("输入一个运算符: ");
    String op = keyboardInput.next();

    System.out.print("输入一个数字: ");
    Double num2 = keyboardInput.nextDouble();

    if (op.equals("+")) {
      System.out.println(num1 + num2);
    } else if (op.equals("-")) {
      System.out.println(num1 - num2);
    } else if (op.equals("*")) {
      System.out.println(num1 * num2);
    } else if (op.equals("/")) {
      System.out.println(num1 / num2);
    } else {
      System.out.println("输入有误");
    }

    keyboardInput.close();
  }
}