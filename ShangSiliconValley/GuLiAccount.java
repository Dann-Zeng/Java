public class GuLiAccount {

  public static void main(String[] args) {
    double balance = 10000;

    String info = "";

    boolean isExit = true;

    while (isExit) {
      System.out.println("----------蛊力记账----------");
      System.out.println("        1 收支明细          ");
      System.out.println("        2 登记输入          ");
      System.out.println("        3 登记支出          ");
      System.out.println("        4 退    出          ");
      System.out.print("        请输入1-4选择服务: ");

      char selection = Utility.readMenuSelection(); // 用来获取1 2 3 4

      switch (selection) {
        case '1':
          System.out.println("-------------当前收支明细记录-------------");
          System.out.println("收支\t账户金额\t\t收支金额\t\t说    明");
          System.out.print(info);
          System.out.println("--------------------------------------2123---");
          break;
        case '2':
          while (true) {
            System.out.print("请输入收入金额：");
            double income = Utility.readNumber();
            if (income > 0) {
              balance += income;
              System.out.print("请输入收入说明：");
              String incomeInfo = Utility.readString();
              info = info + "收入\t" + balance + "\t\t" + income + "\t\t" + incomeInfo + "\n";
              break;
            } else {
              System.out.println("输入收入有误，请重新输入");
              continue;
            }
          }
          break;

        case '3':
          while (true) {
            System.out.print("请输入支出金额：");
            double outcome = Utility.readNumber();
            if (outcome > 0 && outcome <= balance) {
              balance -= outcome;
              System.out.print("请输入支出说明：");
              String outcomeInfo = Utility.readString();
              info = info + "收入\t" + balance + "\t\t" + outcome + "\t\t" + outcomeInfo + "\n";
              break;
            } else {
              System.out.println("输入支出有误，请重新输入");
              continue;
            }
          }
          break;
        case '4':
          System.out.println("----------确认是否退出(Y/N)----------");
          char confirmSelection = Utility.readConfirmSelection();
          if (confirmSelection == 'Y') {
            isExit = false;
            System.out.println("----------退出成功----------");
          } else if (confirmSelection == 'N') {
            break;
          }
      }

    }
  }
}
