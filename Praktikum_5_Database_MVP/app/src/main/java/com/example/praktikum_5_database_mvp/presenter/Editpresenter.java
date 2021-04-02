package com.example.praktikum_5_database_mvp.presenter;

import com.example.praktikum_5_database_mvp.database.entity.Person;

public interface Editpresenter {

    void save(Person person);

    boolean validate(Person person);

    void getPerson(long id);

    void update(Person person);

}
