package com.hieunh.baseproject;

import org.springframework.stereotype.Component;

@Component
public class TShirt implements Outfit{
    @Override
    public void wear() {
        System.out.println("Wear TShirt");
    }
}

