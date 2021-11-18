package game;

import java.awt.Graphics;
import java.awt.image.BufferStrategy;
import events.MouseEvents;
import graphics.Assets;
import graphics.Display;

public class Game implements Runnable{
	
	private Thread thread;
	private BufferStrategy bs;
	private Display display;
	private boolean runnable;
	private Graphics g;
	private int width, height;
	
	private MouseEvents mouseEvent;
	
	
	
	public Game(String name, int width, int height) {
		this.width = width;
		this.height = height;
		display = new Display(name, width, height);
	}
	
	public synchronized void start() {
		if(runnable==true) {
			return;
		}
		runnable = !runnable;
		thread = new Thread(this);
		thread.start();
	}

	@Override
	public void run() {
		init();
		//NO GAME LOOP. only actions triggered by events.
		stop();
		
	}
	
	public synchronized void stop() {
		if(!runnable)
			return;
		runnable = !runnable;
		try {
			thread.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.exit(1);
		}
	}
	
	private void init() {
		Assets.init();//initialize the sprites
		mouseEvent = new MouseEvents();
		this.display.getFrame().addMouseListener(mouseEvent);
	}
	
	private void tick() {
		
	}
	
	private void render() {
		bs = display.getCanvas().getBufferStrategy();
		if(bs == null) {
			display.getCanvas().createBufferStrategy(3);
			return;
		}
		g = bs.getDrawGraphics();
		
		
		g.fillRect(0, 0, width, height);
		int xOffSet = 25;
		int yOffSet = 25;
		g.drawImage(Assets.BOARD,xOffSet,yOffSet,800,800,null);
		
		
		
		bs.show();
		g.dispose();
		
		
	}

}
