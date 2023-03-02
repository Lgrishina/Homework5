import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String entered = "";
        String password = "пароль";
        String exit = "выйти";
        System.out.println("Введите пароль");

       do{
        Scanner scan = new Scanner(System.in);
        entered = scan.nextLine();
        if (!entered.equals(password)&&!entered.equals(exit)){
        System.out.println("неверный пароль, попробуйте еще раз");}
       }
        while(!entered.equals(password)&&!entered.equals(exit));

        if(entered.equals(password)){
            System.out.println("ура, угадал!");
        }
    }
}