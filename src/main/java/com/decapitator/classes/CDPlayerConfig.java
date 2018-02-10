package com.decapitator.classes;

import com.decapitator.interfaces.CompactDisc;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan
public class CDPlayerConfig {

    @Bean(name = "RHCP")
    public CompactDisc sgtPeppers(){
        return new SgtPeppers();
    }
    @Bean(name = "Sony")
    public CDPlayer cdPlayer(){
        return new CDPlayer(sgtPeppers());
    }
    @Bean(name = "Panasonic")
    public CDPlayer anotherCdPlayer(){
        return new CDPlayer(sgtPeppers());
    }
//    @Bean
//    public CDPlayer cdPlayer(CompactDisc compactDisc){
//        return new CDPlayer(compactDisc);
//    }

}

