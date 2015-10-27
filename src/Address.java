/**
 * Created by a_kovalchuk on 21.09.2015.
 */
public class Address {
    public String country;
    public String city;
    public String street;
    public Address(){};

    @Override
    public String toString(){
        String string = "";
        return string = "country: " + country + "; city: " + city + "; street: " + street;
    }
}
