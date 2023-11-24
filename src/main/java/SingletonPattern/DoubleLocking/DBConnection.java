package main.java.SingletonPattern.DoubleLocking;

public class DBConnection {

    public static DBConnection connObj;

    private DBConnection(){
        //constructor should be private so that outsiders can't access
    }

    //every client should use this to get an instance of Db connection
    //problem: here the load on synchronized lock is lesser so this is used in industry
    synchronized public static DBConnection getInstance(){
        if(connObj==null){
            synchronized (DBConnection.class) {
                if(connObj==null) {
                    connObj= new DBConnection();
                }
            }
        }
        return connObj;
    }

}