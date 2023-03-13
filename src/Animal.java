public class Animal {
    public String name;
    public String description;

    public Animal(String name, String description) {
        this.name = name;
        this.description = description;
    }

    public void makeNoise(){
        System.out.println("Какой-то звук");
    };

    public void eat(){
        System.out.println("Какая-то еда");
    };
    public String getDescription(){
        return description;
    };
}



//    Метод makeNoise, например, может выводить на консоль звуки животных.
//    Метод  eat выводит на консоль список того, чем питается данное животное.
//    Метод getDescription возвращает описание животного.
