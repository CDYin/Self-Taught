import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;

public class RelativeRanking {
    public String[] findRelativeRanks(int[] score) {
        //得到数列的最大值和最小值，并计算出差值d
        int max = score[0];
        int min = score[0];
        int length = score.length;

        for(int i = 1;i<length;i++){
            if(score[i]>max){
                max = score[i];
            }else if(score[i]<min){
                min = score[i];
            }
        }

        int different = max-min;
        //初始化桶
        ArrayList<LinkedList<Integer>> bucketList = new ArrayList<>();
        for(int i = 0;i<length;i++){
            bucketList.add(new LinkedList<>());
        }

        int section = different/(length-1);
        //遍历原始数组将每个元素放入桶中
        for (int item : score) {
            int num = (item / section) - 1;
            if (num < 0) {
                num = 0;
            }
            bucketList.get(num).add(item);
        }
        //对每个桶内部进行排序
        for (LinkedList<Integer> integers : bucketList) {
            // 使用Collections.sort，其底层实现基于归并排序或归并排序的优化版本
            Collections.sort(integers);
        }
        //输出全部元素
        int index = 0;
        for(LinkedList<Integer> arrayList : bucketList){
            for(int value : arrayList){
                score[index] = value;
                index++;
            }
        }

        String[] result = new String[length];

        for(int i = 0;i<length;i++){
            result[i] = ""+score[i];
        }
//        result[0] = "Gold Medal";
//        result[1] = "Silver Medal";
//        result[2] = "Bronze Medal";

        return result;
    }
    public static void main(String[] args) {
        RelativeRanking relativeRanking = new RelativeRanking();
        int[] arr ={3,6,4,7,8,9,2,1,5};
        String[] data = relativeRanking.findRelativeRanks(arr);
        for (String datum : data) {
            System.out.println(datum);
        }

    }
}
