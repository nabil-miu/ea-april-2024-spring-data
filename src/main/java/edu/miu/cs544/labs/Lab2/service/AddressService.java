package edu.miu.cs544.labs.Lab2.service;

import edu.miu.cs544.labs.Lab2.entity.Address;

import java.util.List;
import java.util.Optional;

public interface AddressService {
    List<Address> findAll();

    Optional<Address> findById(Long id);

    void save(Address address);

    void delete(Long id);

    void update(Address address);
}
