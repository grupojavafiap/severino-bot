package br.com.data;

import java.util.ArrayList;
import java.util.List;

public class Storage {
    
    private List<AddressStorage> ceps;

    public List<AddressStorage> getCeps() 
    {
        if(ceps == null)
        {
            ceps = new ArrayList<>();
        }
        return ceps;
    }
    public void setCeps(List<AddressStorage> ceps) {
        this.ceps = ceps;
    }
}
