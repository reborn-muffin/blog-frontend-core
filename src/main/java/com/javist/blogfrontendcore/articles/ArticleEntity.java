package com.javist.blogfrontendcore.articles;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

import java.util.Date;

@Data
@Entity
@Table
public class ArticleEntity {
    @Id
    private Long id;
    private String title;
    private String content;
    private String author;
    private Integer likesCount;
    private Date createdDate;
}
