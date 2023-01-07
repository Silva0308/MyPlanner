import java.util.Scanner;

public class UserInterface {

    private final Scanner scanner;
    private final Menu menu;
    private final Planner planner;

    public UserInterface(Scanner scanner, Menu menu, Planner planner) {
        this.scanner = scanner;
        this.menu = menu;
        this.planner = planner;
    }

    public void start() {

        while (true) {
            switch (menu.selectFunction()) {
                case "1": // показать все задачи
                    planner.showAll();
                    break;
                case "2": // найти задачу по теме
                    System.out.print("Введите тему задачи: ");
                    System.out.println(planner.getTask(scanner.nextLine()));
                    break;
                case "3": // найти задачу по автору
                    System.out.print("Введите имя: ");
                    planner.totalSearch(scanner.nextLine());
                    break;
//                case "4": // найти задачи по приоритету
//                    System.out.println("Сначала показаны : ");
//                    search.areSiblings(scanner.nextLine(), scanner.nextLine());
//                    break;
                case "5": // выполнить запись планера в файл
                    saveFile();
                    break;
//                case "6": // добавить новую задачу
//                    System.out.print("Введите имя: ");
//                    planner.totalSearch(scanner.nextLine());
//                    break;
                case "7": // изменить задачу
                    menu.selectSearchType();

                case "0": // выход
                    System.exit(0);
                    break;
                default:
                    System.out.println("Неверный ввод");
            }
        }
    }
    public void saveFile(){
        while (true){
            switch (menu.selectSaveType()){
                case "1": // CSV
//                    planner.showAll();
                    System.out.println("Сохранено в CSV");
                    break;
                case "2": // JSOM
                    System.out.print("Сохранено в JSOM");
                    break;
                case "3": //XML
                    System.out.print("Сохранено в XML");
                    break;
                case "4": //XML
                    start();
                    break;
                case "0": // выход
                    System.exit(0);
                    break;
                default:
                    System.out.println("Неверный ввод");

            }
        }
    }
public  void changeTask(){
        while (true){
           switch (menu.selectTaskMeth()){
               case "1": //меняем тему
           }
        }
}

}