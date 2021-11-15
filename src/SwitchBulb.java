/**
 *
 * 初始时有 n 个灯泡处于关闭状态。第一轮，你将会打开所有灯泡。接下来的第二轮，你将会每两个灯泡关闭一个。
 *
 * 第三轮，你每三个灯泡就切换一个灯泡的开关（即，打开变关闭，关闭变打开）。第 i 轮，你每 i 个灯泡就切换一个灯泡的开关。直到第 n 轮，你只需要切换最后一个灯泡的开关。
 *
 * 找出并返回 n 轮后有多少个亮着的灯泡。
 *
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/bulb-switcher
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 *
 * public int bulbSwitch(int n) {
 *         return (int)Math.sqrt(n);
 *     }
 *
 * */

public class SwitchBulb {
    public int bulbSwitch(int n) {
        int[] factor = new int[n];
        int result = 0;
        for (int i = 2;i <= n;i++){
            for (int j = 2;j <= i;j++){
                if (i%j==0){
                    factor[i-1]++;
                }
            }
        }

        for (int data : factor){
            if (data%2 == 0){
                result++;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        //毫秒ms：
        long startTime=System.currentTimeMillis(); //获取开始时间

        //要测的程序或方法
        SwitchBulb switchBulb = new SwitchBulb();
        int result = switchBulb.bulbSwitch(99999);
        System.out.println(result);

        long endTime=System.currentTimeMillis(); //获取结束时间
        System.out.println("程序运行时间： "+(endTime-startTime)+"ms");
    }
}
