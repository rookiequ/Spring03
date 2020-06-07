package com.user.domain;

import java.io.Serializable;

/**
 * @author zzq
 */
public class Account implements Serializable {

    private Integer id;
    private String name;
    private float monty;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public float getMonty() {
        return monty;
    }

    public void setMonty(float monty) {
        this.monty = monty;
    }

    @Override
    public String toString() {
        return "Account{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", monty=" + monty +
                '}';
    }
}
