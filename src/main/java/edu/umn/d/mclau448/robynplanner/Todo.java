package edu.umn.d.mclau448.robynplanner;

public class Todo {
    private String task;
    private String description;
    private String deadLine;
    private Integer priority;

    public String getTask(){
      return this.task;
    }

    public String getDescription(){
        return this.description;
    }

    public String getDeadLine(){
        return this.deadLine;
    }

    public Integer getPriority(){
        return this.priority;
    }

    private Todo(TodoBuilder tdBuilder){
        this.task = tdBuilder.task;
        this.description = tdBuilder.description;
        this.deadLine = tdBuilder.deadLine;
        this.priority = tdBuilder.priority;
    }

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

