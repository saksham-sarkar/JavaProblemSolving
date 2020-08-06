package Top100;

public class Address {
    private int id;
    private String addressDesc;
    private String pincode;
    private String city;
    private String country;

    public Address() {
    }

    public Address(int id, String addressDesc, String pincode, String city, String country) {
        this.id = id;
        this.addressDesc = addressDesc;
        this.pincode = pincode;
        this.city = city;
        this.country = country;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getAddressDesc() {
        return addressDesc;
    }

    public void setAddressDesc(String addressDesc) {
        this.addressDesc = addressDesc;
    }

    public String getPincode() {
        return pincode;
    }

    public void setPincode(String pincode) {
        this.pincode = pincode;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }
}
