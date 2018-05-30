package com.isheji.project.service;

import com.isheji.project.controller.input.LoveInput;
import com.isheji.project.dao.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class UserService  {
    @Autowired
    UserRepo userRepo;
    /**
     *
     * @return
     * @param username
     * @param password
     * @param mail
     */
    @Transactional
    public int register(String username, String password, String mail) {
        return userRepo.register(username,password,mail);
    }

    public Boolean active(String code) {
        return userRepo.active(code);
    }

    public int login(String name, String pass) {
        return userRepo.login(name,pass);
    }

    public String createOrder(String out_trade_no, String amount, String subject, String store_id, String timeout_express) {
        return userRepo.createOrder(out_trade_no,amount,subject,store_id,timeout_express);
    }

    public String dbCount(String uName) {
        return userRepo.dbCount(uName);
    }

    public Boolean love(LoveInput loveInput) {
        return null;
    }
}