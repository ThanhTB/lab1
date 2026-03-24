
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Tiến Thành
 */
public class bai64 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int thang = -1;
        int nam = -1;
        while(true){
            System.out.println("nhap thang(full name, abbreviation, 3 letters, or number)");
            String thangInput = sc.nextLine().trim();
            thang = getthangNumber(thangInput);
            if(thang==-1){
                System.out.println("thang k hop le, nhap lai");
                continue;
            }
            
            System.out.println("nhap nam");
            String namInput = sc.nextLine().trim();
            
            if(namInput.matches("\\d+")){
                nam = Integer.parseInt(namInput);
                break;
            }
            else 
                System.out.println("nam k hop le");
            
        }
        int songay = tinhsongay(thang,nam);
        System.out.println(songay);
    }
    public static int getthangNumber(String input){
        input = input.toLowerCase();
        switch(input){
            case "january": case "jan.": case "jan": case "1": return 1;
            case "february": case "feb.": case "feb": case "2": return 2;
            case "march": case "mar.": case "mar": case "3": return 3;
            case "april": case "apr.": case "apr": case "4": return 4;
            case "may": case "5": return 5;
            case "june": case "jun": case "6": return 6;
            case "july": case "jul": case "7": return 7;
            case "august": case "aug.": case "aug": case "8": return 8;
            case "september": case "sept.": case "sep": case "9": return 9;
            case "october": case "oct.": case "oct": case "10": return 10;
            case "november": case "nov.": case "nov": case "11": return 11;
            case "december": case "dec.": case "dec": case "12": return 12;
            default: return -1; // Trả về -1 nếu người dùng nhập linh tinh
        }
    }
    public static int tinhsongay(int thang, int nam){
        switch(thang){
            case 4: case 6: case 9: case 11:
                return 30;
            case 2:
                if((nam%4==0&&nam%100!=0)||(nam%400==0))
                    return 29;
                else 
                    return 28;
            default:
                return 31;
        }
    }
}
