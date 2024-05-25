public class JavaScore {
  public static void main(String[] args) {
    int score = 89;

    if (score >= 90 && score <= 100) {
      System.out.println("Very very good");
    } else if (score >= 80 && score < 90) {
      System.out.println("Very good");
    } else if (score >= 70 && score < 80) {
      System.out.println("Good");
    } else if (score >= 60 && score < 70) {
      System.out.println("Not bad");
    } else if (score >= 0 && score < 60) {
      System.out.println("Bad");
    } else {
      System.out.println("What are you fucking doing?");
    }
  }
}
