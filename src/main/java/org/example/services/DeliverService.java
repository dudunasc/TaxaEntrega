package org.example.services;

public class DeliverService {
    public double taxa(String state){
        if("SP".equalsIgnoreCase(state)){
            return 10.0;
        } else{
            return 20.0;
        }
    }
}
