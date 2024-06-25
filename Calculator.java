 class Calculator {
    public static int calc(String a, int op1, int op2) {
        int result;

        if (a.equals("+")) {
            result = op1 + op2;
            return result;
        }
        else if (a.equals("-")) {
            result = op1 - op2;
            return result;
        }
        else if (a.equals("*")) {
            result = op1 * op2;
            return result;
        }
        else if (a.equals("/")) {
            result = op1 / op2;
            return result;
        }
        else return -1;

    }

    public static int convert (String op1roman) {
        if (op1roman.equals("I")) return 1;
        if (op1roman.equals("II")) return 2;
        if (op1roman.equals("III")) return 3;
        if (op1roman.equals("IV")) return 4;
        if (op1roman.equals("V")) return 5;
        if (op1roman.equals("VI")) return 6;
        if (op1roman.equals("VII")) return 7;
        if (op1roman.equals("VIII")) return 8;
        if (op1roman.equals("IX")) return 9;
        if (op1roman.equals("X")) return 10;
        return 0;

    }

    public static int convert2 (String op2roman) {
        if (op2roman.equals("I")) return 1;
        if (op2roman.equals("II")) return 2;
        if (op2roman.equals("III")) return 3;
        if (op2roman.equals("IV")) return 4;
        if (op2roman.equals("V")) return 5;
        if (op2roman.equals("VI")) return 6;
        if (op2roman.equals("VII")) return 7;
        if (op2roman.equals("VIII")) return 8;
        if (op2roman.equals("IX")) return 9;
        if (op2roman.equals("X")) return 10;
        else return 0;

    }
}

