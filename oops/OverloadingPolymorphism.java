package oops;

public class OverloadingPolymorphism {
    public int add(int a ,int b){
        return a+b;
    }

    public int add(int a ,int b,int c){
        return a+b+c;
    }

    public double add(double a, double b){
        return a+b;
    }

    public static void main(String[] args) {
        OverloadingPolymorphism p = new OverloadingPolymorphism();
        int a= 1;
        int b=3;
        int c = 4;

        System.out.println(p.add(a,b));
        System.out.println(p.add(a,b,c));
        System.out.println(p.add(a,5.5));
    }
}
