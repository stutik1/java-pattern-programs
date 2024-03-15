package pattern;

public class NumberIncreasingReversePyramid {
    public static void numberIncreasingReversePyramid(int n){
        for (int i=1;i<=n;i++){
            for (int j=1;j<=n-i;j++){
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        int n=5;
        numberIncreasingReversePyramid(n);
    }
}
