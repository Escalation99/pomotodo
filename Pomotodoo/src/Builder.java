import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JButton;
import java.awt.BorderLayout;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextField;
import javax.swing.LayoutStyle;
import javax.swing.SwingConstants;
import java.awt.GridLayout;
import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import javax.swing.ButtonGroup;
import javax.swing.AbstractAction;
import javax.swing.Action;

public class Builder {

	private JFrame frame;
	private JTextField textField;
	private final ButtonGroup buttonGroup = new ButtonGroup();
	private final Action action = new SwingAction();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Builder window = new Builder();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Builder() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 815, 610);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		textField = new JTextField();
		textField.setBounds(25, 12, 201, 20);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		JButton btnAdd = new JButton("Add");
		buttonGroup.add(btnAdd);
		btnAdd.setVisible(true);
		
		btnAdd.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				if(btnAdd.isVisible())
				{
					btnAdd.setVisible(false);
					
					JButton btnStart = new JButton("Start");
					btnStart.addActionListener(new ActionListener() {
						public void actionPerformed(ActionEvent e) {
							
							
						}
					});
					buttonGroup.add(btnStart);
					btnStart.setBounds(300, 11, 120, 25);
					btnStart.setVisible(true);
					frame.getContentPane().add(btnStart);
					
					JButton btnDone = new JButton("Done");
					buttonGroup.add(btnDone);
					btnDone.setVisible(true);
					btnDone.addActionListener(new ActionListener() {
						public void actionPerformed(ActionEvent e) {
							
						}
					});
					btnDone.setBounds(450, 11, 120, 25);
					frame.getContentPane().add(btnDone);
					
					JButton btnRemove = new JButton("Remove");
					buttonGroup.add(btnRemove);
					btnRemove.setVisible(true);
					btnRemove.addActionListener(new ActionListener() {
						
						@Override
						public void actionPerformed(ActionEvent e) {
							// TODO Auto-generated method stub
							
						}
					});
					btnRemove.setBounds (600, 11, 120, 25);
					frame.getContentPane().add(btnRemove);
						
				}
			}
		});
		
		btnAdd.setBounds(519, 11, 159, 23);
		frame.getContentPane().add(btnAdd);
		
		
		
		
	}
	private class SwingAction extends AbstractAction {
		public SwingAction() {
			putValue(NAME, "SwingAction");
			putValue(SHORT_DESCRIPTION, "Some short description");
		}
		public void actionPerformed(ActionEvent e) {
		}
	}
}
