package com.RastreadorDeTarefas;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
       // Tarefa tarefa1 = new Tarefa("Fazer um rastreador de tarefa em java","Iniciando");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Bem-Vindo ao Task Tracker seu organizador de tarefas");
        while (true){
            System.out.println("Deseja criar uma nova tarefa 0-Não e 1-Sim");
            String NovaTarefa = scanner.nextLine();
            if (NovaTarefa == "0"){
                System.out.println("Ok, Tarefas não seram criadas");
                break;
            }
            System.out.println("Vamos cria sua nova tarefa !");
            System.out.println("Informe o nome da tarefa");
            String nomeTarefa = scanner.nextLine();

            System.out.println("Informe a descrição da tarefa");
            String descricaoTarefa = scanner.nextLine();

            System.out.println("Informe o status da tarefa");
            String statusTarefa = scanner.nextLine();

            System.out.println("Sua tarefa está sendo criada");
            //Tarefa tarefa2 = new Tarefa(descricaoTarefa,statusTarefa);
            System.out.println("Tarefa criada com sucesso");
        }
    }
}