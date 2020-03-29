package com.mybatis.myEnum;

public enum Sex {
    MALE(1,"男性"),
    FEMALE(2,"女性");
    private int id;
    private String name;

    Sex(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    public static Sex getSex(String name){
        if ("男性".equals(name)){
            return MALE;
        }else if ("女性".equals(name)){
            return FEMALE;
        }
        return null;
    }
}
