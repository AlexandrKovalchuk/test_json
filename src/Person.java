/**
 * Created by a_kovalchuk on 21.09.2015.
 */
public class Person {
    public String name;
    public String surname;
    public String[] phones;
    public String[] sites;
    public Address address;
    public Person(){};

    public String ArrayToString(String[] array){
        String string = "";
        for(String item:array){
            string += item + "; ";
        }
        return string;
    }

    @Override
    public String toString(){
        String string = "";
        return string = "name: " + name + "; \nsurname: " + surname + "; \naddress: " + address.toString() + "; \nphones: " + ArrayToString(phones)
                + " \nsites: " + ArrayToString(sites);
    }
}
