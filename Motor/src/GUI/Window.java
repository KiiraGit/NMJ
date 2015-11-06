package GUI;

import java.awt.Graphics;
import java.util.ArrayList;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

//import figuras.Figura;
//import GUI;

public class Window extends JFrame
{
	private final static int minWidth = 200, maxWidth = 800;
	private final static int minHeight = 200, maxHeight = 800;
	private ArrayList<GUI> guiList;
	
	private int width, height;
	
	public Window(String title, int width, int height)
	{
		super(title);
		this.width = width;
		this.height = height;
		guiList = new ArrayList<GUI>();
		setContentPane(initPanel());
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setVisible(true);
		//	Hasta que no esté visible, getInsets
		//	no devuelve valores correctos
		width += getInsets().left + getInsets().right;
		height += getInsets().top + getInsets().bottom;
		setSize(width, height);
	}
	
	public void add(GUI gui)
	{
		this.guiList.add(gui);
		repaint();
	}
	
	public void remove(GUI gui)
	{
		this.guiList.remove(gui);
		repaint();
	}
	
	public void textBox(String text)
	{
		JOptionPane.showMessageDialog(null, text);
		repaint();
	}
	
	public void waitFor(int millis)
	{
		try {
			Thread.sleep(millis);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		repaint();
	}
	
	public int getWidth()
	{
		return width;
	}
	
	public int getHeight()
	{
		return height;
	}
	
	private JPanel initPanel()
	{
		JPanel panel = new JPanel()
		{
			@Override
			protected void paintComponent(Graphics g)
			{
				super.paintComponent(g);
				
				for(int i = 0; i < guiList.size(); i++)
				{
					GUI f = guiList.get(i);
					f.draw(g);
				}
			}
		};
		return panel;
	}
}
