class Solution {
    public int lengthOfLastWord(String s) {
    String [] str=s.trim().split(" ");
     

       int a=str[str.length-1].length();

       return a; 
    }
    
}