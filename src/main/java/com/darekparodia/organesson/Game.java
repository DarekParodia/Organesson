package com.darekparodia.organesson;

import com.darekparodia.organesson.rendering.Window;
import com.darekparodia.organesson.scenes.MainMenu;
import com.darekparodia.organesson.scenes.Scene;

public class Game {
    private Window window;
    private Scene CurrentScene;

    public Game(){
        window = new Window(800, 600, "Organesson");
        CurrentScene = new MainMenu();
    }
    public void start(){
        window.show();
        while(!window.shouldClose()){
            window.update();
        }
    }
}
