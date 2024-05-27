package ShangSiliconValley;

public class ZFTest {
  public static void main(String[] args) {
    // 定义一个计数器，初始值为0
    int count = 0;
    // 定义珠穆朗玛峰的高度
    int zf = 8848860; // 单位：毫米
    double paper = 0.1;// 单位：毫米
    while (paper < zf) {
      // 在循环中执行累加，对应折叠了多少次
      count++;
      paper *= 2;// 循环的执行过程中每次纸张折叠，纸张的厚度要加倍
    } // 打印计数器的值
    System.out.println("需要折叠：" + count + "次");
    System.out.println("折纸的高度为" + paper / 1000 + "米，超过了珠峰的高度");
  }
}
