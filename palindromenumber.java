class Solution {
    public boolean isPalindrome(int x) {
     int org=x;
     int sum=0;
     while(x>0)
     {
        int dig=x%10;
        sum=10*sum+dig;
        x/=10;
     }   
     if(org==sum)
     {
      return true;
     }
     return false;
    }
}