import java.util.Collections;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Task t1= new Task("Купить елку", "Валерия", 3,"31.12");
        Task t2 = new Task();
        Task t3 = new Task("Пригласить друзей","Валерия", 3, "29.12" );
        Task t4 = new Task("Купить подарки","Валерия", 1, "29.12" );
        Task t5 = new Task("Приготовить наряд","Валерия", 2, "29.12" );
        Planner myP= new Planner();
        myP.add(t1);
        myP.add(t2);
        myP.add(t3);
        myP.add(t4);
        myP.add(t5);
//        Scanner scanner = new Scanner(System.in);
//        Menu menu = new Menu(scanner);
//        UserInterface userInterface = new UserInterface(scanner,menu,myP);
//        userInterface.start();

        myP.sort();
        myP.showAll();

    }
}