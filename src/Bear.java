public class Bear extends Animal {

    public Bear(String name, String description) {
        super(name, description);
    }

    @Override public void makeNoise(){
        System.out.println("Медведь делает РРР");
    }

    @Override public void eat(){
        System.out.println("Медведь любит Мед");
    };

    @Override public String getDescription(){
        return ("медведь " + description);
    };

}