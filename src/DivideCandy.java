import java.util.HashSet;

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
