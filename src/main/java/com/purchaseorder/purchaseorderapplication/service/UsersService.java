package com.purchaseorder.purchaseorderapplication.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.purchaseorder.purchaseorderapplication.document.Users;
import com.purchaseorder.purchaseorderapplication.repository.UsersRepository;

@Service
public class UsersService {
 
    @Autowired
    private UsersRepository usersRepository;
 
    public void salvar(Integer id, String nome,String team, Long salary) {
        usersRepository.save(new Users(id, nome, team, salary));
    }
 
    public List<Users> findAll() {
       return usersRepository.findAll();
    }
 
    public long count() {
        return usersRepository.count();
    }
 
    public Optional<Users> findById(Integer id) {
        return usersRepository.findById(id);
    }
 
    public void delete(Integer id) {
        usersRepository.deleteById(id);
    }
 
}
