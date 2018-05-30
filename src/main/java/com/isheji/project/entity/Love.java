package com.isheji.project.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Table(name = "love")
public class Love {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Integer id;

    @Column(name = "username")
    private String username;

    @Column(name = "imageid")
    private String imageid;

    @Override
    public String toString() {
        return "Love{" +
                "id=" + id +
                ", username='" + username + '\'' +
                ", imageid='" + imageid + '\'' +
                '}';
    }
}
