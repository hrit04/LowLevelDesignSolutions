package main.java.Gymchain;

import java.util.*;

class Class {

    private String starttime;
    private String endTime;
    
    private Integer id;
    
    public Class(){}

    public Class(Integer id, String starttime, String endTime) {
        this.id = id;
        this.starttime = starttime;
        this.endTime = endTime;
    }

    public String getStarttime() {
        return starttime;
    }

    public void setStarttime(String starttime) {
        this.starttime = starttime;
    }

    public String getEndTime() {
        return endTime;
    }

    public void setEndTime(String endTime) {
        this.endTime = endTime;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }
}

class Gym {


    private Integer id;
    private String name;

    private String location;

    private Integer max_accomodation;

    private List<Class> classes = new LinkedList<>();

    public Gym() {
    }

    public Gym(Integer id, String name , String location, Integer max_accomodation) {
        this.id = id;
        this.name = name;
        this.location=location;
        this.max_accomodation= max_accomodation;
    }

    public List<Class> getClasses() {
        return classes;
    }

    public void setClasses(List<Class> classes) {
        this.classes = classes;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }
    public String getName() {
        return name;
    }

    public String getLocation() {
        return location;
    }

    public Integer getMax_accomodation() {
        return max_accomodation;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public void setMax_accomodation(Integer max_accomodation) {
        this.max_accomodation = max_accomodation;
    }
}
class Customer {


    public void bookClass(Integer customer_id, Integer gym_id, Integer class_id) {
    }

    public void getAllBookings(Integer customer_id){}

    public void cancelBooking(Integer booking_id) {
    }
}

public class Gymchain {

    List<Gym> allGyms = new LinkedList<>();

    Map<Integer,List<Class>>gymClassMap = new HashMap<>();

    private static Integer gymId=0;
    private static Integer classId=0;


    // functionality
    public Integer addGym(String name, String location, Integer max_accomodation) {
        gymId++;
        Gym gym = new Gym(gymId++ ,name,location,max_accomodation);
        allGyms.add(gym);
        System.out.println("New Gym added  with Id" +  gymId);
        return gymId;
    }

    public void remove_gym(String gymId){
    }

    public Integer addClass(Integer gym_id, ClassType class_type, Integer max_limit, String start_time, String end_time){
        classId++;
        Class cls = new Class(classId,start_time,end_time);
        gymClassMap.put(gym_id,);
        return classId;
    }


    public void removeClass(String gym_id, String class_id) {
    }



    public static void main(String[] args) {
            Gymchain gymchain = new Gymchain();
            gymchain.addGym("Gym1", "Indira Nagar", 100);
            gymchain.addClass(1,  ClassType.CARDIO, 20, "6:00", "7:00");
            Customer.bookClass(1, 1, 1);

    }

}
