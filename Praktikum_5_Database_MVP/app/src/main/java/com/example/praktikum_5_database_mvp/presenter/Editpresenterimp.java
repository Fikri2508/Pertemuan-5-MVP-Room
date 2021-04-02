package com.example.praktikum_5_database_mvp.presenter;

import com.example.praktikum_5_database_mvp.database.dao.PersonDao;
import com.example.praktikum_5_database_mvp.database.entity.Person;
import com.example.praktikum_5_database_mvp.utils.Constant;
import com.example.praktikum_5_database_mvp.utils.Util;

public class Editpresenterimp implements Editpresenter{

    private  final  Editview view;
    private final PersonDao personDao;

    public Editpresenterimp(Editview view, PersonDao personDao) {
        this.view = view;
        this.personDao = personDao;
    }

    @Override
    public void save(Person person) {
        this.personDao.insertPerson(person);
    }

    @Override
    public boolean validate(Person person) {
        if (person.getName().isEmpty() || !Util.isValidName(person.getName())){
            view.showErrorMessage(Constant.ID_NAME);
            return false;
        }
        if (person.getAddress().isEmpty()){
            view.showErrorMessage(Constant.ID_ADDRES);
            return false;
        }
        if (person.getPhone().isEmpty() || !Util.isValidPhone(person.getPhone())){
            view.showErrorMessage(Constant.ID_PHONE);
            return false;
        }
        if (person.getEmail().isEmpty() || !Util.isValidEmail(person.getEmail())){
            view.showErrorMessage(Constant.ID_EMAIL);
            return false;
        }
        return true;
    }

    @Override
    public void getPerson(long id) {

    }

    @Override
    public void update(Person person) {

    }
}
