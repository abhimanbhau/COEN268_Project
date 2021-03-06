package com.example.kbasa.teaching.DataTypes;

import android.util.Log;

import java.util.ArrayList;

/**
 * Created by kbasa on 2/26/2018.
 */

public class Student {
    PersonalDetails personalDetails;
    ArrayList<String> interests;
    String profileUri;
    CourseTaken courseTaken;
    String elevenUserName;

    public Student(PersonalDetails personalDetails, ArrayList<String> interests, String profileUri, CourseTaken courseTaken, String elevenUserName) {

        this.personalDetails = personalDetails;
        this.interests = interests;
        this.profileUri = profileUri;
        this.courseTaken = courseTaken;
        this.elevenUserName = elevenUserName;
    }

    public Student(PersonalDetails personalDetails, ArrayList<String> interests, String profileUri, CourseTaken courseTaken) {

        this.personalDetails = personalDetails;
        this.interests = interests;
        this.profileUri = profileUri;
        this.courseTaken = courseTaken;
    }

    public Student() {
        Log.i("DataConstructors", "In students");
    }

    public Student(PersonalDetails personalDetails, ArrayList<String> interests, CourseTaken courseTaken) {
        this.personalDetails = personalDetails;
        this.interests = interests;
        this.courseTaken = courseTaken;
    }

    public String getElevenUserName() {
        return elevenUserName;
    }

    public void setElevenUserName(String elevenUserName) {
        this.elevenUserName = elevenUserName;
    }

    public String getProfileUri() {
        return profileUri;
    }

    public void setProfileUri(String profileUri) {
        this.profileUri = profileUri;
    }

    public ArrayList<String> getInterests() {
        return interests;
    }


    public void setInterests(ArrayList<String> interests) {
        this.interests = interests;
    }

    public PersonalDetails getPersonalDetails() {
        return personalDetails;
    }

    public void setPersonalDetails(PersonalDetails personalDetails) {
        this.personalDetails = personalDetails;
    }

    public CourseTaken getCourseTaken() {
        return courseTaken;
    }

    public void setCourseTaken(CourseTaken courseTaken) {
        this.courseTaken = courseTaken;
    }
}
