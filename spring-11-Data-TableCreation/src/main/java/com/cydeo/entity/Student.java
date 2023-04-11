package com.cydeo.entity;

import com.cydeo.enums.Gender;
import jakarta.persistence.*;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

@Entity
@Table(name = "students")
public class Student {



 @Id
 @GeneratedValue(strategy = GenerationType.IDENTITY)
   private Long id;

 @Column(name = "studentFirstName")
   private String firstName;
   private String lastName;
   private String email;
@Column(columnDefinition = "Date")
private LocalDate birthdate;
@Column(columnDefinition = "Time")
private LocalTime birthTime;
@Column(columnDefinition = "TIMESTAMP")
private LocalDateTime birthdayDateTime;
@Enumerated(EnumType.STRING)

private Gender gender;

@Transient
private  String city;

}
