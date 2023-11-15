package gym;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Beginner extends JFrame implements ActionListener
{
	Icon i1 = new ImageIcon("C:\\Users\\TechForest\\OneDrive\\Pictures\\Saved Pictures\\Plan\\jumpingJacks.gif");
	Icon i2 = new ImageIcon("C:\\Users\\TechForest\\OneDrive\\Pictures\\Saved Pictures\\Plan\\sideHop.gif");
	Icon i3 = new ImageIcon("C:\\Users\\TechForest\\OneDrive\\Pictures\\Saved Pictures\\Plan\\kneePushUp.gif");
	Icon i4 = new ImageIcon("C:\\Users\\TechForest\\OneDrive\\Pictures\\Saved Pictures\\Plan\\mountainClimber.gif");
	Icon i5 = new ImageIcon("C:\\Users\\TechForest\\OneDrive\\Pictures\\Saved Pictures\\Plan\\floorDips.gif");
	Icon i6 = new ImageIcon("C:\\Users\\TechForest\\OneDrive\\Pictures\\Saved Pictures\\Plan\\sqarts.gif");
	
	JButton jumpingJacks;
	JButton sideHop;
	JButton kneePushUp;
	JButton mountainClimber;
	JButton floorDips;
	JButton sqarts;
	
	Beginner()
	{
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setLayout(new GridLayout(3,2));
		this.setTitle("Beginner");
		
		jumpingJacks = new JButton("JumpingJacks  -  30x");
		jumpingJacks.setFocusable(false);
		jumpingJacks.addActionListener(this);
		jumpingJacks.setFont(new Font("consolas",Font.PLAIN,40));
		jumpingJacks.setBorder(BorderFactory.createLineBorder(Color.white));
		jumpingJacks.setForeground(Color.green);
		jumpingJacks.setBackground(Color.black);
		jumpingJacks.setOpaque(true);
		

		sideHop = new JButton("SideHop  -  20x");
		sideHop.setFocusable(false);
		sideHop.addActionListener(this);
		sideHop.setFont(new Font("consolas",Font.PLAIN,40));
		sideHop.setBorder(BorderFactory.createLineBorder(Color.white));
		sideHop.setForeground(Color.green);
		sideHop.setBackground(Color.black);
		sideHop.setOpaque(true);
		
		kneePushUp = new JButton("KneePushUp  -  10x");
		kneePushUp.setFocusable(false);
		kneePushUp.addActionListener(this);
		kneePushUp.setFont(new Font("consolas",Font.PLAIN,40));
		kneePushUp.setBorder(BorderFactory.createLineBorder(Color.white));
		kneePushUp.setForeground(Color.green);
		kneePushUp.setBackground(Color.black);
		kneePushUp.setOpaque(true);

		mountainClimber = new JButton("MountainClimber  -  30x");
		mountainClimber.setFocusable(false);
		mountainClimber.addActionListener(this);
		mountainClimber.setFont(new Font("consolas",Font.PLAIN,40));
		mountainClimber.setBorder(BorderFactory.createLineBorder(Color.white));
		mountainClimber.setForeground(Color.green);
		mountainClimber.setBackground(Color.black);
		mountainClimber.setOpaque(true);

		floorDips = new JButton("FloorDips  -  15x");
		floorDips.setFocusable(false);
		floorDips.addActionListener(this);
		floorDips.setFont(new Font("consolas",Font.PLAIN,40));
		floorDips.setBorder(BorderFactory.createLineBorder(Color.white));
		floorDips.setForeground(Color.green);
		floorDips.setBackground(Color.black);
		floorDips.setOpaque(true);

		sqarts = new JButton("Sqarts  -  15x");
		sqarts.setFocusable(false);
		sqarts.addActionListener(this);
		sqarts.setFont(new Font("consolas",Font.PLAIN,40));
		sqarts.setBorder(BorderFactory.createLineBorder(Color.white));
		sqarts.setForeground(Color.green);
		sqarts.setBackground(Color.black);
		sqarts.setOpaque(true);
		
		this.add(jumpingJacks);
		this.add(sideHop);
		this.add(kneePushUp);
		this.add(mountainClimber);
		this.add(floorDips);
		this.add(sqarts);
		this.setSize(getMaximumSize());
		this.setVisible(true);
	}

	@Override
	public void actionPerformed(ActionEvent e) 
	{
		JFrame f = new JFrame();
		JButton back = new JButton();
		back.addActionListener( z -> 
		{
			f.dispose();
			new Beginner();
		}
		);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f.setLayout(new FlowLayout());
		f.getContentPane().add(back);
		f.setSize(getMaximumSize());
		
		if(e.getSource() == jumpingJacks)
		{
			this.dispose();
			back.setIcon(i1);
			f.setVisible(true);
		}
		if(e.getSource() == sideHop)
		{
			this.dispose();
			back.setIcon(i2);
			f.setVisible(true);
		}
		if(e.getSource() == kneePushUp)
		{
			this.dispose();
			back.setIcon(i3);
			f.setVisible(true);
		}
		if(e.getSource() == mountainClimber)
		{
			this.dispose();
			back.setIcon(i4);
			f.setVisible(true);
		}
		if(e.getSource() == floorDips)
		{
			this.dispose();
			back.setIcon(i5);
			f.setVisible(true);
		}
		if(e.getSource() == sqarts)
		{
			this.dispose();
			back.setIcon(i6);
			f.setVisible(true);
		}
		
	}
}
