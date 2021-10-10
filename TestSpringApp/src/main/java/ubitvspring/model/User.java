package ubitvspring.model;

import ubitvspring.entity.UserEntity;

public class User {
    private Long id;
    private String username;

    public static User toModel(UserEntity entity){
        User user = new User();
        user.setId(entity.getId());
        user.setUsername(entity.getUsername());
        return user;
    }

    public User() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }
}
