package com.javist.blogfrontendcore.articles;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/articles")
@CrossOrigin(origins = "http://localhost:3000")
public class ArticleController {
    private final ArticleService articleService;

    public ArticleController(ArticleService articleService) {
        this.articleService = articleService;
    }

    @GetMapping
    public List<ArticleEntity> retrieveAllArticles(){
        return articleService.getAllArticles();
    }

    @PostMapping
    public ResponseEntity<?> save(@RequestBody ArticleEntity entity){
        ResponseEntity<?> responseEntity;

        try {
            articleService.save(entity);
            responseEntity = ResponseEntity.status(HttpStatus.CREATED).build();
        } catch (Exception ex){
            responseEntity = ResponseEntity.internalServerError().build();
        }

        return responseEntity;
    }

    @PutMapping
    public ResponseEntity<?> update(@RequestBody ArticleEntity updatedEntity){
        ResponseEntity<?> responseEntity;

        try {
            articleService.save(updatedEntity);
            responseEntity = ResponseEntity.ok().build();
        } catch (Exception ex){
            responseEntity = ResponseEntity.internalServerError().build();
        }

        return responseEntity;
    }

    @GetMapping("{id}")
    public ResponseEntity<?> retrieveById(@PathVariable Long id){
        ResponseEntity<?> responseEntity;

        try {
            ArticleEntity articleEntity = articleService.getById(id);
            responseEntity = ResponseEntity.ok().body(articleEntity);
        } catch (Exception ex){
            responseEntity = ResponseEntity.internalServerError().build();
        }

        return responseEntity;
    }

    @DeleteMapping("{id}")
    public ResponseEntity<?> deleteById(@PathVariable Long id){
        ResponseEntity<?> responseEntity;

        try {
            articleService.deleteById(id);
            responseEntity = ResponseEntity.ok().build();
        } catch (Exception ex){
            responseEntity = ResponseEntity.internalServerError().build();
        }

        return responseEntity;
    }
}
