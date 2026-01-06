package com.example.springbootimagesgithubactions;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class SpringbootImagesGithubActionsApplication {

    @GetMapping
    public String welcome() {
        return "Welcome to Spring boot Application build and deployed using GibHub Actions and Docker";
    }

    public static void main(String[] args) {
        SpringApplication.run(SpringbootImagesGithubActionsApplication.class, args);
    }

//    echo "# springboot-images-github-actions" >> README.md
//    git init
//    git add README.md
//    git commit -m "first commit"
//    git branch -M main
//    git remote add origin https://github.com/lavanya1212/springboot-images-github-actions.git
//    git push -u origin main
}
