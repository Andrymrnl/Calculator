 class CheckNumber {
    public static boolean CheckNumber1(String a0) {
        boolean isOnlyDigits = true;
        for (int i = 0; i < a0.length() && isOnlyDigits; i++) {
            if (!Character.isDigit(a0.charAt(i))) {
                isOnlyDigits = false;
            }
        }
        return isOnlyDigits;

    }

    public static boolean CheckNumber2(String a2) {
        boolean isOnlyDigits = true;
        for (int i = 0; i < a2.length() && isOnlyDigits; i++) {
            if (!Character.isDigit(a2.charAt(i))) {
                isOnlyDigits = false;
            }
        }
        return isOnlyDigits;
    }

}


