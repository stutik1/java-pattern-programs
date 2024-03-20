package oops;

    class SuperClass {
        SuperClass() {
            System.out.println("Superclass constructor");
        }
    }

    class SubClass extends SuperClass {
        SubClass() {
            super(); // Implicit call to superclass constructor
            System.out.println("Subclass constructor");
        }
    }

    public class ConstructorOverriding {
         static public void main(String[] args) {
            SubClass obj = new SubClass();
        }
    }
