package edu.umn.d.mclau448.robynplanner;

import java.util.HashMap;

public class PlannerPage implements Page{
    private String plannerTitle;
    private HashMap<String, Todo> taskList = new HashMap<>();

    public PlannerPage(String plannerTitle){
        this.plannerTitle = plannerTitle;
    }

    public void addTodo(String task, String desc, String deadLine, Integer priority){
        Todo t = new Todo.TodoBuilder(task)
                .setDescription(desc)
                .setDeadline(deadLine)
                .setPriority(priority)
                .build();

        taskList.put(t.getTask(), t);
    }

    public void removeTodo(String task){
        taskList.remove(task);
    }

    @Override
    public String getPageType() {
        return "PlannerPage";
    }

    @Override
    public void save() {

    }

    @Override
    public void load(String data) {

    }

}
