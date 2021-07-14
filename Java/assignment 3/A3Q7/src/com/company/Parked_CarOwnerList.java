package com.company;

import java.util.*;

public class Parked_CarOwnerList {
    int[] parkingSlots = {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20};
    TreeMap<Integer, Integer> floor1section1 = new TreeMap<>();


    int add_new_car(Parked_CarOwner_Details a) {
        if (floor1section1.size()<20) {
            floor1section1.put(floor1section1.size() + 1,floor1section1.size());
            return floor1section1.size();
        }else{
            return 0;
        }
    }

    void remove_car(int token) {
        floor1section1.remove(token);
    }

    int get_parked_car_location(int token) {
        return floor1section1.get(token);
    }
}
