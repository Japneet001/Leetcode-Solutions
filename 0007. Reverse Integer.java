class Solution {
    public int reverse(int x) {
        long reverse=0;
        long reverse_final=0;
        int result=0;
        if (x>0){
            while(x>0){
                long last_digit=x%10;
                reverse=reverse*10+last_digit;
                x/=10;
            }
            if (reverse<Math.pow(-2,31) || reverse>Math.pow(2,31)-1){
                result=0;
            }
            else{
                result=(int) reverse;
            }
        }
        else{
            int temp=Math.abs(x);
            while(temp>0){
                long last_digit=temp%10;
                reverse_final=reverse_final*10+last_digit;
                temp/=10;
            }
            reverse=-reverse_final;
            if (reverse<Math.pow(-2,31) || reverse>Math.pow(2,31)-1){
                result=0;
            }
            else{
                result=(int) reverse;
            }

        }
        return result;
        
    }
}