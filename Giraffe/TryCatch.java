package nanapig;

public class TryCatch {
  public static void main(String[] args) {
    try {
      int divition = 10 / 0;
      System.out.println(divition);
    } catch (ArithmeticException e) {
      System.out.println("你滴除法错误大大滴!");
    } catch (Exception e) {
      System.out.println("你滴有错误滴干活!");
    }

  }
}
