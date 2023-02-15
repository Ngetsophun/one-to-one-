package com.example.one_to_one_student_and_address;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import java.util.List;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

       Database.getInstance(this).doaAddressAndStudent().Insertstu(new Student(1,"jonh","first",5));
       Database.getInstance(this).doaAddressAndStudent().Insertstu(new Student(2,"jojo","second",7));
       Database.getInstance(this).doaAddressAndStudent().Insertstu(new Student(3,"bobo","third",9));

       Database.getInstance(this).doaAddressAndStudent().Insertadd(new Address(1001,"Phnom penh",1));
       Database.getInstance(this).doaAddressAndStudent().Insertadd(new Address(1002,"Rupp",1));
       Database.getInstance(this).doaAddressAndStudent().Insertadd(new Address(1003,"ICT",2));

        List<RelayStuAndAdd> relayStuAndAddList  = Database.getInstance(this).doaAddressAndStudent().getRelayStuAndAdd();

    }
}