package com.example.one_to_one_student_and_address;


import android.content.Context;

import androidx.room.Room;
import androidx.room.RoomDatabase;

@androidx.room.Database(entities = {Student.class,Address.class},version = 1)
public abstract class Database extends RoomDatabase {
    public abstract DoaAddressAndStudent doaAddressAndStudent();

    public static volatile Database INSTANCE;

    public static Database getInstance(Context context){
        if(INSTANCE  == null){
            INSTANCE = Room.databaseBuilder(context.getApplicationContext(),Database.class,"testRelay")
                    .allowMainThreadQueries()
                    .build();
        }
        return  INSTANCE;
    }

}
