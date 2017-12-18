package page;

import utils.OutUtils;

/**
 * 计算最大公约数
 */
public class Page1 {
    public static void main(String[] args) {
//        OutUtils.out("test");
        gcm1(24, 60);
    }

    //统计执行的次数
    static int cout = 0;

    /**
     * 计算最大公约数
     */
    public static void gcm1(int a, int b) {
        //a<b数字交换位置，不用第三个变量
        if (a < b) {
            //利用+
//            a = a + b;
//            b = a - b;
//            a = a - b;

//            利用*
            a = a * b;
            b = a / b;
            a = a / b;
        }

        //辗转相除法
        int mod = a % b;
        while (mod != 0) {
            a = b;
            b = mod;
            mod = a % b;
            cout++;
        }
        OutUtils.out(b + ", 次数: " + cout);
    }
}
