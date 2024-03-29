package com.darekparodia.organesson.game;

import com.darekparodia.organesson.engine.Scene;
import com.darekparodia.organesson.engine.rendering.Renderer;
import com.darekparodia.organesson.engine.rendering.Window;
import com.darekparodia.organesson.engine.rendering.assets.AssetPack;
import com.darekparodia.organesson.engine.rendering.assets.Assets;
import com.darekparodia.organesson.game.scenes.MainMenu;

public class Game {
    private Window window;
    private Renderer renderer;
    private Scene CurrentScene;
    private AssetPack assets = Assets.HIGH_RES;

    public Game() {
        window = new Window(800, 600, "Organesson");
        CurrentScene = new MainMenu();
    }

    public void start() {
        window.show();
        while (!window.shouldClose()) {
            window.update();
        }
    }
}
