package br.com.tarefas.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "tarefas")
public class Tarefa {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    private String descricao;
    private boolean concluida;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public boolean isConluida() {
        return concluida;
    }

    public void setConluida(boolean conluida) {
        this.concluida = conluida;
    }

    public String toString() {
        return String.format("Id: %d\nDescrição: %s\nConcluída: %s\n", this.id, this.descricao, this.concluida ? "Sim" : "Não");

    }
}
