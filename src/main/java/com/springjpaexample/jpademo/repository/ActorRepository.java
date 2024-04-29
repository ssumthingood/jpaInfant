package com.springjpaexample.jpademo.repository;

import com.springjpaexample.jpademo.entity.Actor;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ActorRepository extends JpaRepository<Actor, Short> {
}
