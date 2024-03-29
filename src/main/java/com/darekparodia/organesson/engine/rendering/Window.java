package com.darekparodia.organesson.engine.rendering;

import org.lwjgl.glfw.GLFW;

public class Window {
    private long window;
    private int width, height;
    private int minWidth = 200, minHeight = 200;
    private boolean vSync = true;
    private boolean fullscreen = false;
    private String title;

    public Window(int width, int height, String title) {
        this.width = width;
        this.height = height;
        this.title = title;

        if (!GLFW.glfwInit()) {
            throw new IllegalStateException("Unable to initialize GLFW");
        }

        // Configure GLFW
        GLFW.glfwDefaultWindowHints(); // optional, the current window hints are already the default
        GLFW.glfwWindowHint(GLFW.GLFW_VISIBLE, GLFW.GLFW_FALSE); // the window will stay hidden after creation
        GLFW.glfwWindowHint(GLFW.GLFW_RESIZABLE, GLFW.GLFW_TRUE); // the window will be resizable
        GLFW.glfwSwapInterval(this.vSync ? 1 : 0);

        this.window = GLFW.glfwCreateWindow(width, height, title, 0, 0);
        if (this.window == 0) {
            throw new RuntimeException("Failed to create the GLFW window");
        }

        GLFW.glfwSetWindowSizeLimits(this.window, this.minWidth, this.minHeight, GLFW.GLFW_DONT_CARE,
                GLFW.GLFW_DONT_CARE);
        // eventy do zrobienia

        // set to center of the current monitor
        int monitorWidth = GLFW.glfwGetVideoMode(GLFW.glfwGetPrimaryMonitor()).width();
        int monitorHeight = GLFW.glfwGetVideoMode(GLFW.glfwGetPrimaryMonitor()).height();

        GLFW.glfwSetWindowMonitor(this.window, 0, (monitorWidth - width) / 2, (monitorHeight - height) / 2, width,
                height, GLFW.GLFW_DONT_CARE);

        // Make the OpenGL context current
        GLFW.glfwMakeContextCurrent(this.window);
    }

    public void update() {
        GLFW.glfwSwapBuffers(this.window);
        GLFW.glfwPollEvents();
    }

    public void show() {
        GLFW.glfwShowWindow(this.window);
    }

    public boolean shouldClose() {
        return GLFW.glfwWindowShouldClose(this.window);
    }
}
