package com.kk.service;

import com.kk.domain.Person;
import com.kk.repository.PersonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * 操作es的业务层
 * @author :Mr.kk
 * @date: 2019/9/18 16:29
 */
@Service
public class CurdEsService {

    @Autowired
    private PersonRepository personRepository;

    public Object insert(Person person){
        return personRepository.save(person);
    }

    public void delete(Person person){
        personRepository.deleteById(person.getId());
    }

    public Object update(Person person){
        return personRepository.save(person);
    }

    public Object findById(Integer id){
        return personRepository.findById(id);
    }

    public Object findAll(){
        return personRepository.findAll();
    }
}
