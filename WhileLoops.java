package nanapig;

public class WhileLoops {
  public static void main(String[] args) {
    int i = 1;
    while (i <= 10) {
      System.out.println(i);
      i++;
    }

    do {
      System.out.println(i);
      i++;
    } while (i <= 10);
  }
}
