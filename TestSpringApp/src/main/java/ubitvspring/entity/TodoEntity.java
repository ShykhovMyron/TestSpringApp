package ubitvspring.entity;

import javax.persistence.*;

@Entity
public class TodoEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String title;
    private Boolean complited;

    @ManyToOne
    @JoinColumn(name = "user_id")
    private UserEntity user;

    public TodoEntity() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Boolean getComplited() {
        return complited;
    }

    public void setComplited(Boolean complited) {
        this.complited = complited;
    }

    public UserEntity getUser() {
        return user;
    }

    public void setUser(UserEntity user) {
        this.user = user;
    }
}
