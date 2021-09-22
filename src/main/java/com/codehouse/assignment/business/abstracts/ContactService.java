package com.codehouse.assignment.business.abstracts;

import com.codehouse.assignment.core.utilities.results.DataResult;
import com.codehouse.assignment.core.utilities.results.Result;
import com.codehouse.assignment.entities.concretes.Contact;

import java.util.List;

public interface ContactService {
    DataResult<List<Contact>> getAll();
    Result add(Contact contact);
    Result delete(Contact contact);
    DataResult<Contact> getById(int id);
}
