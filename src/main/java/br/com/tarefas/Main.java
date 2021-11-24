package br.com.tarefas;

import br.com.tarefas.models.Tarefa;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class Main {
    public static void main(String[] args) {
        EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("tarefas-mysql");

        EntityManager entityManager = entityManagerFactory.createEntityManager();

//        //Insert
//        Tarefa tarefa = new Tarefa();
//        tarefa.setDescricao("O dinheiro vem até mim de diversas fontes");
//        tarefa.setConluida(true);
//
//        entityManager.persist(tarefa);
//        entityManager.getTransaction().begin();
//        entityManager.getTransaction().commit();
//
//        System.out.println(tarefa.getId());
//
//        //Find
//        Tarefa tarefa = entityManager.find(Tarefa.class,1);
//
//        if(tarefa != null){
//            System.out.println(tarefa.toString());
//        }
//
//        else{
//            System.out.println("Tarefa não encontrada.");
//        }
//
//        //Update
//        Tarefa tarefa = entityManager.find(Tarefa.class,1);
//
//        if(tarefa != null){
//            tarefa.setDescricao("Checar Gmail");
//            tarefa.setConluida(true);
//
//            entityManager.getTransaction().begin();
//            entityManager.getTransaction().commit();
//
//
//            System.out.println(tarefa.toString());
//        }
//
//        else{
//            System.out.println("Tarefa não encontrada.");
//        }

        //Update 2
//        Tarefa tarefa = new Tarefa();
//
//        tarefa.setDescricao("Checar Outlook rs");
//        tarefa.setId(1);
//
//        //o merge vai entender q a tare
//        entityManager.merge(tarefa);
//
//        entityManager.getTransaction().begin();
//        entityManager.getTransaction().commit();

        //Remove
//        Tarefa tarefa = entityManager.find(Tarefa.class, 1);
//
//        if (tarefa != null) {
//            entityManager.remove(tarefa);
//
//            entityManager.getTransaction().begin();
//            entityManager.getTransaction().commit();
//
//            System.out.println("Tarefa removida do banco");
//        } else {
//            System.out.println("Tarefa não encontrada.");
//        }

        //Find All

        List<Tarefa> tarefas = entityManager.createQuery("from Tarefa", Tarefa.class).getResultList();
        tarefas.forEach(tarefa ->{
            System.out.println(tarefa.toString());
        });

        entityManager.close();
        entityManagerFactory.close();
    }
}

