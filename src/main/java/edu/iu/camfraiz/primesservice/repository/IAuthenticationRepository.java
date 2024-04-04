package edu.iu.camfraiz.primesservice.repository;

import edu.iu.camfraiz.primesservice.model.Customer;

import java.io.IOException;

public interface IAuthenticationRepository {
    boolean save(Customer customer) throws IOException;
    Customer findByUsername(String username) throws IOException;
}