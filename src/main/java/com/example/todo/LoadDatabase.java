package com.example.todo;

import com.example.todo.model.TodoItem;
import com.example.todo.model.UserInstance;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;

@Configuration
class LoadDatabase {

    private static final Logger log = LoggerFactory.getLogger(LoadDatabase.class);

//    @Bean
//    public PasswordEncoder passwordEncoder() {
//        return new BCryptPasswordEncoder();
//    }

    @Bean
    CommandLineRunner initDatabaseOfUsers(UserRepository repository) {
        return args -> {
            log.info("Adding user 1" + repository.save(new UserInstance("Ivan", "testPassword", "email")));
        };
    }

    @Bean
    CommandLineRunner initDatabase(TodoRepository repository) {

        return args -> {
//            log.info("Loading 1 " + repository.save(new TodoItem("name 1", "descr1")));
//            log.info("Loading 2 " + repository.save(new TodoItem("name 2", "descr2")));
        };
    }


}
