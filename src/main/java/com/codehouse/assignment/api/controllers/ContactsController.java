package com.codehouse.assignment.api.controllers;

import com.codehouse.assignment.business.abstracts.ContactService;
import com.codehouse.assignment.core.utilities.results.DataResult;
import com.codehouse.assignment.core.utilities.results.Result;
import com.codehouse.assignment.entities.concretes.Contact;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(origins = "*", allowedHeaders = "*")
@RestController
@RequestMapping("/api/contacts")
public class ContactsController {
    private ContactService contactService;
    @Autowired
    public ContactsController(ContactService contactService) {
        super();
        this.contactService = contactService;
    }
    @GetMapping("/getall")
    public DataResult<List<Contact>> getAll(){
        return this.contactService.getAll();
    }
    @GetMapping("/getbyid")
    public DataResult<Contact> getById(@RequestParam int id){
        return this.contactService.getById(id);
    }
    @PostMapping("/add")
    public Result add(@RequestBody Contact contact) {
        return this.contactService.add(contact);
    }
    @PostMapping("/delete")
    public Result delete(@RequestBody Contact contact) {
        return this.contactService.delete(contact);
    }
}
