package TestFileChooser;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.filechooser.FileNameExtensionFilter;
import javax.swing.JButton;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.io.File;
import java.awt.FlowLayout;


public class TestOpen extends JFrame {

	private JPanel contentPane;
	private JFileChooser chooser;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TestOpen frame = new TestOpen();
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
	public TestOpen() {
		chooser = new JFileChooser();
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		
		JButton btnOpen = new JButton("open file");
		btnOpen.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				FileNameExtensionFilter filter = new FileNameExtensionFilter("Allowed File", "txt","jar");
				chooser.setFileFilter(filter);
				
				int value = chooser.showOpenDialog(TestOpen.this);
				if (value == JFileChooser.APPROVE_OPTION) {
					
					File file = chooser.getSelectedFile();
					System.out.println(file.getAbsolutePath());
				}
			}
		});
		contentPane.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
		
		JButton btnOpenDir = new JButton("open dir");
		btnOpenDir.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				chooser.setFileSelectionMode(JFileChooser.FILES_AND_DIRECTORIES);
				chooser.setMultiSelectionEnabled(true);
				int value = chooser.showOpenDialog(TestOpen.this);
				if (value == JFileChooser.APPROVE_OPTION) {
//					File file = chooser.getSelectedFile();
//					System.out.println(file.getAbsolutePath());
					File file[] = chooser.getSelectedFiles();
					for (int i = 0; i < file.length; i++) {
						System.out.println(file[i].getAbsolutePath());
					}
				}
			}
		});
		contentPane.add(btnOpenDir);
		contentPane.add(btnOpen);
	}

}
