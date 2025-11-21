package com.projects.dxs.TransactionManagement.service;

import com.projects.dxs.TransactionManagement.model.Address;
import com.projects.dxs.TransactionManagement.repository.AddressRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AddressService {
    @Autowired
    private AddressRepository addressRepository;

    public Address addAddress(Address address) {
        return this.addressRepository.save(address);
    }
}
