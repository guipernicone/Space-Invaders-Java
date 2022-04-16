package com.soul.commons;

public interface Properties {
    /**
     * TEXT PROPERTIES
     */
    String TITLE = "Space Invaders Java";

    /**
     * FRAME PROPERTIES
     */
    int FRAME_HEIGHT = 640;
    int FRAME_WIDTH = 960;
    int FRAME_INIT_HEIGHT= 0;
    int FRAME_INIT_WIDTH= 0;

    /**
     * PANEL PROPERTIES
     */
    String BACKGROUND_SPACE_IMAGE_PATH = "resources/images/spaceBackground.jpg";
    int PANEL_BORDER = 20;

    /**
     * SPACESHIP
     */
    String SPACESHIP_IMAGE_PATH = "resources/images/spaceship.png";
    int SPACESHIP_WIDTH = 60;
    int SPACESHIP_HEIGHT = 60;
    int SPACESHIP_MOVEMENT = 15;
    int SPACESHIP_X = (FRAME_WIDTH/2) - (SPACESHIP_WIDTH/2);
    int SPACESHIP_Y = (FRAME_HEIGHT/4 * 3) - (SPACESHIP_HEIGHT/2);
    /**
     * ALIEN
     */
    int ALIEN_WIDTH = 45;
    int ALIEN_HEIGHT = 45;
    int ALIEN_SPACE = 10;
    int ALIEN_MOVEMENT_X = 2;
    int ALIEN_MOVEMENT_Y = 5;
    int ALIEN_ROW = 8;
    int ALIEN_COLUMN = 4;
    int ALIEN_X = 100;
    int ALIEN_Y = 80;

    /**
     * LASERSHOT
     */
    String LASERSHOT_IMAGE_PATH = "resources/images/lasershot.png";
    int LASERSHOT_WIDTH = 60;
    int LASERSHOT_HEIGHT = 60;
    int LASERSHOT_MOVEMENT = 5;
    int LASERSHOT_LIMIT = 10;

    /**
     * GAME PROPERTIES
     */
    int GAME_DELEY = 0;
}
