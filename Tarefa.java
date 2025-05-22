package com.RastreadorDeTarefas;
import java.util.Objects;
import java.util.UUID;
import java.time.LocalDateTime;


public class Tarefa {
    final String id = UUID.randomUUID().toString();
    private String descricaoTarefa;
    final LocalDateTime criadoEm = LocalDateTime.now();;
    private LocalDateTime atualizadoEm;
    private Status status;

    public Tarefa(String descricao, Status status){
        setDescricaoTarefa(descricao);
        setStatus(status);
    }


    public void setDescricaoTarefa(String tarefa){
        if(tarefa.isBlank()){
            throw new IllegalArgumentException("Este campo não pode ser deixado em branco");
        }
        this.descricaoTarefa = tarefa;
    }

    public String getDescricaoTarefa(){
        return this.descricaoTarefa;
    }
    public LocalDateTime getCriadoEm(){
        return this.criadoEm;
    }


    public void setStatus(Status  status){
        Objects.requireNonNull(status,"Este campo só aceita os seguintes valores - Inicio, Desenvolvimento, Feito");
        this.atualizadoEm = LocalDateTime.now();
        this.status = status;
    }

    public Status getStatus(){
        return this.status;
    }

    public String toString(){
        return String.format("Tarefa: "+ getDescricaoTarefa());
    }
}
