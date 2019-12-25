package GUI;

import java.awt.BorderLayout;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.LayoutManager;
import java.awt.TextArea;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;

import javax.swing.Box;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

import GUI.TaskButton.TaskButton_Add;

public class GUI_Builder{
	private TaskPanel newTask = new TaskPanel();
	
	private static JFrame mainFrame;
	private static JMenuBar menuBar;
	private static JMenu menuFile;
	private static JMenuItem fileSetting, fileUndo, fileRedo, fileClose;
	private static JPanel mainPanel;
	
	public GUI_Builder(){
		mainFrame = new JFrame ("POMOTODO");
		mainFrame.setSize (950, 650);
		mainFrame.setDefaultCloseOperation (JFrame.EXIT_ON_CLOSE);
		initMenuBar();
		
        mainPanel = new JPanel();
        mainPanel.setLayout (new FlowLayout(FlowLayout.RIGHT, 0, 10));
        
        /*------------------------------------------------------------------------------------------*/
		
        Task1 taskNew = new Task1();
        mainPanel.add (newTask.createNewTask (taskNew.getTaskName(), new TaskButton_Add().getBtn(), taskNew.getSpacing()));
		
		/*------------------------------------------------------------------------------------------*/
		
		mainFrame.add (menuBar, BorderLayout.NORTH);
		mainFrame.add (mainPanel);

		mainFrame.setVisible (true);
	}
	
	private void declareGUI(){
		
	}
	
	private void initMenuBar(){
		menuBar = new JMenuBar();
		menuFile = new JMenu ("File");
		
        fileSetting = new JMenuItem ("Setting");
        fileUndo = new JMenuItem ("Undo");
        fileRedo = new JMenuItem ("Redo");
        fileClose = new JMenuItem ("Close");
		
        menuFile.setFont (new Font ("calibri", Font.BOLD, 18));
		menuFile.add (fileSetting).setFont (new Font ("calibri", Font.BOLD, 18));
		menuFile.add (fileUndo).setFont (new Font ("calibri", Font.BOLD, 18));
		menuFile.add (fileRedo).setFont (new Font ("calibri", Font.BOLD, 18));
		menuFile.add (fileClose).setFont (new Font ("calibri", Font.BOLD, 18));
		
		menuBar.add (menuFile);
		menuBarActionListener();
	}	
	private void menuBarActionListener(){
        fileSetting.addActionListener (new ActionListener(){
        	@Override
        	public void actionPerformed (ActionEvent e){
        		
        	}
        });     
        fileUndo.addActionListener (new ActionListener(){
        	@Override
        	public void actionPerformed (ActionEvent e){
        		
        	}
        });      
        fileRedo.addActionListener (new ActionListener(){
        	@Override
        	public void actionPerformed (ActionEvent e){
        		
        	}
        });
        fileClose.addActionListener (new ActionListener(){
			@Override
			public void actionPerformed (ActionEvent e){
				mainFrame.dispatchEvent (new WindowEvent (mainFrame, WindowEvent.WINDOW_CLOSING));
			}
		});
	}
	
}