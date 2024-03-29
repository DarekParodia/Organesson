package com.darekparodia.organesson.engine;

import java.util.ArrayList;
import java.util.List;

public abstract class Scene {
    List<GameObject> gameObjects = new ArrayList<GameObject>();
    List<UiElement> uiElements = new ArrayList<UiElement>();

    public abstract void update();

    public abstract void render();

    public abstract void init();

    // game objects
    public void addGameObject(GameObject gameObject) {
        gameObjects.add(gameObject);
    }

    public void removeGameObject(GameObject gameObject) {
        gameObjects.remove(gameObject);
    }

    public List<GameObject> getGameObjects() {
        return gameObjects;
    }

    // ui elements
    public void addUiElement(UiElement uiElement) {
        uiElements.add(uiElement);
    }

    public void removeUiElement(UiElement uiElement) {
        uiElements.remove(uiElement);
    }

    public List<UiElement> getUiElements() {
        return uiElements;
    }
}
