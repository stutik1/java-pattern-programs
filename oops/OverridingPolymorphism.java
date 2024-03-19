package oops;

class Animals {
    public void sound() {
        System.out.println("Animal make sound");
    }
}

class Dogs extends Animals{
    @Override
    public void sound() {
        System.out.println("Boo Boo");
    }
}


class cat extends Animals{
    @Override
    public void sound() {
        super.sound();
        System.out.println("Mew Mew");
    }
}
public class OverridingPolymorphism {
    public static void main(String[] args) {
        Animals animals = new Animals();
        Animals dog = new Dogs();
        dog.sound();
        animals.sound();
    }
}
