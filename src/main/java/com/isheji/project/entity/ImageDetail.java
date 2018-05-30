package com.isheji.project.entity;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Getter
@Setter
@NoArgsConstructor
@Table(name = "imageDetail")
public class ImageDetail {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Integer id;

    @Column(name = "imageListId")
    private String imageListId;

    @Column(name = "url")
    private String url;

    @Column(name = "height")
    private String height;

    @Column(name = "width")
    private String width;

}
