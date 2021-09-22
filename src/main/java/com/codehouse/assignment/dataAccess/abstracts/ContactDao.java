package com.codehouse.assignment.dataAccess.abstracts;

import com.codehouse.assignment.entities.concretes.Contact;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ContactDao extends JpaRepository<Contact,Integer> {
    Contact findById(int id);
}
