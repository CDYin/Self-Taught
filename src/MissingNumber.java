import java.util.HashMap;
import java.util.Map.Entry;


/**
 * 给定一个包含 [0, n] 中 n 个数的数组 nums ，找出 [0, n] 这个范围内没有出现在数组中的那个数。
 *
 * 方法一：排序
 *
 * 方法二：哈希集合
 *
 * 方法三：位运算
 *
 * 方法四：数学
 **/

public class MissingNumber {
    public int missingNumber(int[] nums) {
        int[] result = new int[1];
        HashMap<Integer,Integer> map = new HashMap<>();
        int length = nums.length;
        for(int i = 0;i<=length;i++){
            map.put(i,i);
        }
        for(int num : nums){
            if(map.get(num) != null){map.remove(num);};
        }

        for(Entry<Integer, Integer> entry : map.entrySet() ) {
            result[0] = entry.getValue();
        }
        return result[0];
    }
    public static void main(String[] args) {
        MissingNumber missingNumber = new MissingNumber();
        int[] data = {0,1};
        int result = missingNumber.missingNumber(data);
        System.out.println(result);
    }
}
