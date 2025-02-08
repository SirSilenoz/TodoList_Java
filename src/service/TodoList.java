package service;

import model.Task;

import java.util.ArrayList;
import java.util.List;


//Lista de tarefas
public class TodoList {

    List<Task> tasks = new ArrayList<>();
    List<Task> completedTask = new ArrayList<>();

    public void adicionarTask(Integer id, String description) {
        if (tasks.stream().anyMatch(task -> task.getId() == id)) {
            System.out.println("Erro: já existe uma tarefa com esse ID");
            return;
        } else {
            tasks.add(new Task(id, description));
        }
    }

    public void removerTask(Integer id) {
        tasks.removeIf(task -> task.getId() == id);
    }

    public void concluirTask(Integer id) {
        tasks.stream()
                .filter(task -> task.getId() == id) //Filtra a tarefa pelo id
                .findFirst() //Pega a primeira tarefa encontrada
                .ifPresent(task -> {
                    task.setCompleted(true); //Marca a tarefa como concluída
                    completedTask.add(task); //Adiciona a tarefa na lista de concluída
                    tasks.remove(task); //Remove da lista de tarefas pendentes
                    //Tarefa não encontrada
                });

    }

    public void verTask() {
        System.out.println("Tarefas pendentes: ");
        tasks.forEach(System.out::println);
        System.out.println("Tarefas concluídas: ");
        completedTask.forEach(System.out::println);
    }
}


