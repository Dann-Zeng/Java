package ShangSiliconValley;

import java.util.Scanner;

public class Utility {
    private static Scanner scanner = new Scanner(System.in); // 定义Scanner对象

    public static char readMenuSelection() {
        char c;
        for (;;) {
            String str = keyBoardInput(1);
            c = str.charAt(0);
            if (c != '1' && c != '2' && c != '3' && c != '4') {
                System.out.print("输入有误，请重新输入.");
            } else
                break;
        }
        return c;
    }

    public static int readNumber() {
        int n;
        for (;;) {
            String str = keyBoardInput(4);
            try {
                n = Integer.parseInt(str);
                break;
            } catch (NumberFormatException e) {
                System.out.print("输入格式错误，请输入数字：");
            }
        }
        return n;
    }

    public static String readString() {
        String str = keyBoardInput(8);
        return str;
    }

    public static char readConfirmSelection() {
        char c;
        for (;;) {
            String str = keyBoardInput(1).toUpperCase();
            c = str.charAt(0);
            if (c == 'Y' || c == 'N') {
                break;
            } else {
                System.out.print("请选择(Y/N)：");
            }
        }
        return c;
    }

    private static String keyBoardInput(int limit) {
        String line = "";

        while (scanner.hasNext()) {
            line = scanner.nextLine();
            if (line.length() < 1 || line.length() > limit) {
                System.out.print("输入长度错误，请输入不超过" + limit + "个字符：");
                continue;
            }
            break;
        }

        return line;
    }
}
