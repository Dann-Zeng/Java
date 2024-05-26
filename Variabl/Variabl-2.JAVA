/**
 * 字符类型和浮点型
 * 布尔类型
 *
 * */


public class Variabl2 {
    public static void main(String[] args) {

//        字符常量:带单引号的'’ 单引号中必须有且只能有一个内容
//        '1'(算) '11'(不算)  ''(不算) 'a1'(不算)
//               一个空格-' '(算)  '  '(两个空格不算)  '写一个tab键'(算)
//                字符串常量:带双引号的
//        "” 双引号中内容随意…"hellowor1d"
        char c1 = ' '; //一个空格
        char c2 = ' '; //一个tab键
        char c3 = 'a'; //一个a
//        char c4 = 'Aa'; //只能一个所以报错

        char c4 = '\u0036';
//        这个是用编码写字符,每个编码都有对应的字符

//        ASCLL编码
        char c5 = 97; //a
        char c6 = 48; //0
        char c7 = 65; //A

        System.out.println(c1);
        System.out.println(c2);
        System.out.println(c3);
        System.out.println(c4);
        System.out.println(c5);
        System.out.println(c6);
        System.out.println(c7);

//        布尔类型:boolean
//        布尔常量:true(真)fa1se(假)->这两个单词不要加双引号
//        "true"(这样写属于字符串,不属于布尔常量)
//        空常量:nu11 代表的是数据不存在
        boolean bo1 = true;
        boolean bo2 = false;

//        如果这样写boolean  bo3 = 0
//        则编译不通过
//        小例子
        boolean isMarried = false; //如果为真
        if (isMarried){
            System.out.println("很遗憾不能来参加"); //则执行这条
        }else {
            System.out.println("可以下次来参加"); //如果为假则执行这条
        }
//  布尔类型的空间占比也有的为4个字节,不过通常不谈这个
    }
}
