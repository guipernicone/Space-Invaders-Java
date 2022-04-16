package com.soul.entity;

import com.soul.commons.Properties;
import com.soul.components.Spaceship;

import java.awt.event.KeyEvent;
import java.util.ArrayList;
import java.util.List;

public class Player extends BasicEntity{

    List<LaserEntity> laserEntityList;

    public Player(){
        this.setComponent(new Spaceship());
        laserEntityList = new ArrayList<>();
    }

    public void keyPressed(KeyEvent e) {
        int keyCode = e.getKeyCode();

        Spaceship spaceship = (Spaceship) component;

        if (KeyEvent.VK_RIGHT == keyCode) {
            int x = spaceship.getComponentPositionX();
            if((x + (Properties.SPACESHIP_MOVEMENT + Properties.SPACESHIP_WIDTH/2)) <= (Properties.FRAME_WIDTH - (Properties.PANEL_BORDER + Properties.SPACESHIP_WIDTH/2))){
                spaceship.setComponentPositionX(x + Properties.SPACESHIP_MOVEMENT);
            }
        }

        if (KeyEvent.VK_LEFT == keyCode) {
            int x = spaceship.getComponentPositionX();
            if(x - (Properties.SPACESHIP_MOVEMENT) >= Properties.FRAME_INIT_WIDTH){
                spaceship.setComponentPositionX(x - Properties.SPACESHIP_MOVEMENT);
            }
        }
        if (KeyEvent.VK_SPACE == keyCode && laserEntityList.size() < Properties.LASERSHOT_LIMIT) {
            LaserEntity laserEntity = new LaserEntity(spaceship.getComponentPositionX(), spaceship.getComponentPositionY() - Properties.SPACESHIP_HEIGHT);
            laserEntityList.add(laserEntity);
        }
    }

    public void cleanLasers(){
        laserEntityList.removeIf(laserEntity -> !laserEntity.getVisible());
    }

    public List<LaserEntity> getLasershotList() {
        return laserEntityList;
    }

    @Override
    public String toString() {
        return "Player{" +
                "laserEntityList=" + laserEntityList +
                '}';
    }
}
