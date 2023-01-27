package com.javist.blogfrontendcore.articles;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/v1/articles")
public class ArticlesController {
    private final ArticlesRepo articlesRepo;

    public ArticlesController(ArticlesRepo articlesRepo) {
        this.articlesRepo = articlesRepo;
    }

    @GetMapping
    public List<ArticleEntity> retrieveAllArticles(){
        return articlesRepo.findAll();
    }
}
