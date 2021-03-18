package sample;

public class operation {
    public static float operation(long number1, long number2, String operation) {
        switch (operation){
            case "+":
                return number1+number2;
            case "-":
                return number1-number2;
            case "/":
                if(number2 == 0)
                    return 0;
                return number1/number2;
            case "*":
                return number1*number2;
            default:
                return 0;
        }
    }
}
