package main;

import service.TodoList;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        TodoList todoList = new TodoList();
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("\n1.Adicionar Tarefa \n2.Remover Tarefa \n3.Concluir Tarefa \n4.Mostrar tarefa \n5.Sair");
            int option = sc.nextInt();
            sc.nextLine();
            System.out.println();

            switch (option) {
                case 1://Adicionar Tarefa
                    System.out.println("Digite o ID e Descrição: ");
                    int id = sc.nextInt();
                    String description = sc.nextLine();
                    todoList.adicionarTask(id, description);
                    break;
                case 2: //Remover Tarefa
                    System.out.println("Digite o ID: ");
                    id = sc.nextInt();
                    todoList.removerTask(id);
                    break;
                case 3: //Concluir Tarefa
                    System.out.println("Digite o ID: ");
                    id = sc.nextInt();
                    todoList.concluirTask(id);
                    break;
                case 4: //Mostrar Tarefa
                    todoList.verTask();
                    break;
                case 5: //Sair
                    System.out.println("Saindo...");
                    sc.close();
                    return;
                default:
                    System.out.println("Opção inválida, tente novamente.");

            }
        }
    }
}
