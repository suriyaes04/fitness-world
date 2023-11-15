package gym;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Intermediate extends JFrame implements ActionListener
{
	Icon i1 = new ImageIcon("C:\\Users\\TechForest\\OneDrive\\Pictures\\Saved Pictures\\Plan\\jumpingJacks.gif");
	Icon i2 = new ImageIcon("C:\\Users\\TechForest\\OneDrive\\Pictures\\Saved Pictures\\Plan\\highKnee.gif");
	Icon i3 = new ImageIcon("C:\\Users\\TechForest\\OneDrive\\Pictures\\Saved Pictures\\Plan\\pushUp.gif");
	Icon i4 = new ImageIcon("C:\\Users\\TechForest\\OneDrive\\Pictures\\Saved Pictures\\Plan\\pullUp.gif");
	Icon i5 = new ImageIcon("C:\\Users\\TechForest\\OneDrive\\Pictures\\Saved Pictures\\Plan\\mountainClimber.gif");
	Icon i6 = new ImageIcon("C:\\Users\\TechForest\\OneDrive\\Pictures\\Saved Pictures\\Plan\\lyingLegRise.gif");
	Icon i7 = new ImageIcon("C:\\Users\\TechForest\\OneDrive\\Pictures\\Saved Pictures\\Plan\\chairDips.gif");
	Icon i8= new ImageIcon("C:\\Users\\TechForest\\OneDrive\\Pictures\\Saved Pictures\\Plan\\legBicepsCurl.gif");
	Icon i9 = new ImageIcon("C:\\Users\\TechForest\\OneDrive\\Pictures\\Saved Pictures\\Plan\\alternateLungs.gif");
	Icon i10 = new ImageIcon("C:\\Users\\TechForest\\OneDrive\\Pictures\\Saved Pictures\\Plan\\sqarts.gif");
	
	JButton jumpingJacks;
	JButton highKnee;
	JButton pushUp;
	JButton wallPullUp;
	JButton mountainClimber;
	JButton lyingLegRise;
	JButton chairDips;
	JButton legBicepsCurl;
	JButton alternateLungs;
	JButton sqarts;
	Intermediate()
	{
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setLayout(new GridLayout(5,2));
		this.setTitle("Intermediate");
		
		jumpingJacks = new JButton("JumpingJacks  -  30x");
		jumpingJacks.setFocusable(false);
		jumpingJacks.addActionListener(this);
		jumpingJacks.setFont(new Font("consolas",Font.PLAIN,40));
		jumpingJacks.setBorder(BorderFactory.createLineBorder(Color.white));
		jumpingJacks.setForeground(Color.orange);
		jumpingJacks.setBackground(Color.black);
		jumpingJacks.setOpaque(true);
		
		highKnee = new JButton("HighKnee  -  30x");
		highKnee.setFocusable(false);
		highKnee.addActionListener(this);
		highKnee.setFont(new Font("consolas",Font.PLAIN,40));
		highKnee.setBorder(BorderFactory.createLineBorder(Color.white));
		highKnee.setForeground(Color.orange);
		highKnee.setBackground(Color.black);
		highKnee.setOpaque(true);
		
		pushUp = new JButton("PushUp  -  20x");
		pushUp.setFocusable(false);
		pushUp.addActionListener(this);
		pushUp.setFont(new Font("consolas",Font.PLAIN,40));
		pushUp.setBorder(BorderFactory.createLineBorder(Color.white));
		pushUp.setForeground(Color.orange);
		pushUp.setBackground(Color.black);
		pushUp.setOpaque(true);
		
		wallPullUp = new JButton("WallPullUp  -  6-8x");
		wallPullUp.setFocusable(false);
		wallPullUp.addActionListener(this);
		wallPullUp.setFont(new Font("consolas",Font.PLAIN,40));
		wallPullUp.setBorder(BorderFactory.createLineBorder(Color.white));
		wallPullUp.setForeground(Color.orange);
		wallPullUp.setBackground(Color.black);
		wallPullUp.setOpaque(true);
		
		mountainClimber = new JButton("MountainClimber  -  30x");
		mountainClimber.setFocusable(false);
		mountainClimber.addActionListener(this);
		mountainClimber.setFont(new Font("consolas",Font.PLAIN,40));
		mountainClimber.setBorder(BorderFactory.createLineBorder(Color.white));
		mountainClimber.setForeground(Color.orange);
		mountainClimber.setBackground(Color.black);
		mountainClimber.setOpaque(true);
		
		lyingLegRise = new JButton("LyingLegRise  -  30x");
		lyingLegRise.setFocusable(false);
		lyingLegRise.addActionListener(this);
		lyingLegRise.setFont(new Font("consolas",Font.PLAIN,40));
		lyingLegRise.setBorder(BorderFactory.createLineBorder(Color.white));
		lyingLegRise.setForeground(Color.orange);
		lyingLegRise.setBackground(Color.black);
		lyingLegRise.setOpaque(true);
		
		chairDips = new JButton("ChairDips  -  15x");
		chairDips.setFocusable(false);
		chairDips.addActionListener(this);
		chairDips.setFont(new Font("consolas",Font.PLAIN,40));
		chairDips.setBorder(BorderFactory.createLineBorder(Color.white));
		chairDips.setForeground(Color.orange);
		chairDips.setBackground(Color.black);
		chairDips.setOpaque(true);
		
		legBicepsCurl = new JButton("LegBicepsCurl -  20x");
		legBicepsCurl.setFocusable(false);
		legBicepsCurl.addActionListener(this);
		legBicepsCurl.setFont(new Font("consolas",Font.PLAIN,40));
		legBicepsCurl.setBorder(BorderFactory.createLineBorder(Color.white));
		legBicepsCurl.setForeground(Color.orange);
		legBicepsCurl.setBackground(Color.black);
		legBicepsCurl.setOpaque(true);
		
		alternateLungs = new JButton("AlternateLungs  -  20x");
		alternateLungs.setFocusable(false);
		alternateLungs.addActionListener(this);
		alternateLungs.setFont(new Font("consolas",Font.PLAIN,40));
		alternateLungs.setBorder(BorderFactory.createLineBorder(Color.white));
		alternateLungs.setForeground(Color.orange);
		alternateLungs.setBackground(Color.black);
		alternateLungs.setOpaque(true);
		
		sqarts = new JButton("Sqarts  -  25x");
		sqarts.setFocusable(false);
		sqarts.addActionListener(this);
		sqarts.setFont(new Font("consolas",Font.PLAIN,40));
		sqarts.setBorder(BorderFactory.createLineBorder(Color.white));
		sqarts.setForeground(Color.orange);
		sqarts.setBackground(Color.black);
		sqarts.setOpaque(true);
		
		
		this.add(jumpingJacks);
		this.add(highKnee);
		this.add(pushUp);
		this.add(wallPullUp);
		this.add(mountainClimber);
		this.add(lyingLegRise);
		this.add(chairDips);
		this.add(legBicepsCurl);
		this.add(alternateLungs);
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
			new Intermediate();
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
		if(e.getSource() == highKnee)
		{
			this.dispose();
			back.setIcon(i2);
			f.setVisible(true);
		}
		if(e.getSource() == pushUp)
		{
			this.dispose();
			back.setIcon(i3);
			f.setVisible(true);
		}
		if(e.getSource() == wallPullUp)
		{
			this.dispose();
			back.setIcon(i4);
			f.setVisible(true);
		}
		if(e.getSource() == mountainClimber)
		{
			this.dispose();
			back.setIcon(i5);
			f.setVisible(true);
		}
		if(e.getSource() == lyingLegRise)
		{
			this.dispose();
			back.setIcon(i6);
			f.setVisible(true);
		}
		if(e.getSource() == chairDips)
		{
			this.dispose();
			back.setIcon(i7);
			f.setVisible(true);
		}
		if(e.getSource() == legBicepsCurl)
		{
			this.dispose();
			back.setIcon(i8);
			f.setVisible(true);
		}
		if(e.getSource() == alternateLungs)
		{
			this.dispose();
			back.setIcon(i9);
			f.setVisible(true);
		}
		if(e.getSource() == sqarts)
		{
			this.dispose();
			back.setIcon(i10);
			f.setVisible(true);
		}
		
	}

}
