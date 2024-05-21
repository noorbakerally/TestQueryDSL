package com.intelidia.testquerydsl.testquerydsl.models;

import javax.persistence.*;

@Entity
public class User {

    @Id
    @GeneratedValue
    long id;

    String username;
}
