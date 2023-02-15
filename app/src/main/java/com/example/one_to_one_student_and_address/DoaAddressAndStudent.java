package com.example.one_to_one_student_and_address;

import androidx.room.Dao;
import androidx.room.Insert;
import androidx.room.Query;
import androidx.room.Transaction;

import java.util.List;

@Dao
public interface DoaAddressAndStudent {

    @Insert
    void Insertadd(Address address);


    @Insert
    void Insertstu(Student student);

    @Transaction
    @Query("SELECT * FROM student")
     List<RelayStuAndAdd> getRelayStuAndAdd();



}
