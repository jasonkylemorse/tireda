package com.jasonkylemorse.tireda;

import android.arch.persistence.room.Dao;
import android.arch.persistence.room.Delete;
import android.arch.persistence.room.Insert;
import android.arch.persistence.room.Query;

import java.util.List;

/**
 * Created by jasonmorse on 11/14/17.
 */

@Dao
public interface AlarmDao {

    @Query("SELECT * FROM alarm")
    List<Alarm> getAll();

    @Query("SELECT * FROM alarm WHERE id IN (:ids)")
    List<Alarm> loadAllByIds(int[] ids);

    @Query("SELECT * FROM alarm WHERE name LIKE :name")
    Alarm findByName(String name);

    @Insert
    void insertAll(Alarm... alarms);

    @Delete
    void delete(Alarm user);

}
