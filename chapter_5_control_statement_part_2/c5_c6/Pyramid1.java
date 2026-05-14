package chapter_5_control_statement_part_2.c5_c6;

public class Pyramid1 {

    public static void main(String[] args){
        // 4ta line top to down(vertical) 
       for(int i=1; i<=4; i++){
        // Specific line er jonno Space create korbe, first theke "i" er value porjonto.
        for(int j=4; j>=i; j--){
            System.out.print(" ");
        }

        // Specific line er jonno Star create korbe, "i" er value er pore theke. and ei star add hobe "j" er line er sathei.
        for(int k=1; k<=i; k++){
            System.out.print(" *");
        }

        // cursor next line a niyar jonno.
        System.out.println();
       }

    }
}