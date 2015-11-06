package Pruebas;

import java.nio.charset.MalformedInputException;

//import GUI.Window;
import Nucleo.NucleoMotor;

public class PruebaNucleoMotor extends NucleoMotor
{
	static int posX = 0, posY = 0;
	
	public  void Start()
	{
		System.out.println("HOLA2");
	}
	
	public  void Update()
	{
		posX++;
		posY++;
		System.out.println(posX);
	}
	
	public  void OnGUI()
	{
		GUI.Rect box = new GUI.Rect(posX, posY, 100, 100);
		win.add(box);
	}
	public static void main(String[] args) {
		new PruebaNucleoMotor().ejecutar();
	}
}
