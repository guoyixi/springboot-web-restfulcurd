package com.tj.springboot.entities;

import lombok.*;

import java.util.Date;

@Setter
@Getter
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class Employee {

 private Integer id;
 private String lastName;

 private String email;
 //1 male, 0 female
 private Integer gender;
 private Department department;
 private Date birth;


}
