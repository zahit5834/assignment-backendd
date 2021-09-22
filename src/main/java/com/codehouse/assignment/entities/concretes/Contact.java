package com.codehouse.assignment.entities.concretes;

import javax.persistence.*;

@Entity
@Table(name="contacts")
public class Contact {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="contact_id")
    private int id;
    @Column(name="contact_name")
    private String contactName;
    @Column(name="contact_lastname")
    private String contactLastName;
    @Column(name="contact_phone")
    private String contactPhone;
    @Column(name="contact_gender")
    private boolean gender;
    public Contact() {
    }

    public Contact(int id, String contactName, String contactLastName, String contactPhone, boolean gender) {
        this.id = id;
        this.contactName = contactName;
        this.contactLastName = contactLastName;
        this.contactPhone = contactPhone;
        this.gender = gender;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getContactName() {
        return contactName;
    }

    public void setContactName(String contactName) {
        this.contactName = contactName;
    }

    public String getContactLastName() {
        return contactLastName;
    }

    public void setContactLastName(String contactLastName) {
        this.contactLastName = contactLastName;
    }

    public String getContactPhone() {
        return contactPhone;
    }

    public void setContactPhone(String contactPhone) {
        this.contactPhone = contactPhone;
    }

    public boolean isGender() {
        return gender;
    }

    public void setGender(boolean gender) {
        this.gender = gender;
    }
}
