package src.DSAprep;

public class Pattern {
    public static void main(String[] args) {
        pattern(5);
    }

    static void pattern(int n){
        for(int row=n;row>0;row--){
            for(int col=1;col<=row;col++){
                System.out.print("$");
            }
            System.out.println();
        }
    }
}
