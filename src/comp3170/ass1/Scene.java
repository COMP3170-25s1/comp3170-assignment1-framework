package comp3170.ass1;

import comp3170.SceneObject;
import comp3170.ass1.sceneobjects.Tank;

public class Scene extends SceneObject{
	
	public static Scene theScene;
	
	private Tank tank;
	
	public Scene()
	{
		theScene = this;
		tank = new Tank();
		tank.setParent(this);
	}

	
}