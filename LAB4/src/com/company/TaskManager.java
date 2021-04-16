package lab4;

import Lab2.Task;
import Lab2.taskCategory;

public interface TaskManager {
    Task addTask(Task t);
    void removeTask(Task t);
    Task[] getAllTasks();
    Task getTaskByName(String taskName);
    public static final Task [] tasks = {
            new Task("Trening", "Wykonać 30minutowy trening w ramach WF-u", taskCategory.NEW),
            new Task("Gotowanie", "Przygotować posiłek do pracy", taskCategory.DONE),
            new Task("Zadania", "Wykonać sprawozdania z Optoelektroniki", taskCategory.IN_PROGRESS),
            new Task("Projekt", "Wykonać projekt na Układy Scalone",taskCategory.DONE),
            new Task("Planowanie", "Przygotować to do list na cały tydzień", taskCategory.NEW),
            new Task("Sprzatanie", "Posprzatac mieszkanie", taskCategory.IN_PROGRESS),
            new Task("Hobby", "Przeczytać artykuł", taskCategory.NEW),
            new Task("Szukanie pracy", "Napisać i rozesłać CV", taskCategory.IN_PROGRESS),

    };

}
