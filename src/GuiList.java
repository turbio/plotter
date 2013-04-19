

import javax.swing.*;

public class GuiList {
	private JFrame frame;
	
	//frame components
	private JMenuBar menu;
	private JMenuItem menuFile;
	
	public GuiList(JFrame f){
		frame = f;
		frame.removeAll();
	}
	
	public void addAll(){
		menu = new JMenuBar();
		
		menuFile = new JMenuItem("File");
		menu.add(menuFile);
		
		frame.add(menu);
	}
}
