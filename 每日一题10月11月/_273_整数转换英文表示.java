package 每日一题10月11月;

/**
 * https://leetcode-cn.com/problems/integer-to-english-words/
 * @author swift
 *
 */
public class _273_整数转换英文表示 {
	String[] low = {"","One","Two","Three","Four","Five","Six","Seven","Eight","Nine"};
    String[] mid = {"Ten","Eleven","Twelve","Thirteen","Fourteen","Fifteen","Sixteen","Seventeen","Eighteen","Nineteen"};
    String[] high = {"","","Twenty","Thirty","Forty","Fifty","Sixty","Seventy","Eighty","Ninety"};

    public String numberToWords(int num) {
        if(num==0){
            return "Zero";
        }
        int part1 = num%1000;
        num = num/1000;
        int part2 = num%1000;
        num = num/1000;
        int part3 = num%1000;
        num = num/1000;
        int part4 = num;
        String ans = "";
        if(part4!=0){
            ans = buildNumber(part4) + "Billion ";
        }
        if(part3!=0){
            ans = ans + buildNumber(part3) + "Million ";
        }
        if(part2!=0){
            ans = ans + buildNumber(part2) + "Thousand ";
        }
        if(part1!=0){
            ans = ans + buildNumber(part1);
        }
        return ans.trim();
    }

    public String buildNumber(int num){
        int a = num%10;
        num = num/10;
        int b = num%10;
        num = num/10;
        int c = num;
        String ans = "";
        if(c!=0){
            ans = low[c] + " " + "Hundred ";
        }
        if(b==1){
            ans = ans + mid[a];
        }else if(b==0){
            ans = ans + low[a];
        }else {
            ans = ans + high[b] + " " + low[a];
        }
        return ans.trim() + " ";
    }
}
