import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Введите выражение чисел от 1 до 10 (от I до Х) \n"+
                "Пример: (3 + 8), или (IX * III)        :) ");
        String[] a = sc.nextLine().split(" ");

        int opR1;
        int opR2;

        try {
             opR1 = Calculator.convert(a[0]);
             opR2 = Calculator.convert2(a[2]);
        }
        catch (ArrayIndexOutOfBoundsException e) {
            throw new ArrayIndexOutOfBoundsException("//т.к. строка не является математической операцией");
        }

         opR1 = Calculator.convert(a[0]);
         opR2 = Calculator.convert2(a[2]);

        boolean checkNumber = CheckNumber.CheckNumber1(a[0]) && CheckNumber.CheckNumber2(a[2]);

        int result;


        boolean rr = false;


        if (a.length != 3) {
            throw new ArithmeticException("//т.к. формат математической операции не удовлетворяет заданию - два операнда и один оператор (+, -, /, *)");
        }

        if (CheckNumber.CheckNumber1(a[0]) == rr && CheckNumber.CheckNumber2(a[2]) == !rr ||
                CheckNumber.CheckNumber1(a[0]) == !rr && CheckNumber.CheckNumber2(a[2]) == rr) {
            throw new ArithmeticException("//т.к. используются сразу две системы исчисления");
        }



        if (checkNumber == rr) {
            if (Calculator.convert(a[0]) == 0 || Calculator.convert2(a[2]) == 0 ) {
                throw new ArithmeticException("Неверная операция / Sorry... на вход числа только от I до X");


            }

            switch (a[1]) {
                case "+":
                    result = opR1 + opR2;
                    System.out.println(RomanToArab.convertNumToRoman(result));
                    break;
                case "-":
                    result = opR1 - opR2;

                    if (RomanToArab.convertNumToRoman(result).equals("error")) {
                        throw new ArithmeticException("//т.к. в римской системе нет отрицательных чисел");
                    }

                    System.out.println(RomanToArab.convertNumToRoman(result));
                    break;
                case "*":
                    result = opR1 * opR2;
                    System.out.println(RomanToArab.convertNumToRoman(result));
                    break;
                case "/":
                    result = opR1 / opR2;
                    System.out.println(RomanToArab.convertNumToRoman(result));
            }

        } else {

            int op1 = Integer.parseInt(a[0]);
            int op2 = Integer.parseInt(a[2]);

                if (op2 > 10 | op2 < 1 || op1 > 10 | op1 < 1) {
                    throw new ArithmeticException("Sorry... на вход числа только от 1 до 10");
                }
            result = Calculator.calc(a[1], op1, op2);
                if (result == -1){
                    throw new ArithmeticException("//т.к. формат математической операции не удовлетворяет заданию" +
                            " - два операнда и один оператор (+, -, /, *)");
                }
            System.out.println(result);



        }

    }
}

//            (op2 > 10 | op2 < 1 || op1 > 10 | op1 < 1) {
//                System.out.println("Числа от 1 до 10, попробуйте снова!");
//



