package comp3170.ass1;

import static org.lwjgl.opengl.GL11.GL_COLOR_BUFFER_BIT;
import static org.lwjgl.opengl.GL11.glClear;
import static org.lwjgl.opengl.GL11.glClearColor;
import static org.lwjgl.opengl.GL11.glViewport;

import java.io.File;

import org.joml.Matrix4f;
import org.joml.Vector4f;

import comp3170.IWindowListener;
import comp3170.OpenGLException;
import comp3170.ShaderLibrary;
import comp3170.Window;

public class Assignment1 implements IWindowListener {
	
	final private File DIRECTORY = new File("src/comp3170/ass1/shaders");
	
	public static Assignment1 instance;
	
	private Window window;
	private int screenWidth = 600;
	private int screenHeight = 600;
	private Scene scene;

	private Matrix4f mvpMatrix = new Matrix4f();
	
	public Assignment1() throws OpenGLException {
		instance = this;
		window = new Window("Assignment 1", screenWidth, screenHeight, this);
		window.setResizable(true);
		window.run();
	}

	@Override
	public void init() {
		
		new ShaderLibrary(DIRECTORY);
		scene = new Scene();

		glClearColor(0.96f, 0.85f, 0.65f, 1.0f); // SANDY DESERT
	}

	@Override
	public void draw() {		
		glViewport(0, 0, screenWidth, screenHeight);
		glClear(GL_COLOR_BUFFER_BIT);
		
		mvpMatrix.identity();
	}
	
	@Override
	public void resize(int width, int height) {
		screenWidth = width;
		screenHeight = height;
	}

	@Override
	public void close() {
		// TODO Auto-generated method stub
		
	}
	
	public static void main(String[] args) throws OpenGLException {
		new Assignment1();
	}
}
