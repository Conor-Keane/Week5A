package ie.atu.week5;

public class Counter {
    private int countValue;

    public Counter() {
        countValue = 0;
    }

    public int increment()
    {
        countValue++;
        return countValue;
    }

    public int decrement()
    {
        countValue--;
        return countValue;
    }

    
       public Counter(int startingValue) {
         if (startingValue > 5) {
             countValue = startingValue;
         }
         else
         {
             throw new IllegalArgumentException("This is not a valid number");
         }
     }


}

class Calculator {
    private int calcValue;

    public Calculator() {
        calcValue = 1;
    }

    public int add()
    {
        int firstNum = 2;
        int secondNum = 3;
        calcValue = firstNum + secondNum;
        return calcValue;
    }


    public Calculator(int startValue) {
        if (startValue > 5) {
            calcValue = startValue;
        } else {
            throw new IllegalArgumentException("This is not a valid number");
        }
    }


}

