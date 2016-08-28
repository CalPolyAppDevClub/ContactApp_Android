package com.example.kris.contactapp;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;

/**
 * Student object that will be pass around. Info is passed when button is clicked and
 * retrived from in onCreate of the next Activity
 *
 * @author Dung Trinh (dungtrinh1993@gmail.com)
 * @version 1 - init commit. - Flow established
 * In order to passs the object around we need to implement Parcelable to pass it around
 */
public class Student implements Parcelable {

    //TODO: Add comments
    private String firstName;
    private String lastName;
    private String email;
    private String platform;
    private String pizza;
    private String year;
    private String soda;

    //need an empty constructor
    public Student() {
        //empty constructor
    }

    /**
     * Constuctor
     * @param firstName
     * @param lastName
     * @param email
     * @param platform
     * @param pizza
     * @param soda
     * @param year
     */
    public Student(String firstName, String lastName, String email, String platform,
                   String pizza, String soda, String year) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.platform = platform;
        this.pizza = pizza;
        this.soda = soda;
        this.year = year;
    }

    /**
     * This constructor is used when passing value in between
     * @param in
     */
    protected Student(Parcel in) {
        firstName = in.readString();
        lastName = in.readString();
        email = in.readString();
        platform = in.readString();
        pizza = in.readString();
        year = in.readString();
        soda = in.readString();
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(firstName);
        dest.writeString(lastName);
        dest.writeString(email);
        dest.writeString(platform);
        dest.writeString(pizza);
        dest.writeString(year);
        dest.writeString(soda);
    }

    @Override
    public int describeContents() {
        return 0;
    }

    public static final Creator<Student> CREATOR = new Creator<Student>() {
        @Override
        public Student createFromParcel(Parcel in) {
            return new Student(in);
        }

        @Override
        public Student[] newArray(int size) {
            return new Student[size];
        }
    };

    public String getFirstName() {
        return this.firstName;
    }

    public String getLastName(){
        return this.lastName;
    }

    public String getEmail() {
        return this.email;
    }

    public String getPlatform() {
        return this.platform;
    }

    public String getPizza() {
        return this.pizza;
    }

    public String getSoda() {
        return this.soda;
    }

    public String getYear() {
        return this.year;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setPlatform(String platform) {
        this.platform = platform;
    }

    public void setPizza(String pizza) {
        this.pizza = pizza;
    }

    public void setYear(String year) {
        this.year = year;
    }

    public void setSoda(String soda) {
        this.soda = soda;
    }
}
