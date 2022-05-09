package com.example.testapp41;


import java.util.regex.Pattern;

public class Maz {
    private Pattern pattern = Pattern.compile("-?\\d+(\\.\\d+)?");

    public String add(String a, String b) {
        String result = "";
        if (a.isEmpty() || b.isEmpty()) {
            return "Пусто";
        }
        if (isNumbers(a) || isNumbers(b)) {
            int num1 = Integer.parseInt(a);
            int num2 = Integer.parseInt(b);

            result = String.valueOf(num1 + num2);
        } else {
            result = "Буквы нельзя";
            System.out.println("Буквы нельзя");
        }
        return result;
    }

    public String divides(String a, String b) {
        String result = "";
        if (b.equals("0") || a.equals("0")) {
            result = "на ноль нельзя";
        } else if (Integer.parseInt(b) % 2 == 0 && Integer.parseInt(a) % 2 == 1){
          result = "делить нельзя";
        }else {
            int num1 = Integer.parseInt(a);
            int num2 = Integer.parseInt(b);
            return String.valueOf(num1 / num2);
        }
        return result;
    }


    public boolean isNumbers(String strNum) {
        if (strNum == null) {
            return false;
        }
        return pattern.matcher(strNum).matches();
    }
}
