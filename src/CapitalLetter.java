/**
 *
 * 我们定义，在以下情况时，单词的大写用法是正确的：
 *
 * 全部字母都是大写，比如 "USA" 。
 * 单词中所有字母都不是大写，比如 "leetcode" 。
 * 如果单词不只含有一个字母，只有首字母大写， 比如 "Google" 。
 * 给你一个字符串 word 。如果大写用法正确，返回 true ；否则，返回 false 。
 *
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/detect-capital
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 *
 * */

public class CapitalLetter {
    public boolean detectCapitalUse(String word) {
        char[] char_data = word.toCharArray();
        int length = char_data.length;
        int bigNumberCount = 0;
        int smallNumberCount = 0;

        for (char data : char_data){
            if (data - 'a' >= 0){
                smallNumberCount++;
            }else {
                bigNumberCount++;
            }
        }

        return (bigNumberCount == 1 && char_data[0] < 'a')|| bigNumberCount == length || smallNumberCount == length;
    }

    public static void main(String[] args) {
        String data = "ffffffffffffffffffffF";
        CapitalLetter capitalLetter = new CapitalLetter();
        boolean result = capitalLetter.detectCapitalUse(data);
        System.out.println(result);
    }
}
