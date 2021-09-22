package com.codehouse.assignment.business.concretes;

import com.codehouse.assignment.business.abstracts.ContactService;
import com.codehouse.assignment.core.utilities.results.DataResult;
import com.codehouse.assignment.core.utilities.results.Result;
import com.codehouse.assignment.core.utilities.results.SuccessDataResult;
import com.codehouse.assignment.core.utilities.results.SuccessResult;
import com.codehouse.assignment.dataAccess.abstracts.ContactDao;
import com.codehouse.assignment.entities.concretes.Contact;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ContactManager implements ContactService {
    private ContactDao contactDao;
    @Autowired
    public ContactManager(ContactDao contactDao) {
        super();
        this.contactDao = contactDao;
    }

    @Override
    public DataResult<List<Contact>> getAll() {
        return new SuccessDataResult<List<Contact>>(this.contactDao.findAll(), "Data Listelendi");
    }

    @Override
    public Result add(Contact contact) {
        this.contactDao.save(contact);
        return new SuccessResult("Kişi Eklendi");
    }

    @Override
    public Result delete(Contact contact) {
        this.contactDao.delete(contact);
        return new SuccessResult("Kişi Silindi");
    }

    @Override
    public DataResult<Contact> getById(int id) {
        return new SuccessDataResult<Contact>(this.contactDao.getById(id),"Data Listelendi");
    }

}
