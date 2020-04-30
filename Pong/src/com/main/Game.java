package com.main;

import java.awt.Canvas;
import java.awt.Dimension;

public class Game extends Canvas implements Runnable {

	private static final long serialVersionUID = -668240625892092763L; // Auto-generated Game. Refer to part 1 of Coding Heaven video series
	
	public static final int width = 1000;
	public static final int height = width * 9/16;
	
	public boolean running = false;
	private Thread gameThread;
	
	private Ball ball;
	private Paddle paddle1;
	private Paddle paddle2;

	public Game() {
		canvasSetup();
		new Window("Simple Pong Game", this);
	}

	private void canvasSetup() {
		this.setPreferredSize(new Dimension(width, height));
		this.setMaximumSize(new Dimension(width, height));
		this.setMinimumSize(new Dimension(width, height));
	}

	@Override
	public void run() { // Class is auto implemented from Runnable
		// TODO Auto-generated method stub
		
	}

	public void start() {
		gameThread = new Thread(this);
		gameThread.start();
		running = true;
	}
	
	public void stop() {
		try {
			gameThread.join();
			running = false;
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	// -- Main Method -- //
	public static void main(String[] args) {
		new Game();
	}
}
