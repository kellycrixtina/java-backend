package main.todolist.task;

import org.hibernate.annotations.CreationTimestamp;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.Data;

import java.time.LocalDateTime;
import java.util.UUID;

@Data
@Entity(name= "tb_tasks")
public class TaskModel {
    /*
     * ID
     * Usuário (ID_USUARIO)
     * Descrição
     * Título
     * Data de Início
     * Data de Término
     * Prioridade 
     */

     @CreationTimestamp
     private LocalDateTime createdAt;

     @Id
     @GeneratedValue(generator = "UUID")
     private UUID id;
  
     private UUID idUser;

     @Column(length = 50)
     private String title;
     private String description;
     private String priority;
     private LocalDateTime startAt;
     private LocalDateTime endAt;

     // yyyy-mm-ddTHH:mm:ss

     public void setTitle(String title) throws Exception {
        if(title.length() > 50) {
            throw new Exception("O campo \"title\" deve conter no máximo 50 caracteres.");
       
        }
        this.title = title;
    }
}
