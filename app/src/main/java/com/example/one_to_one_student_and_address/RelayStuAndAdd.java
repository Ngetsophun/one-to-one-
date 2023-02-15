package com.example.one_to_one_student_and_address;

import androidx.room.Embedded;
import androidx.room.Relation;

public class RelayStuAndAdd {
    @Embedded
    Student student;

    @Relation(
            parentColumn = "id",
            entityColumn = "StudentId"
    )
    Address address;

    @Override
    public String toString() {
        return "RelayStuAndAdd{" +
                "student=" + student +
                ", address=" + address +
                '}';
    }
}
