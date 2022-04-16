package com.soul.frame;


import com.soul.commons.Properties;
import com.soul.control.GameControl;

import javax.swing.JFrame;

public class MainFrame extends JFrame {

    public MainFrame(){
        init();
    }

    public void init(){
        this.setTitle(Properties.TITLE);
        this.setSize(Properties.FRAME_WIDTH,Properties.FRAME_HEIGHT);
        this.setResizable(false);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setLocationRelativeTo(null);

        GameControl gameControl = new GameControl();
        this.add(gameControl.getGamePanel());
    }

}
