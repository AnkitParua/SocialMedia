package org.example;
import com.mongodb.*;
import com.mongodb.client.MongoDatabase;
public class DataBase {

    DataBase()
    {
        try{

            MongoClient mongo = new MongoClient("localhost", 27017);

            // Creating Credentials
            MongoCredential credential;
            credential = MongoCredential.createCredential("sampleUser", "myDb",
                    "password".toCharArray());
            System.out.println("Connected to the database successfully");

            // Accessing the database
            MongoDatabase database = mongo.getDatabase("myDb");
            System.out.println("Credentials ::" + credential);
        }
        catch (Exception e) {
            e.printStackTrace();
        }
    }

}
