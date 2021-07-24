
package com.srm.spring.api.Service;

import java.util.List;

import com.srm.spring.api.vo.Mobile;

public interface Car {
    public List<String> getNames();

    public void persitMObile(Mobile mob);

    public List<Mobile> fetchAllmob();
}
