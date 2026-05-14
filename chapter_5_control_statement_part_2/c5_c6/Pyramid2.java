package chapter_5_control_statement_part_2.c5_c6;

public class Pyramid2 {
    
    public static void main(String[] args){

        // 4ta line top to down(vertical)
        for(int i=1; i<=4; i++){
            // Specific line er jonno
            for(int j=4; j>=1; j--){
                // space create korche. note: j>=i dilam na else part niye kaj korar jonno.
                if (j>i) {
                    System.out.print(" ");
                }
                // space soho star print korbe jokhon "i" "j" er equal or boro. 
                else{
                    System.out.print(" *");
                }
            }
            // cursor next line a niyar jonno.
            System.out.println();
        }

    }
}
