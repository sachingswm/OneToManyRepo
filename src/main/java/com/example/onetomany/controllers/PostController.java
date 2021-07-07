package com.example.onetomany.controllers;

import com.example.onetomany.entities.bidirectional.Person;
import com.example.onetomany.entities.bidirectional.PhoneNumber;
import com.example.onetomany.entities.unidirectional.Subject;
import com.example.onetomany.repositories.PersonDao;
import com.example.onetomany.repositories.PhoneNumberDao;
import com.example.onetomany.repositories.SubjectDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PostController {

    @Autowired
    private PhoneNumberDao phoneNumberDao;

    @Autowired
    private PersonDao personDao;


    @Autowired
    private SubjectDao subjectDao;

    @PostMapping("/postPhoneNumber")
    public PhoneNumber postPhoneNumber(@RequestBody PhoneNumber phoneNumber)
    {
        phoneNumberDao.save(phoneNumber);
        return phoneNumber;
    }

    @PostMapping("/postPerson")
    public void postPerson(@RequestBody Person person)
    {
        for(PhoneNumber phoneNumber: person.getPhoneNumbers())
        {
            phoneNumber.setPerson(person);
            postPhoneNumber(phoneNumber);
        }
        //This wont be able to save person_id in PhoneNumber
//        personDao.save(person);
    }

    @PostMapping("/postSubject")
    public void postSubject(@RequestBody Subject subject)
    {
        subjectDao.save(subject);
    }

}
