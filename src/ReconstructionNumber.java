import java.util.HashMap;

/**
 *
 * 给你一个字符串 s ，其中包含字母顺序打乱的用英文单词表示的若干数字（0-9）。按 升序 返回原始的数字。
 *
 * */

public class ReconstructionNumber {
    public String originalDigits(String s) {
        HashMap<Character,Integer> map = new HashMap<>();
        int[] int_result = new int[10];
        String result = null;
        char[] Letter = {'e','g','f','i','h','o','n','s','r','u','t','w','v','x','z'};
        char[] char_s = s.toCharArray();
        for (char data : Letter){
            map.put(data,0);
        }

        for (char data : char_s){
            map.put(data,map.get(data)+1);
        }

        int_result[0] = map.get('z');
        int_result[1] = map.get('o')-map.get('w')-map.get('u')-map.get('z');
        int_result[2] = map.get('w');
        int_result[3] = map.get('t')-map.get('w')-map.get('g');
        int_result[4] = map.get('u');
        int_result[5] = map.get('f')-map.get('u');
        int_result[6] = map.get('x');
        int_result[7] = map.get('s')-map.get('x');
        int_result[8] = map.get('g');
        int_result[9] = map.get('i')-map.get('x')-map.get('g')-map.get('f')+map.get('u');

        for (int i = 0;i<int_result.length;i++){
            if (int_result[i] == 1){
                result+=i;
            }else if (int_result[i]>1){
                for (int j = 0;j<int_result[i];j++){
                    result+=i;
                }
            }
        }

        return result.substring(4);
    }

    public static void main(String[] args) {
        String data = "zerozero";
        ReconstructionNumber reconstructionNumber = new ReconstructionNumber();
        String result = reconstructionNumber.originalDigits(data);
        System.out.println(result);
    }
}
