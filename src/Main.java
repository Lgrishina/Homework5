import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args){
        Vet v = new Vet();

Animal animals[] = new Animal[3];

        animals[0] = new Cat("том", "рыжий");
        animals[1] = new Dog("рекс", "мохнатый");
        animals[2] = new Bear("михаил", "бурый");

        for (Animal a: animals){
            v.treatAnimal(a);
        }

        for (Animal a: animals){
            a.eat();
            a.makeNoise();
        }

    }
}