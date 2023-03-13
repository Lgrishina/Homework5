public class Dog extends Animal {

    public Dog(String name, String description) {
        super(name, description);
    }

    @Override public void makeNoise(){
        System.out.println("Пес делает Гав");
    }

    @Override public void eat(){
        System.out.println("Пес любит серы Камушки");
    };

    @Override public String getDescription(){
        return ("пес " + description);
    };

}