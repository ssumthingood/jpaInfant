package com.springjpaexample.jpademo.entity;

import jakarta.persistence.*;
import lombok.*;
import org.hibernate.annotations.UpdateTimestamp;

import java.time.LocalDateTime;

@ToString
@Getter
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Table
@Entity
public class Actor {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Short actorId;

    private String firstName;

    private String lastName;

    @UpdateTimestamp
    private LocalDateTime lastUpdate;
}
