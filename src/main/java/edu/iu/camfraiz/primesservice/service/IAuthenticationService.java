package edu.iu.camfraiz.primesservice.service;

import edu.iu.camfraiz.primesservice.model.Customer;

import java.io.IOException;

public interface IAuthenticationService {
    Customer register(Customer customer) throws IOException;
    boolean login(String username, String password) throws IOException;
}