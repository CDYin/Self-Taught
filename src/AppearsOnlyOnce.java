import java.util.HashMap;
import java.util.Map.Entry;

/**
给定一个整数数组 nums，其中恰好有两个元素只出现一次，其余所有元素均出现两次。 找出只出现一次的那两个元素。你可以按 任意顺序 返回答案。

 

进阶：你的算法应该具有线性时间复杂度。你能否仅使用常数空间复杂度来实现？

来源：力扣（LeetCode）
链接：https://leetcode-cn.com/problems/single-number-iii
著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
**/

public class AppearsOnlyOnce {
    public int[] singleNumber(int[] nums) {
        int[] result = new int[2];
        int length = nums.length;
        HashMap<Integer,Integer> map = new HashMap<>();
        if(length == 2){return nums;}
        for (int num : nums) {
            if (map.get(num) == null) {
                map.put(num,num);
            }else{
                map.remove(num);
            }
        }
        int count = 0;
        for(Entry<Integer, Integer> entry : map.entrySet() ) {
            result[count] = entry.getValue();
            count++;
        }
        return result;
    }

    public static void main(String[] args) {
        int[] example = {1,2,1,3,2,5};
        AppearsOnlyOnce appearsOnlyOnce = new AppearsOnlyOnce();
        int[] result = appearsOnlyOnce.singleNumber(example);
        for (int num : result){
            System.out.println(num);
        }
    }
}
