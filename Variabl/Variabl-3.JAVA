/*
* 基本数据类型变量的运算规则
*
* 1.提到可以做为运算的基本数据类型有7种,不包含布尔类型
* 2.运算规则包括:
*   自动类型提升
*   强制类型转换
*
* 3.本次测式自动类型提升
*
* 规则:
*   当容量小的变量与容量大的变量做运算式,结果自动转换为容量大的数据类型
*
* 常规:
* 小  byte ----> short ----> int ----> long  ----> float  ----> double 大
*
* 说明:
*   容量的大小并非指占用字节空间大小,而是指表示数据的范围大小
*
* 特别:
*   byte,short类型的变量之间做运算,结果为int类型,因为int范围大
* 规定1:
*   整型常量规定为是int类型
*
* 规定2:
*   浮点型的常量规定为double类型
*
 * */

public class Variabl3 {
    public static void main(String[] args) {
        int i1 =10;
        int i2 = i1;

        long l1 = i1;

        byte b1 = 12;
        int i3 = b1 + i1;

//        以下为编译不通过
        // byte b2 = b1 + i1;
//      特殊:
        byte b3 = 12;
        short s1 = 1;
//        short s2 = b3 + s1; //这里要用int去接收
        int i4 = s1 + b3;

//      特殊:
        char c1 = 'a';
//        下面这个代码会报错原因是应为:
//        char c2 = c1 + b1; //
//          默认的转换为int类型,但是你向int类型赋予char就会报错
//              根据上面的规则小的会自动变为大的类型,再看他们的范围如下:
//                char的范围是    0 到 65535
//                而int类型的范围是 -2,147,483,648 到 2,147,483,647
//         下面这个代码就可以:
        int c2 = c1 + b3;

//        规定1代码示例:
        // 整型常量默认被视为int类型
        int x = 123;

        // 如果直接将一个超出int范围的整数常量赋给byte类型的变量会出现编译错误
        // byte y = 200; // 编译错误

        // 如果想要将一个超出int范围的整数常量赋给byte类型的变量，需要进行强制类型转换
        byte y = (byte)200; // 正确

//        byte强行转换解释:
//          200 的二进制表示是 11001000，但由于 byte 类型只有 8 位，因此只能保留低位的 1001000。
//          在 Java 中，使用补码表示有符号整数，所以最高位为 1 表示负数。
//          因此，将 1001000 解释为补码，得到的结果是 -56
        System.out.println("int x: " + x);
        System.out.println("byte y: " + y);


//        规定2代码示例:
        // 浮点型常量默认被视为double类型
        double d = 1.1;

        // 如果直接将浮点型常量赋给float类型的变量会出现编译错误
        // float f = 1.1; // 编译错误

        // 如果想要将浮点型常量赋给float类型的变量，需要在常量后面加上f或者F
        float f = 1.1f; // 正确

        System.out.println("double d: " + d);
        System.out.println("float f: " + f);
//
        System.out.println(c2);
        System.out.println(b1);
        System.out.println(i3);
        System.out.println(i4);
    }
}
