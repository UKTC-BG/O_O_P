package CALCULATOR;

import javax.swing.*;
//import java.awt.event.ActionEvent;
//import java.awt.event.ActionListener;

public class MyCalculator {



    private double total1 = 0.00;
    private double total2 = 0.00;


    private JPanel JavaCalculator;
    private JTextField textDisplay;
    private JButton btnOne;
    private JButton btnTwo;
    private JButton btnTree;
    private JButton btnFour;
    private JButton btnFive;
    private JButton btnSix;
    private JButton btnSeven;
    private JButton btnEight;
    private JButton btnNine;
    private JButton btnZero;
    private JButton btnPoint;
    private JButton btnClear;
    private JButton btnPlus;
    private JButton btnMinus;
    private JButton btnMultiply;
    private JButton btnDivide;
    private JButton btnEquals;


    private MyCalculator() {

// BUTTON [ 1 ] - ACTIONS --------------------------------------------------
        btnOne.addActionListener(e -> {
            String btnOneText = textDisplay.getText() + btnOne.getText();
            textDisplay.setText(btnOneText);
        }
        );


// BUTTON [ 2 ] - ACTIONS --------------------------------------------------
        btnTwo.addActionListener(e -> {
            String btnTwoText = textDisplay.getText() + btnTwo.getText();
            textDisplay.setText(btnTwoText);
        }
        );


// BUTTON [ 3 ] - ACTIONS --------------------------------------------------
        btnTree.addActionListener(e -> {
            String btnTreeText = textDisplay.getText() + btnTree.getText();
            textDisplay.setText(btnTreeText);
        }
        );


// BUTTON [ 4 ] - ACTIONS --------------------------------------------------
        btnFour.addActionListener(e -> {
            String btnFourText = textDisplay.getText() + btnFour.getText();
            textDisplay.setText(btnFourText);
        }
        );


// BUTTON [ 5 ] - ACTIONS --------------------------------------------------
        btnFive.addActionListener(e -> {
            String btnFiveText = textDisplay.getText() + btnFive.getText();
            textDisplay.setText(btnFiveText);
        }
        );


// BUTTON [ 6 ] - ACTIONS --------------------------------------------------
        btnSix.addActionListener(e -> {
            String btnSixText = textDisplay.getText() + btnSix.getText();
            textDisplay.setText(btnSixText);
        }
        );


// BUTTON [ 7 ] - ACTIONS --------------------------------------------------
        btnSeven.addActionListener(e -> {
            String btnSevenText = textDisplay.getText() + btnSeven.getText();
            textDisplay.setText(btnSevenText);
        }
        );


// BUTTON [ 8 ] - ACTIONS -----------------------------------------------------
        btnEight.addActionListener(e -> {
            String btnEightText = textDisplay.getText() + btnEight.getText();
            textDisplay.setText(btnEightText);
        }
        );


// BUTTON [ 9 ] - ACTIONS -----------------------------------------------------
        btnNine.addActionListener(e -> {
            String btnNineText = textDisplay.getText() + btnNine.getText();
            textDisplay.setText(btnNineText);
        }
        );


// BUTTON [ 0 ] - ACTIONS -----------------------------------------------------
        btnZero.addActionListener(e -> {
            String btnZeroText = textDisplay.getText() + btnZero.getText();
            textDisplay.setText(btnZeroText);
        }
        );


// BUTTON [ + ] - ACTIONS -----------------------------------------------------
        btnPlus.addActionListener(e -> {
            total1 = total1 + Double.parseDouble(textDisplay.getText());
            textDisplay.setText("");
        });


// BUTTON [ = ] - ACTIONS -----------------------------------------------------
        btnEquals.addActionListener(e -> {
            total2 = total1 + Double.parseDouble(textDisplay.getText());
            String str1 = Double.toString(total2);
            textDisplay.setText(str1);
            total1 = 0;
        });


// BUTTON [ CE ] - ACTIONS ----------------------------------------------------
        btnClear.addActionListener(e -> {
            total2 = 0;
            textDisplay.setText("");


        });


        btnPoint.addActionListener(e -> {
            if(textDisplay.getText().equals("")) {
                textDisplay.setText("0.");
            }
            else
                if (textDisplay.getText().contains(".")) {
                    btnPoint.setEnabled(false);
                }
                else {
                    String btnPointText = textDisplay.getText() + btnPoint.getText();
                    textDisplay.setText(btnPointText);
                }

                btnPoint.setEnabled(true);
        });



    }// End of MyCalculator Method ============================================




// MAIN =======================================================================
    public static void main(String[] args) {

        //FlatLightLaf.install();

        JFrame frame = new JFrame("MyCalculator");
        frame.setContentPane(new MyCalculator().JavaCalculator);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);

    }// End of Main
}// End of Class
