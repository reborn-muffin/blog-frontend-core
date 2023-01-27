package com.javist.blogfrontendcore.articles;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.lang.NonNull;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ArticlesRepo extends JpaRepository<ArticleEntity, Long> {
    @NonNull
    List<ArticleEntity> findAll();
}
