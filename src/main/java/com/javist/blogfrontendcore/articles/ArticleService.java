package com.javist.blogfrontendcore.articles;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class ArticleService {
    private final ArticlesRepo articlesRepo;

    List<ArticleEntity> getAllArticles(){
        return articlesRepo.findAll();
    }
}
