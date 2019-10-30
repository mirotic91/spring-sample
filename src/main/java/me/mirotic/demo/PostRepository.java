package me.mirotic.demo;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface PostRepository extends JpaRepository<Post, Long>, PostCustomRepository {

    List<Post> findByTitleContainsOrderByCreateDesc(String title);

}
