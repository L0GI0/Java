import java.awt.EventQueue;
import java.sql.*;
import javax.swing.*;

import org.apache.log4j.BasicConfigurator;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import org.apache.log4j.Logger;


public class Login {

	private JFrame frame;

	/**
	 * Launch the application.
	 * 
	 */
	private static Logger log = Logger.getLogger(Login.class);
	public static void main(String[] args) {
		BasicConfigurator.configure();
		EventQueue.invokeLater(new Runnable() {
			
			public void run() {
				try {
					Login window = new Login();
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
	Connection connection = null;
	private JTextField textFieldUN;
	private JPasswordField passwordField;
	
	public Login() {
		initialize();
		connection=sqliteConnection.dbConnector();
		
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("User Name");
		lblNewLabel.setBounds(172, 121, 97, 15);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Password");
		lblNewLabel_1.setBounds(182, 148, 82, 15);
		frame.getContentPane().add(lblNewLabel_1);
		
		textFieldUN = new JTextField();
		textFieldUN.setBounds(258, 119, 124, 19);
		frame.getContentPane().add(textFieldUN);
		textFieldUN.setColumns(10);
		
		JButton btnLogin = new JButton("Login");
		btnLogin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				try {
					String query="select* from LoginData where Username=? and Password=?";
					PreparedStatement pst = connection.prepareStatement(query);
					pst.setString(1,textFieldUN.getText());
					pst.setString(2,passwordField.getText());
					//It will execute the query 
					ResultSet rs = pst.executeQuery();
					int count = 0;
					while(rs.next()) {
						++count;
					}
					if(count == 1) {
						JOptionPane.showMessageDialog(null, "Correct user data");
						log.info("Valid input");
					}
					else if(count > 1) {
						JOptionPane.showMessageDialog(null, "There is duplicated data");
						log.error("Found duplicated data");
					}
					else {
						JOptionPane.showMessageDialog(null, "No such user");
						log.error("Invalid input");
					}//we need to close the conneciton becouse SQLite provides only one connetion at the time 
					rs.close();
					pst.close();
					
				}catch(Exception e) {
					JOptionPane.showMessageDialog(null, e);
				}
//				finally	{
//					 try {
//						 }
//					 catch(Exception e){
//						 JOptionPane.showMessageDialog(null, e);
//					 }
//					 }
				
			}
		});
		btnLogin.setBounds(268, 177, 114, 25);
		frame.getContentPane().add(btnLogin);
		
		passwordField = new JPasswordField();
		passwordField.setBounds(258, 146, 124, 19);
		frame.getContentPane().add(passwordField);
	}
}


