package com.alpkor.alternative;

import javax.enterprise.inject.Alternative;

@Alternative
public class Patron1 implements IPatron {
    @Override
    public String surum(String data){
        return "surum 1 "+ data;
    }
}
