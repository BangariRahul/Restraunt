package com.example.Restraunt.service;

import com.example.Restraunt.model.Restraunt;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
@Service
public class RestrauntService {

    public static final ArrayList<Restraunt> restraunts = new ArrayList<>();

    static {
        Restraunt r1 = new Restraunt("taj", "mumbai", 11111, "indian food", 5000);
        restraunts.add(r1);
        Restraunt r2 = new Restraunt("raj", "delhi", 22222, "chinese", 50);
        restraunts.add(r2);
        Restraunt r3 = new Restraunt("bilberry", "haryana", 33333, "South indian", 1000);
        restraunts.add(r3);

    }
public List<Restraunt> allrestraunt(){
        return restraunts;
}
public Restraunt rest(String name){
        for(Restraunt r :restraunts){
            if(r.getName().equals(name)){
                return r;
            }
        }
        return null;
}
public String add(Restraunt rest){
        restraunts.add(rest);
        return "Restraunt added";
    }
    public String update(String name , Restraunt rest){
        for(Restraunt r : restraunts){
            if(r.getName().equals(name)){
                r.setName(rest.getName());
                r.setAddress(rest.getAddress());
                r.setNumber(rest.getNumber());
                r.setSpeciality(rest.getSpeciality());
                r.setTotalStaff(rest.getTotalStaff());
            }

        }

        return "Restraunt updated";
    }
    public String deleteRest(String name){
        for(Restraunt r : restraunts){
            if(r.getName().equals(name)){
                restraunts.remove(r);
            }
    }
    return "Restraunt Deleted";
}
}
