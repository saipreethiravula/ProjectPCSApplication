package view;

import java.awt.Container;

import javax.swing.*;

public class RegisterFrame extends JFrame{

	Container container;
	public RegisterFrame() {
		container=getContentPane();
		
		setLayoutManager();
		setLocationAndSize();
		addComponentsToContainer();
		this.setTitle("REGISTRATION FORM");
		this.setVisible(true);
		this.setBounds(10, 10, 500, 700);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setResizable(false); // fixed size frame
	}
	
	public void setLayoutManager() {
		container.setLayout(null);
	}
	
	public void setLocationAndSize() {
		
	}
	
	public void addComponentsToContainer() {
		
	}
	
	public void callDispose() {
		this.dispose();
	}
}
