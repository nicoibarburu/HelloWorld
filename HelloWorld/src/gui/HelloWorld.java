package gui;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import domain.Message;

import javax.swing.JLabel;
import java.awt.Font;
import java.util.HashMap;

public class HelloWorld extends JFrame {
	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					HashMap<String,String> hm=new
							HashMap<String,String>();
							hm.put("eu", "Kaixo Mundua");
							hm.put("es", "Hola Mundo");
							Message m=new Message ("hello world",hm);
							HelloWorld frame = new HelloWorld(m, "eu");
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public HelloWorld(Message m, String lang) {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		JLabel lblHelloWorld = new JLabel(m.getTraductions(lang));
		lblHelloWorld.setFont(new Font("Lucida Grande", Font.PLAIN, 30));
		lblHelloWorld.setBounds(115, 93, 225, 44);
		contentPane.add(lblHelloWorld);
	}
}
