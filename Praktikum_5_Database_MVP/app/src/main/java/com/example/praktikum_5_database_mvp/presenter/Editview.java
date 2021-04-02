package com.example.praktikum_5_database_mvp.presenter;

import com.example.praktikum_5_database_mvp.database.entity.Person;

public interface Editview {

    void showErrorMessage(int id);

    void clearPreError();

    void populate(Person person);
}
