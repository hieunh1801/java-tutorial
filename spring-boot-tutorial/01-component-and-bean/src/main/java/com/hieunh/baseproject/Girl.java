package com.hieunh.baseproject;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Girl {

    @Autowired
    public Bikini bikini;

    public Girl(Bikini bikini) {
        this.bikini = bikini;
    }
}
