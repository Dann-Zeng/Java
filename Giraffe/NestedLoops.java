package nanapig;

public class NestedLoops {
  public static void main(String[] args) {
    int[][] numberGrid = {
        { 1, 2 },
        { 3, 4 },
        { 5, 6 }
    };
    // numberGrid[0][0] = 99;
    // System.out.println(numberGrid[0][0]);
    // System.out.println(numberGrid[0][1]);

    for (int i = 0; i < numberGrid.length; i++) {
      for (int j = 0; j < numberGrid[i].length; j++) {
        System.out.println(numberGrid[i][j]);
      }
      System.out.println();
    }
  }
}
