package edu.umn.d.mclau448.robynplanner;

import java.util.HashMap;

/**
 * This is a class that any Page that has to do with planning will derive from. So, things like a daily, weekly, monthly,
 * or project planner will use this class. It manages a task list of Todo objects. So it is in charge of adding and
 * removing Todos from the hashmap.
 */

public class Planner{
    private String plannerTitle;
    private HashMap<String, Todo> taskList = new HashMap<>();

    public Planner(String plannerTitle){
        this.plannerTitle = plannerTitle;
    }

    /**
     * This just creates a Todo and adds it to our task list.
     *
     * @param task String representing the task needed to be done
     * @param desc String describing the task(optional)
     * @param deadLine String representing the deadline for the task(optional)
     * @param priority Integer representing the priority level for the task(Optional)
     */
    public void addTodo(String task, String desc, String deadLine, Integer priority){
        Todo t = new Todo.TodoBuilder(task)
                .setDescription(desc)
                .setDeadline(deadLine)
                .setPriority(priority)
                .build();

        taskList.put(t.getTask(), t);
    }

    /**
     * Removes a given task from the HashMap.
     *
     * @param task String representing the actual task for our Todo object.
     */
    public void removeTodo(String task){
        taskList.remove(task);
    }

}
