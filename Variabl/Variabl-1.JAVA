/*
* 整型和浮点型变量的使用
*
* */


class Variabl1 {
    public static void main(String[] args) {

//整型:   byte(字节 1字节= 8bit位 范围- (-128-127)) 大B也是byte表示单位
//       short(2字节)
//       int(默认)-常用 (4字节)
//       long(int用不上在考虑long) (8字节)
        byte x1 = 12;
        byte x2 = 127;
//        short x3 = 128; //包不过因为超了
        int a1 = 12312313; //int写多长都可以

        long l1 = 12312313L; //以大写L或小写l为后缀
        System.out.println(x1);
        System.out.println(x2);
        System.out.println(a1);
        System.out.println(l1);

//  开发中定义变量没有特殊时用int声明为类型

//浮点型:    单精度-float(存储小精度低)-4字节   双精度-double(默认-存储大精度高)-8字节
//          -3.403E38 至 3.403E38      -1.798E308 至 1.7983E308
        double d1 = 123.456;

        System.out.println(d1);
        // float 结尾要加个F或f
        float f1 = 123.456F;

        System.out.println(f1);


//  开发中通常用double类型,float因为精度不高
//  如果需要很高很高的精度的话需要使用BigDecimal类来替换



    }
}
