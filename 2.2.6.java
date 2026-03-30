/*
Exercise 2.2.6
Write a program to solve:
For simplicity, we only consider the real roots of the equations in this task.
- Linear Equation, Linear System and Second-degree Equation
*/

import javax.swing.JOptionPane;
public class Equation
{
    public static void main(String[] args)
    {
        String answer;
        answer = JOptionPane.showInputDialog(null, "Linear Equation, Linear System or Second-degree Equation", JOptionPane.QUESTION_MESSAGE);
        if(answer.equals("Linear Equation"))
        {
            double num1 = Double.parseDouble(JOptionPane.showInputDialog(null, "a = ", "Linear Equation: ax + b = 0", JOptionPane.QUESTION_MESSAGE));
            double num2 = Double.parseDouble(JOptionPane.showInputDialog(null, "b = ", "Linear Equation: ax + b = 0", JOptionPane.QUESTION_MESSAGE));

            String strResult1;

            if(num1 == 0)
            {
                if(num2 == 0)
                {
                    JOptionPane.showMessageDialog(null, "No solution equation!");
                }
                else
                {
                    JOptionPane.showMessageDialog(null, "Infinitely many solutions equation!");
                }
            }
            else
            {
                double Result1 = -(num2 / num1);
                strResult1 = "x =" + Result1;
                JOptionPane.showMessageDialog(null, strResult1, "Result", JOptionPane.INFORMATION_MESSAGE);
            }
        }

        else if(answer.equals("Linear System"))
        {
            String strResult2;

            double num11 = Double.parseDouble(JOptionPane.showInputDialog(null, "a11 = ", "Linear System", JOptionPane.QUESTION_MESSAGE));
            double num12 = Double.parseDouble(JOptionPane.showInputDialog(null, "a12 = ", "Linear System", JOptionPane.QUESTION_MESSAGE));
            double num1 = Double.parseDouble(JOptionPane.showInputDialog(null, "b1 = ", "Linear System", JOptionPane.QUESTION_MESSAGE));
            double num21 = Double.parseDouble(JOptionPane.showInputDialog(null, "a21 = ", "Linear System", JOptionPane.QUESTION_MESSAGE));
            double num22 = Double.parseDouble(JOptionPane.showInputDialog(null, "a22 = ", "Linear System", JOptionPane.QUESTION_MESSAGE));
            double num2 = Double.parseDouble(JOptionPane.showInputDialog(null, "b2 = ", "Linear System", JOptionPane.QUESTION_MESSAGE));

            double D = (num11 * num22) - (num21 * num12);
            double D1 = (num1 * num22) - (num2 - num12);
            double D2 = (num11 * num2) - (num21 * num1);

            if(D == 0)
            {
                if(D1 == 0 && D2 == 0)
                {
                    JOptionPane.showMessageDialog(null, "Infinitely many solutions equation!");
                }
                else
                {
                    JOptionPane.showMessageDialog(null, "No solution equation!");
                }
            }
            else
            {
                double x1 = D1 / D;
                double x2 = D2 / D;
                strResult2 = "x1 = " + x1 + "\nx2 = " + x2;
                JOptionPane.showMessageDialog(null, strResult2, "Result", JOptionPane.INFORMATION_MESSAGE);
            }
        }
        
        else if(answer.equals("Second-degree Equation"))
        {
            String strResult;
            double num1 = Double.parseDouble(JOptionPane.showInputDialog(null, "a = ", "Second-degree Equation: ax^2 + bx + c", JOptionPane.QUESTION_MESSAGE));
            double num2 = Double.parseDouble(JOptionPane.showInputDialog(null, "b = ", "Second-degree Equation: ax^2 + bx + c", JOptionPane.QUESTION_MESSAGE));
            double num3 = Double.parseDouble(JOptionPane.showInputDialog(null, "c = ", "Second-degree Equation: ax^2 + bx + c", JOptionPane.QUESTION_MESSAGE));

            double A = (num2 * num2) - (4 * num1 * num3);

            if(A > 0)
            {
                double Result31 = (-num2 + Math.sqrt(A)) / (2 * num1);
                double Result32 = (-num2 - Math.sqrt(A)) / (2 * num1);
                strResult = "x1 = " + Result31 + "\nx2" + Result32;
                JOptionPane.showMessageDialog(null, strResult, "Result", JOptionPane.INFORMATION_MESSAGE);
            }
            else if(A == 0)
            {
                double Result3 = (-num2) / (2 * num1);
                strResult = "x = " + Result3;
                JOptionPane.showMessageDialog(null, strResult, "Result", JOptionPane.INFORMATION_MESSAGE);
            }
            else if(A < 0)
            {
                JOptionPane.showMessageDialog(null, "No solution equation!", "Result", JOptionPane.INFORMATION_MESSAGE);
            }
        }
        System.exit(0);
    }
}