package com.soul;

import com.soul.frame.MainFrame;

import java.awt.*;


public class SpaceInvadersApplication {

    public static void main(String[] args){
        EventQueue.invokeLater(() ->{
            new MainFrame().setVisible(true);
        });
    }
}
