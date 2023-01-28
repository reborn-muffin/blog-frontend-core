package com.javist.blogfrontendcore.articles;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/v1/articles")
public class ArticlesController {
    private final ArticleService articleService;

    public ArticlesController(ArticleService articleService) {
        this.articleService = articleService;
    }

    @GetMapping
    public List<ArticleEntity> retrieveAllArticles(){
        return articleService.getAllArticles();
    }
}
