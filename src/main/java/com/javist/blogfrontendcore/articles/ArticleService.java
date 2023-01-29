package com.javist.blogfrontendcore.articles;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.NoSuchElementException;

@Service
@RequiredArgsConstructor
public class ArticleService {
    private final ArticlesRepo articlesRepo;

    List<ArticleEntity> getAll(){
        return articlesRepo.findAll();
    }

    ArticleEntity getById(Long id){
        return articlesRepo.findById(id).orElseThrow(() ->
                new NoSuchElementException("Can't retrieve article with id " + id));
    }

    void save(ArticleEntity entity){
        articlesRepo.save(entity);
    }

    void deleteById(Long id){
        articlesRepo.deleteById(id);
    }
}
