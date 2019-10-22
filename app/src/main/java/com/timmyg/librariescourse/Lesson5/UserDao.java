package com.timmyg.librariescourse.Lesson5;

import androidx.room.Dao;
import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.Update;

import java.util.List;

import io.reactivex.Single;

@Dao
public interface UserDao {

    @Insert()
    Single<Long> insert (User user);

    @Insert
    Single<List<Long>> insertUsers(List<User> users);

    @Delete
    Single<Integer> delete(User user);

    @Update
    Single<Integer> update(User user);

}
