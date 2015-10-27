import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.*;

/**
 * Created by a_kovalchuk on 21.09.2015.
 */
public class Main {
    public static void main(String[] args) throws Exception{
        String result = "";
        try(BufferedReader f = new BufferedReader(new FileReader("jsontest.txt"))){
            result = f.readLine();
        }catch (FileNotFoundException e){
            e.printStackTrace();
        }


        Gson gson = new GsonBuilder().create();
        Person person =  gson.fromJson(result, Person.class);

        System.out.println("Result:");
        System.out.println(person.toString());

    }
}
