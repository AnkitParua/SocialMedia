package org.example;
import java.util.ArrayList;
import java.util.Scanner;
public class Controller extends DataBase {

    public ArrayList<String> LoginScreen()
    {
        ArrayList<String> ret_arr_ = new ArrayList<String>();
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Your Name : ");
        String Name_ = "";
        Name_ = sc.nextLine();
        System.out.println("Enter Your Password : ");
        String Pass_ = "";
        Pass_ = sc.nextLine();

        ret_arr_.add(Name_);
        ret_arr_.add(Pass_);

        return ret_arr_;
    }
    Controller()
    {
//        goto login screen()
        System.out.println("Entered Controller Method");
        ArrayList<String> ret_data_ = new ArrayList<String>();
        ret_data_ = LoginScreen();
        System.out.println("Collected Data : ");
        ret_data_.forEach((e)-> System.out.println(e));

//        after this make a mongo search for data and goto PeopleProfile for loading profile

    }

}
