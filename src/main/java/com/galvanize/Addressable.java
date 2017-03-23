package com.galvanize;

import java.util.List;

/**
 * Created by PRADEEP.SINGH on 3/23/2017.
 */
public interface Addressable {

    public List<Address> getAddresses();
    public void addAddress(Address address);

}
