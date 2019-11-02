package com.timmyg.librariescourse.Lesson5;

import android.util.Log;

import java.util.ArrayList;
import java.util.List;

import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.disposables.Disposable;
import io.reactivex.schedulers.Schedulers;

public class UserPresenter {

    private static final String TAG = "UserPresenter";

    private UserDao userDao;


    public UserPresenter() {
    userDao = App.getAppDataBase().userDao();
    }

    public void insertData (){
        User user = new User();
        user.name = "Timur";
        user.surname = "Gorshkov";
        user.age = 30;

        Disposable disposable = userDao.insert(user).subscribeOn(Schedulers.io()).observeOn(AndroidSchedulers.mainThread())
                .subscribe(id -> {
                    Log.i(TAG, id.toString());
                }, throwable -> {
                    Log.e(TAG, "Error");
                });
    }


    public void insertList (){
        User luser = new User();
        luser.name = "Timur";
        luser.surname = "Gorshkov";
        luser.age = 30;
        List<User> userList = new ArrayList<>();
        userList.add(luser);
        userList.add(luser);
        userList.add(luser);
        userList.add(luser);

        Disposable disposable = userDao.insertUsers(userList).subscribeOn(Schedulers.io()).observeOn(AndroidSchedulers.mainThread())
                .subscribe(id -> {
                    Log.i(TAG, id.toString());
                }, throwable -> {
                    Log.e(TAG, "Error");
                });

    }


    public void deleteUser (){
        User luser = new User();
        luser.id=1;

        Disposable disposable = userDao.delete(luser).subscribeOn(Schedulers.io()).observeOn(AndroidSchedulers.mainThread())
                .subscribe(id-> {
                    Log.i(TAG, "Success");
                },throwable -> {
                    Log.e(TAG,"Error");
                });
    }

    public void updateUser(){
        User userForUpdate = new User();
        userForUpdate.id = 3;
        userForUpdate.surname = "Nikiforov";

        Disposable disposable = userDao.update(userForUpdate).subscribeOn(Schedulers.io()).observeOn(AndroidSchedulers.mainThread())
                .subscribe(id -> {
                    Log.i(TAG, "Success");
                },throwable -> {
                    Log.e(TAG, "Error");
                });

    }


}
