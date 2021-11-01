import java.util.HashMap;
import java.util.Map.Entry;

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
