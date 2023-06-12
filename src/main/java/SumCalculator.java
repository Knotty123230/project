public class SumCalculator {
    public int sum(int number){
        int result = 0;
       if (number > 0) {
           for (int i = 0; i <= number; i++) {
               result += i;

           }
           return result;
       }else throw new IllegalArgumentException(String.format("чиcло = %s" ,number));

    }

}
