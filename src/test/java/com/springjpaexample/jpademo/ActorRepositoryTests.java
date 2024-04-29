package com.springjpaexample.jpademo;

import com.springjpaexample.jpademo.entity.Actor;
import com.springjpaexample.jpademo.repository.ActorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;

@DataJpaTest
public class ActorRepositoryTests {
    @Autowired
    private ActorRepository actorRepository;

    private Actor actor;
}
