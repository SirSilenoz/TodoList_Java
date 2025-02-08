package model;

//Tarefas
    public class Task {
        private Integer id;
        private String description;
        private boolean isCompleted;

        public Task(int id, String description) {
            this.id = id;
            this.description = description;
            this.isCompleted = false;
        }

        public Integer getId() {
            return id;
        }

        public void setId(Integer id) {
            this.id = id;
        }

        public String getDescription() {
            return description;
        }

        public void setDescription(String description) {
            this.description = description;
        }

        public boolean isCompleted() {
            return isCompleted;
        }

        public void setCompleted(boolean completed) {
            isCompleted = completed;
        }

        @Override
        public String toString() {
            return "Tarefa: " +
                    "ID: " + id +
                    ", Descrição: '" + description + '\'' +
                    ", Concluída: " + isCompleted;
        }
    }
