package com.darekparodia.organesson;

import com.darekparodia.organesson.engine.rendering.Window;
import com.darekparodia.organesson.game.Game;

public class Main {
    public static final Game game = new Game();

    public static void main(String[] args) {
        System.out.println("Hello world!");
        game.start();
    }
}