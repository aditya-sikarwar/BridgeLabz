public class Ques8 {
    public static void main(String[] args) {
         if (args.length < 2) {
              System.out.println("Usage: java Ques8 <month> <day>");
              return;
         }
         int month = Integer.parseInt(args[0]);
         int day = Integer.parseInt(args[1]);
         boolean isSpring = (month == 3 && day >= 20) || (month == 4) || (month == 5) || (month == 6 && day <= 20);
         if (isSpring) {
              System.out.println("Its a Spring Season");
         } else {
              System.out.println("Not a Spring Season");
         }
    }
} 