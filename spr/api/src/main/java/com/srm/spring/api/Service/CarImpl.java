package com.srm.spring.api.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import com.srm.spring.api.vo.Mobile;

import org.springframework.stereotype.Service;

@Service
public class CarImpl implements Car {

    List<Mobile> mymob=new ArrayList<>();

    @Override
    public List<String> getNames() {

        return Arrays.asList("passat", "octavia", "superb");
    }

    @Override
    public void persitMObile(Mobile mob) {
        mymob.add(mob);
    }

    @Override
    public List<Mobile> fetchAllmob() {
       
        return mymob;
    }
}
