public class ForLoops {
  public static void main(String[] args) {
    String[] kamenRider = { "帝骑", "甲斗王", "555", "巫骑" };
    for (int i = 0; i < kamenRider.length; i++) {
      System.out.println(kamenRider[i]);
    }

    System.out.println(pow(2, 3));
  }

  public static int pow(int baseNum, int powNum) {
    int result = 1;
    for (int i = 0; i < powNum; i++) {
      result = result * baseNum;
    }
    return result;
  }
}
