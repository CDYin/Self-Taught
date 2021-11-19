
/**
 *
 * 给定一个正整数 n ，你可以做如下操作：
 *
 * 如果 n 是偶数，则用 n / 2替换 n 。
 * 如果 n 是奇数，则可以用 n + 1或n - 1替换 n 。
 * n 变为 1 所需的最小替换次数是多少？
 *
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/integer-replacement
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 *
 * 我不会
 * */


public class IntegerSubstitution {
    public int integerReplacement(int n) {
        int count = 0;
        if (n == 1){return 0;}
        while (n != 1){
            if (n % 2 == 0){
                count++;
                n = n/2;
            }else {
                if ((integerReplacement(n + 1) > integerReplacement(n - 1))) {
                    n = n - 1;
                } else {
                    n = n + 1;
                }
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        //毫秒ms：
        long startTime=System.currentTimeMillis(); //获取开始时间
        IntegerSubstitution integerSubstitution = new IntegerSubstitution();
        int result = integerSubstitution.integerReplacement(2147483647);
        System.out.println(result);

        long endTime=System.currentTimeMillis(); //获取结束时间
        System.out.println("程序运行时间： "+(endTime-startTime)+"ms");
    }
}
