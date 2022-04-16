package com.soul.control;

import com.soul.commons.Properties;
import com.soul.components.Alien;
import com.soul.entity.AlienEntity;

public class AlienControl {

    AlienEntity[][] alienEntity = new AlienEntity[Properties.ALIEN_COLUMN][Properties.ALIEN_ROW];
    Boolean alienRunRight = true;

    public AlienControl(){
        for(int y = 0; y < Properties.ALIEN_COLUMN; y++){
            for(int x = 0; x < Properties.ALIEN_ROW; x++){
                alienEntity[y][x] = new AlienEntity((Properties.ALIEN_X + (Properties.ALIEN_SPACE + (80 * x))), (Properties.ALIEN_Y + (60 * y)));
            }
        }
    }

    public void alienRun() {
        boolean isGoingDown = false;
        for(int y = 0; y < Properties.ALIEN_COLUMN; y++){
            for(int x = 0; x < Properties.ALIEN_ROW; x++){
                if (alienEntity[y][x].getVisible()) {
                    boolean alienRunResult = alienEntity[y][x].alienMovement(alienRunRight);
                    if (alienRunResult != alienRunRight){
                        isGoingDown = true;
                    }
                    alienRunRight = alienRunResult;
                }
            }
        }
        if (isGoingDown){
            alienRunDown();
        }
    }

    public void alienRunDown() {
        for(int y = 0; y < Properties.ALIEN_COLUMN; y++){
            for(int x = 0; x < Properties.ALIEN_ROW; x++){
                alienEntity[y][x].alienMovementDown();
            }
        }
    }

    public Boolean hasAlienAlive() {
        for(int y = 0; y < Properties.ALIEN_COLUMN; y++){
            for(int x = 0; x < Properties.ALIEN_ROW; x++){
                if(alienEntity[y][x].getVisible()){
                    return true;
                }
            }
        }
        return false;
    }

    public Boolean hasAlienWin() {
        for(int y = 0; y < Properties.ALIEN_COLUMN; y++){
            for(int x = 0; x < Properties.ALIEN_ROW; x++){
                Alien alien = (Alien) alienEntity[y][x].getComponent();
                if(alien.getComponentPositionY() + Properties.ALIEN_HEIGHT >= Properties.SPACESHIP_Y){
                    return true;
                }
            }
        }
        return false;
    }
    public AlienEntity[][] getAlienEntity() {
        return alienEntity;
    }
}