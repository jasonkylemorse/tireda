package com.jasonkylemorse.tireda;

import android.arch.persistence.room.Database;
import android.arch.persistence.room.RoomDatabase;

/**
 * Created by jasonmorse on 11/14/17.
 */

@Database(entities = {Alarm.class}, version = 1)
public abstract class AppDatabase extends RoomDatabase {
    public abstract AlarmDao alarmDao();
}
