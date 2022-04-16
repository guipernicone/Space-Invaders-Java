package com.soul.commons;

public enum AliensEnum {
    ALIEN_RED("resources/images/alienred.png"),
    ALIEN_ORANGE("resources/images/alienorange.png"),
    ALIEN_PURPLE("resources/images/alienpurple.png"),
    ALIEN_GREEN("resources/images/aliengreen.png");

    final String path;

    AliensEnum(String path){
        this.path = path;
    }

    public String getPath(){
        return path;
    }
}
