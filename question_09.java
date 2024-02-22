//Palindrome Number

class Solution{
    public boolean isPalindrome(int x){
  int a=0;
  int y=x;
  while(x>0){
 a=a*10+x%10;
 x/=10;
  }
  if(a==y){
      return true;
  }
   return false;
    }
}
