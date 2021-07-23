package com.srm.spring.api.Service;

import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class CarImpl implements Car {

    @Override
    public List<String> getNames() {

        return Arrays.asList("passat", "octavia", "superb");
    }

}
