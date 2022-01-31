package com.company;

public class Numbers {
    private String num1;
    private String num2;
    private String answer;

    public Numbers(String num1, String num2) {
        this.num1 = num1;
        this.num2 = num2;
    }

    public String getNum1() {
        return num1;
    }

    public void setNum1(String num1) {
        this.num1 = num1;
    }

    public String getNum2() {
        return num2;
    }

    public void setNum2(String num2) {
        this.num2 = num2;
    }

    public String getAdd() {
        double add = Double.parseDouble(num1) + Double.parseDouble(num2);
        answer = String.valueOf(add);
        return answer;
    }

    public String getSub() {
        double sub = Double.parseDouble(num1) - Double.parseDouble(num2);
        answer = String.valueOf(sub);
        return answer;
    }

    public String getMult() {
       double mult = Double.parseDouble(num1) * Double.parseDouble(num2);
        answer = String.valueOf(mult);
       return answer;
    }

    public String getDiv() {
        double div = Double.parseDouble(num1) / Double.parseDouble(num2);
        answer = String.valueOf(div);
        return answer;
    }

    public String getSquar1() {
        double squar = Double.parseDouble(num1) * Double.parseDouble(num1);
        answer = String.valueOf(squar);
        return answer;
    }

    public String getSquar2() {
        double squar = Double.parseDouble(num2) * Double.parseDouble(num2);
        answer = String.valueOf(squar);
        return answer;
    }

    public String getSquareRoot2() {
        double squa2 = Math.sqrt(Double.parseDouble(num2));
        answer = String.valueOf(squa2);
        return answer;
    }

    public String getSquareRoot1() {
        double squa1 = Math.sqrt(Double.parseDouble(num1));
        answer = String.valueOf(squa1);
        return answer;
    }

    public String get12() {
        answer = " surpriseee";
        return answer;
    }

    public String getFact1() {

        double num3 = Double.parseDouble(num1);
        double fact = num3;

        for( int i = 1; i < num3; i++) {
            fact = fact * (num3 -  i);
        }
        answer = String.valueOf(fact);
        return answer;
    }

    public String getFact2() {

        double num3 = Double.parseDouble(num2);
        double fact = num3;

        for( int i = 1; i < num3; i++) {
            fact = fact * (num3 -  i);
        }
        answer = String.valueOf(fact);
        return answer;
    }



    public String getAnswer() {
        return answer;
    }

    public void setAnswer(String answer) {
        this.answer = answer;
    }
}
