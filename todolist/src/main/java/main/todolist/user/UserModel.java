package main.todolist.user;

import java.util.UUID;
import org.hibernate.annotations.CreationTimestamp;
import java.time.LocalDateTime;
import jakarta.persistence.Id;
import jakarta.persistence.Column;
import jakarta.persistence.Entity; // banco de dados
import jakarta.persistence.GeneratedValue;
import lombok.Data;

@Data // getter and setter automatic
@Entity(name ="tb_users")

public class UserModel {

    @CreationTimestamp
    private LocalDateTime createdAt;

    @Id
    @GeneratedValue(generator = "UUID")
    private UUID id;

    @Column(unique = true)

    private String name;
    private String username;
    private String password;




}
