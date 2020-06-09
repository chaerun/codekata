package sg.com.aia;

public class FizzBuzzGenerator {
   
   public String convert(int number) {
     StringBuilder sb = new StringBuilder();
     boolean multiplied = false;

     if (number % 3 == 0) {
       sb.append("Fizz");
       multiplied = true;
     }

     if (number % 5 == 0) {
       sb.append("Buzz");
       multiplied = true;
     }

     if (!multiplied) {
       sb.append(number);
     }

     return sb.toString();

    //  if (number % 15 == 0) {
    //    return "FizzBuzz";
    //  }

    //  if (number % 3 == 0) {
    //    return "Fizz";
    //  }

    //  if (number % 5 == 0) {
    //    return "Buzz";
    //  }  

    //  return String.valueOf(number);
   }

   public String generate(int limit) {
     StringBuilder sb = new StringBuilder();
     for(int i = 1; i <= limit; i++) {
       sb.append(convert(i));
       if (i < limit) {
         sb.append(", ");
       }
     }

     return sb.toString();
   }

}
