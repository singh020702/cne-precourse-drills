package com.galvanize;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by PRADEEP.SINGH on 3/23/2017.
 */
public class Business implements Addressable {

    private  String name;
    private final List<Address> addresses=new ArrayList<>();

    public String getName() {
        return name;
    }

    public Business(String name) {
        this.name=name;
    }

    @Override
    public List<Address> getAddresses() {
        return addresses;
    }

    @Override
    public void addAddress(Address address) {

        getAddresses().add(address);

    }
}
