package com.example.firstproject.repository;

import com.example.firstproject.entity.Article;
import org.springframework.data.repository.CrudRepository;

import java.util.ArrayList;


public interface ArticleRepository extends CrudRepository<Article, Long> {
    //CrudRepository<관리 대상 엔티티 클래스 타입, 대푯값 타입>
    @Override
    ArrayList<Article> findAll();
}
