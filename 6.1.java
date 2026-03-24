/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
import javax.swing.JOptionPane;
/**
 *
 * @author Tiến Thành
 */
public class ChoosingOption1 {
    public static void main(String[] args) {
        int option  = JOptionPane.showConfirmDialog(null,"Do you want to change to the first class ticket");
        JOptionPane.showMessageDialog(null, "you,ve chosen: " + (option == JOptionPane.YES_OPTION?"Yes":"No"));
        System.exit(0);
    }
}