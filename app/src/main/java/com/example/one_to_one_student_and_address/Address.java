package com.example.one_to_one_student_and_address;

import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.PrimaryKey;

@Entity
public class Address {
    @PrimaryKey
    int AddressId;

    @ColumnInfo
    String Address;

    @ColumnInfo
    int StudentId;

    public Address(int addressId, String address, int studentId) {
        AddressId = addressId;
        Address = address;
        StudentId = studentId;
    }

    public Address() {
    }

    public int getAddressId() {
        return AddressId;
    }

    public void setAddressId(int addressId) {
        AddressId = addressId;
    }

    public String getAddress() {
        return Address;
    }

    public void setAddress(String address) {
        Address = address;
    }

    public int getStudentId() {
        return StudentId;
    }

    public void setStudentId(int studentId) {
        StudentId = studentId;
    }

    @Override
    public String toString() {
        return "Address{" +
                "AddressId=" + AddressId +
                ", Address='" + Address + '\'' +
                ", StudentId=" + StudentId +
                '}';
    }
}
