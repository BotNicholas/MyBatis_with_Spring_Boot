package org.nicholas.mybatiswithspring;

import org.nicholas.mybatiswithspring.components.BlogService;
import org.nicholas.mybatiswithspring.components.PostsService;
import org.nicholas.mybatiswithspring.components.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class MyBatisWithSpringApplication implements CommandLineRunner {
    @Autowired
    private PostsService postsService;
    @Autowired
    private BlogService blogService;
    @Autowired
    private UserService userService;

    public static void main(String[] args) {
        SpringApplication.run(MyBatisWithSpringApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        postsService.findAll().forEach(System.out::println);
        System.out.println();
        blogService.findAll().forEach(System.out::println);
        System.out.println();
        userService.findAll().forEach(System.out::println);

//        System.out.println(userService.findById(1));
    }
}
