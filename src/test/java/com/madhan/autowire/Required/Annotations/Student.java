/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.madhan.autowire.Required.Annotations;

import org.springframework.beans.factory.annotation.Required;

/**
 *
 * @author Madhankumar Selvaraj
 */
public class Student {

private String name;
private int age;

public Student() {
}

public String getName() {
    return name;
}

@Required
public void setName(String name) {
    this.name = name;
}

public int getAge() {
    return age;
}

@Required
public void setAge(int age) {
    this.age = age;
}

}
