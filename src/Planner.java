import java.util.*;

import static java.util.Collection.*;

public class Planner {
    private final List<Task> tasks ;

    public Planner() {
        this.tasks = new ArrayList<>();
    }

    public void add(Task task){
        this.tasks.add(task);
    }

    public void showAll(){
        for (Task task : tasks) {
            System.out.println(task);
        }
    }

    public Task getTask(String subject) {  //поиск по названию задачи
        return tasks.stream()
                .filter(task -> task. getSubject().equals(subject))
                .findFirst()
                .orElse(null);
    }

    public void totalSearch(String keyword){
        int res = 0;
        System.out.println("Вы ищете задачи по слову: "+keyword);
        for (Task task : tasks) {
            String temp = task.toString();
            if (temp.toLowerCase().contains(keyword.toLowerCase())) {
                res++;
                System.out.println(temp);
            }
        }
        if (res == 0) {
            String myRes = String.format("Совпадений со словом %s нет", keyword);
            System.out.println(myRes);
        }
    }

public void sortByPrior(){
    Collections.sort(tasks);
}

}



    //    public void writeNewTask() {
//        Scanner iScan = new Scanner(System.in);
//
//        System.out.println("Добавление задачи в планер. \nПоставьте срок исполнения:");
//        String endOfTask = iScan.nextLine();
//
//        System.out.println("\nАвтор задачи:");
//        String author = iScan.nextLine();
//
//        System.out.println("\nЧто нужно сделать:");
//        String subject = iScan.nextLine();
//
//        System.out.println("\nУстановите приоритет: 0 - не устанавливать, 1 - низкий, 2 - средний, 3 - высокий");
//        try {
//            int priority = iScan.nextInt();
//        } catch (Exception e) {
//            throw new RuntimeException(e);
//        }
//    }



