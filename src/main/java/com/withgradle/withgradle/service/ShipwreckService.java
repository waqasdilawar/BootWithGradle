package com.withgradle.withgradle.service;

import com.withgradle.withgradle.repository.ShipwreckRepository;
import org.springframework.stereotype.Service;

@Service
public class ShipwreckService {
    private ShipwreckRepository shipwreckRepository;
    public ShipwreckService(ShipwreckRepository shipwreckRepository){
        this.shipwreckRepository=shipwreckRepository;
    }

}
