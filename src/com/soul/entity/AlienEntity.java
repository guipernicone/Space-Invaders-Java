package com.soul.entity;

import com.soul.commons.AliensEnum;
import com.soul.commons.Properties;
import com.soul.components.Alien;

public class AlienEntity extends BasicEntity {
    private LaserEntity laserEntity;
    private Boolean visible;

    public AlienEntity(int positionX, int positionY){
        AliensEnum aliensEnum = AliensEnum.values()[(int) Math.floor(Math.random() * 4)];
        this.setComponent(new Alien(aliensEnum.getPath(), positionX, positionY));
        this.visible = true;
    }

    public boolean alienMovement(Boolean isRight) {
        Alien alien = (Alien) this.getComponent();
        if (isRight) {
            if (alien.getComponentPositionX() < Properties.FRAME_WIDTH - (Properties.ALIEN_WIDTH + Properties.ALIEN_SPACE)){
                alien.setComponentPositionX(alien.getComponentPositionX() + Properties.ALIEN_MOVEMENT_X);
                return true;
            }
            return false;
        }
        else{
            if (alien.getComponentPositionX() > Properties.FRAME_INIT_WIDTH + Properties.ALIEN_SPACE){
                alien.setComponentPositionX(alien.getComponentPositionX() - Properties.ALIEN_MOVEMENT_X);
                return false;
            }
            return true;
        }

    }

    public void alienMovementDown(){
        Alien alien = (Alien) this.getComponent();
        alien.setComponentPositionY(alien.getComponentPositionY() + Properties.ALIEN_MOVEMENT_Y);
    }

    public Boolean getVisible(){
        return this.visible;
    }

    public void setDead(){
        this.visible = false;
    }

}
