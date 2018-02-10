package com.decapitator.classes;
import com.decapitator.interfaces.CompactDisc;
import com.decapitator.interfaces.MediaPlayer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.inject.Inject;

@Component
public class CDPlayer implements MediaPlayer {

    private CompactDisc cd;

    @Autowired
    public CDPlayer(CompactDisc cd) {
        this.cd = cd;
    }
//    @Autowired
    public void play() {
        cd.play();
    }
}
