package com.company;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Screen extends JFrame{
    private JPanel panelMain;
    private JButton subtractButton;
    private JButton additionButton;
    private JButton divisionButton;
    private JButton multiplicationButton;
    private JTextField textNumber1;
    private JTextField textNumber2;
    private JPanel panelTop;
    private JPanel panelSub;
    private JPanel panelAdd;
    private JPanel panelDiv;
    private JPanel panelMult;
    private JPanel panelAns;
    private JPanel panelNum;
    private JLabel labelAnswer;
    private JButton squredButton;
    private JButton factorButton;
    private JPanel panelSquar;
    private JPanel panelFact;
    private JButton a12Button;
    private JButton squareButton;

    Screen() {
        super("Calculator Project");
        this.setContentPane(this.panelMain);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.pack();

        subtractButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String a = textNumber1.getText();
                String b = textNumber2.getText();
                Numbers num = new Numbers(a,b);
                labelAnswer.setText(num.getSub());

            }
        });

        additionButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String a = textNumber1.getText();
                String b = textNumber2.getText();
                Numbers num = new Numbers(a,b);
                labelAnswer.setText(num.getAdd());

            }
        });

        a12Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String a = textNumber1.getText();
                String b = textNumber2.getText();
                Numbers num = new Numbers(a,b);
                labelAnswer.setText(num.get12());

            }
        });

        multiplicationButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String a = textNumber1.getText();
                String b = textNumber2.getText();
                Numbers num = new Numbers(a,b);
                labelAnswer.setText(num.getMult());

            }
        });

        divisionButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String a = textNumber1.getText();
                String b = textNumber2.getText();
                Numbers num = new Numbers(a,b);
                labelAnswer.setText(num.getDiv());

            }
        });

        factorButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String a = textNumber1.getText();
                String b = textNumber2.getText();
                Numbers num = new Numbers(a,b);

                if(a.equals("")) {
                    labelAnswer.setText(num.getFact2());;
                }else {
                    labelAnswer.setText(num.getFact1());;
                }

            }
        });

        squredButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String a = textNumber1.getText();
                String b = textNumber2.getText();
                Numbers num = new Numbers(a,b);
                if(a.equals("")) {
                    labelAnswer.setText(num.getSquar2());
                }else {
                    labelAnswer.setText(num.getSquar1());
                }

            }
        });

        squareButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String a = textNumber1.getText();
                String b = textNumber2.getText();
                Numbers num = new Numbers(a,b);
                if(a.equals("")) {
                    labelAnswer.setText(num.getSquareRoot2());
                }else {
                    labelAnswer.setText(num.getSquareRoot1());
                }

            }
        });



    }
}
