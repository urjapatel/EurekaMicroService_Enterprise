package com.sample.demo;

public class Student {

    private int studentId;
    private String firstName;
    private String lastName;
    private String phone;
    private String dob;
    private String streetAddress;
    private String cityAddress;
    private String noAddress;

    public Student() {
    }

    public Student(int studentId, String firstName, String lastName, String phone, String dob,
                   String streetAddress, String cityAddress, String noAddress) {
        super();
        this.studentId = studentId;
        this.firstName = firstName;
        this.lastName = lastName;
        this.phone = phone;
        this.dob = dob;
        this.streetAddress = streetAddress;
        this.cityAddress = cityAddress;
        this.noAddress = noAddress;
    }

    @Override
    public String toString() {
        return "Student [studentId=" + studentId +
                ", firstName=" + firstName +
                ", lastName=" + lastName +
                ", phone=" + phone +
                ", dob=" + dob +
                ", streetAddress=" + streetAddress +
                ", cityAddress=" + cityAddress +
                ", noAddress=" + noAddress + "]";
    }

    // Getters and Setters
    public int getStudentId() {
        return studentId;
    }

    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getDob() {
        return dob;
    }

    public void setDob(String dob) {
        this.dob = dob;
    }

    public String getStreetAddress() {
        return streetAddress;
    }

    public void setStreetAddress(String streetAddress) {
        this.streetAddress = streetAddress;
    }

    public String getCityAddress() {
        return cityAddress;
    }

    public void setCityAddress(String cityAddress) {
        this.cityAddress = cityAddress;
    }

    public String getNoAddress() {
        return noAddress;
    }

    public void setNoAddress(String noAddress) {
        this.noAddress = noAddress;
    }
}
