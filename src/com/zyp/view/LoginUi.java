package com.zyp.view;


import javax.swing.JFrame;

import java.awt.Color;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.Font;

import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import javax.swing.JButton;

import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JRadioButton;
import javax.swing.JTextField;
import com.zyp.entity.User;
import com.zyp.service.UserService;
import com.zyp.service.impl.UserServiceImpl;
import javax.swing.SwingConstants;
import javax.swing.JPanel;







public class LoginUi implements ActionListener{
	private JFrame jf = new JFrame(" 电影购票系统");
	private Container con = jf.getContentPane();// 获得面板
	
	private ImageIcon bg = new ImageIcon("images\\timg (1).jpg");
	private Toolkit toolkit = Toolkit.getDefaultToolkit();
	private Dimension sc = toolkit.getScreenSize();// 获得屏幕尺寸
	
	private JButton in = new JButton("进入影院");
	//"进入系统"用背景图
	
	private JLabel bglabel = new JLabel();
	
	public LoginUi() {
		con.setLayout(null);
		jf.setSize(1000, 600);
		jf.setLocation((sc.width - 1000) / 2, (sc.height - 618) / 2);		
		jf.setResizable(false);// 窗口大小不可变
		jf.setVisible(true);
		jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		con.setVisible(true);		
		bglabel.setIcon(bg);
		bglabel.setBounds(10, 10, 1174, 575);		
		in.setFont(new Font("等线 Light", Font.BOLD, 38));
		in.setHorizontalAlignment(SwingConstants.LEADING);
		in.setBounds(100, 100, 216, 100);
		
		con.add(bglabel);
		con.add(in);
		
		JPanel panel = new JPanel();
		panel.setBounds(320, 30, 10, 10);
		jf.getContentPane().add(panel);
		
	/*	if (!Util.getConnet()) {
			winMessage("服务端未开启，无法继续！");
			return;
		}*/
		in.addActionListener(this);
		
	}

	public static void winMessage(String str) {// 提示窗口，有多个地方调用
		JOptionPane.showMessageDialog(null, str, "提示",
				JOptionPane.INFORMATION_MESSAGE);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource() == this.in) {
			new Login();
			jf.dispose();
		}
	}
}

