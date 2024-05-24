package nanapig;

public class SwitchStatements {
  public static void main(String[] args) {
    System.out.println(getDayNum(0));
  }

  public static String getDayNum(int dayNum) {
    String dayName = "";

    switch (dayNum) {
      case 0:
        dayName = "Sunday";
        break;
      case 1:
        dayName = "Monday";
        break;
      case 2:
        dayName = "Tuesday";
        break;
      case 3:
        dayName = "Wednsday";
        break;
      case 4:
        dayName = "Thursday";
        break;
      case 5:
        dayName = "Friday";
        break;
      case 6:
        dayName = "Saturday";
        break;
      default:
        dayName = "Invalid Day Num";
        break;
    }

    return dayName;
  }
}
