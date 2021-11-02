import java.util.HashSet;

/**
 * Alice 有 n 枚糖，其中第 i 枚糖的类型为 candyType[i] 。Alice 注意到她的体重正在增长，所以前去拜访了一位医生。
 *
 * 医生建议 Alice 要少摄入糖分，只吃掉她所有糖的 n / 2 即可（n 是一个偶数）。Alice 非常喜欢这些糖，她想要在遵循医生建议的情况下，尽可能吃到最多不同种类的糖。
 *
 * 给你一个长度为 n 的整数数组 candyType ，返回： Alice 在仅吃掉 n / 2 枚糖的情况下，可以吃到糖的最多种类数。
 *
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/distribute-candies
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 **/

public class DivideCandy {
    public int distributeCandies(int[] candyType) {
        int length = candyType.length/2;
        HashSet<Integer> hashSet = new HashSet<Integer>();
        for (int num : candyType){
            hashSet.add(num);
        }
        if (hashSet.size()>length){
            return length;
        }else{
            return hashSet.size();
        }
    }

    public static void main(String[] args) {
        int[] data = {1,1,2,2,3,3};
        DivideCandy divideCandy = new DivideCandy();
        int result = divideCandy.distributeCandies(data);
        System.out.println(result);
    }
}
