package com.darekparodia.organesson;

import com.darekparodia.organesson.rendering.Window;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        Window window = new Window(800, 600, "Organesson");
        while (!window.shouldClose()) {
            window.update();
        }
    }
}