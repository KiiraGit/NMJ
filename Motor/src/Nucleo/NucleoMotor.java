package Nucleo;

import java.awt.Color;
import GUI.Window;
import GUI.GUI;
import GUI.Rect;

public class NucleoMotor
{
	protected static Window win = new Window("NucleMotor", 600, 600);
	
	public  void Start(){};
	public  void Update(){};
	public  void OnGUI(){};
	
	public  void ejecutar() 
	{
		Start();
		while (true)
		{
			OnGUI();
			Update();
		}
		
	}

}
