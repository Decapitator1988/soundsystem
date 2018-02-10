package com.decapitator.classes;

import com.decapitator.interfaces.CompactDisc;
import org.springframework.stereotype.Component;

@Component
public class SgtPeppers implements CompactDisc {
    private String title = "Otherside";
    private String artist = "RHCP";

    public void play() {
        System.out.print("Playing "+title+" by "+artist);
    }
}
