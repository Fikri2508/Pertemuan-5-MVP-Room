package com.example.praktikum_5_database_mvp.database.dao;


import androidx.room.Dao;
import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.Query;
import androidx.room.Update;

import com.example.praktikum_5_database_mvp.database.entity.Person;

import java.util.List;

@Dao
public interface PersonDao {

    @Insert
    void insertPerson(Person person);

    @Update
    void update(Person person);

    @Delete
    void delete(Person person);

    @Query("SELECT * FROM person")
    List<Person> getALL();

    @Query("SELECT * FROM person WHERE id=:id")
    Person findPerson(long id);
}
