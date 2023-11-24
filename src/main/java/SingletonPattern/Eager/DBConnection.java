package main.java.SingletonPattern.Eager;

public class DBConnection {
    //eager initialzation
    public static DBConnection connObj= new DBConnection();

    private DBConnection(){
        //constructor should be private so that outsiders can't access
    }


    //every client should use this to get an instance of Db connection
    public static DBConnection getInstance(){
        return connObj;
    }

}
