import java.util.Scanner;
public class zRq02 {
    public static void main(String[] args){
        Scanner input =new Scanner(System.in);
//        System.out.println("请输入日期");
        System.out.print("请输入年份:");
        int year =input.nextInt();

        System.out.print("请输入月份:");
        int month =input.nextInt();

        System.out.print("请输入日:");
        int day =input.nextInt();
        input.close();
        if(year>0){
            if(month>=1 && month<=12){
                //计算month月的总天数
                int days;
                if (month==2){
                    if (year%4==0 &&year%100!=0 ||year %400 ==0){
                        days=29;
                    }else {
                        days=28;
                    }
                }else  if(month==4 ||month==6 ||month ==9 || month ==11){
                    days=30;
                }else {
                    days=31;
                }
                if (day>=1 && day<=days){
                    System.out.println(year+"年"+month+"月"+day+"日");
                }else {
                    System.out.println("看看是不是年月日输入不规范了？");
                }
            }
        }
    }
}
