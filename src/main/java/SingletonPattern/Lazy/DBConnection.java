package main.java.SingletonPattern.Lazy;

public class DBConnection {

    public static DBConnection connObj;

    private DBConnection(){
        //constructor should be private so that outsiders can't access
    }


    //every client should use this to get an instance of Db connection
    public static DBConnection getInstance(){
         if(connObj==null){
             connObj=new DBConnection();
         }
         return connObj;
    }
}
