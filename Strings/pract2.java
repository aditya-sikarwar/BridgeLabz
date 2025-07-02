public class pract2 {
    public static void main(String[] args) {
        String str="abcdcba"; // 0 1 2 3 4 5 6
                              // a b c d c b a // 
        System.out.println(ispalindrome(str));
    }
    
    static boolean ispalindrome(String str){
        //str=str.toLowerCase();
        for(int i=0; i<str.length()/2; i++){
            char start= str.charAt(i);
            char end=str.charAt(str.length()-1-i); 
            if(start!=end){
                return false;
            }
        }
        return true;

    }
}
