package edu.umn.d.mclau448.robynplanner;

/**
 * This class represents the task items in our Planner Pages in our program.
 */
public class Todo {
    private String task;
    private String description;
    private String deadLine;
    private Integer priority;

    /**
     * Our actual task that needs to be done.
     *
     * @return String representing a task
     */
    public String getTask(){
      return this.task;
    }

    /**
     * Description of the task to complete
     *
     * @return String representing a description
     */
    public String getDescription(){
        return this.description;
    }

    /**
     * The deadline for our Todo, it should send the user an alert when the day comes...
     *
     * @return String representing the deadline for our task.
     */
    public String getDeadLine(){
        return this.deadLine;
    }

    /**
     * Level of priority our task will have. Will be given on a scale from 1 (most important) to 4 (least important)
     *
     * @return Integer representing how important our task is.
     */
    public Integer getPriority(){
        return this.priority;
    }

    private Todo(TodoBuilder tdBuilder){
        this.task = tdBuilder.task;
        this.description = tdBuilder.description;
        this.deadLine = tdBuilder.deadLine;
        this.priority = tdBuilder.priority;
    }

    /**
     * Class to build our Todo object. There are a lot of optional paramters, so I thought using a builder to create
     * a Todo object would be appropriate.
     */
    //Builder for a Todo
    public static class TodoBuilder {
        private String task;
        private String description = null;
        private String deadLine = null;
        private Integer priority = null;



        public TodoBuilder(String task){
            this.task = task;
        }

        public TodoBuilder setDescription(String description){
            this.description = description;
            return this;
        }

        public TodoBuilder setDeadline(String deadLine){
            this.deadLine = deadLine;
            return this;
        }

        public TodoBuilder setPriority(Integer priority){
            this.priority = priority;
            return this;
        }

        public Todo build(){
            return new Todo(this);
        }

    }
}

