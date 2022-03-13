package br.com.data;

public class AddressStorage {

    private String address;
    private String cep;

    public AddressStorage()
    { }

    
    public AddressStorage(String address, String cep)
    {
        this.address = address;
        this.cep = cep;
    }
    
    public String getAddress() {
        return address;
    }
    public String getCep() {
        return cep;
    }
    public void setCep(String cep) {
        this.cep = cep;
    }
    public void setAddress(String address) {
        this.address = address;
    }


    @Override
    public String toString() {
        return "AddressStorage [address=" + address + ", cep=" + cep + "]";
    }


    
}
