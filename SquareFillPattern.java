public class SquareFillPattern {
    public static void squareFill(int n){
        for(int i=0;i<=n;i++){
            for (int j=0;j<=n;j++){
                System.out.print("*");
            }
            System.out.println(" ");
        }
    }
    public static void main(String[] args) {
        int n=4;
        squareFill(n);
    }
}
