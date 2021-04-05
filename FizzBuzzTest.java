
public class FizzBuzzTest{
    public static void main(String[] args){
        FizzBuzz iD = new FizzBuzz();
        int fizzBuzzNumber = iD.fizzBuzz(15);
        int fizzNum = iD.fizzBuzz(2);
        if(fizzBuzzNumber % 3 == 0){
            System.out.println("Fizz");
        }
        if(fizzBuzzNumber % 5 == 0){
            System.out.println("Buzz");
        }
        if(fizzBuzzNumber % fizzBuzzNumber == 0){
            System.out.println("FizzBuzz");
        }
        System.out.println(fizzNum);
    }
}