class Solution {
    public String multiply(String num1, String num2) {
        if(num1.equals("0")||num2.equals("0")){
            return "0";
        }
        int n=num1.length();
        int m=num2.length();
        int[] r=new int[n+m];
        for(int i=n-1;i>=0;i--){
            for(int j=m-1;j>=0;j--){
                int d1=num1.charAt(i)-'0';
                int d2=num2.charAt(j)-'0';
                int pro=d1*d2;
                int sum=pro+r[i+j+1];
                r[i+j+1]=sum%10;
                r[i+j]+=sum/10;
            }
        }
        StringBuilder sb=new StringBuilder();
        for(int digit:r){
            if(!(sb.length()==0 && digit==0))
            {
                sb.append(digit);
            }
        }
        return sb.toString();
    }
}