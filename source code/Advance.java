package gym;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Advance extends JFrame implements ActionListener
{
	Icon i1 = new ImageIcon("C:\\Users\\TechForest\\OneDrive\\Pictures\\Saved Pictures\\Plan\\jumpingJacks.gif");
	Icon i2 = new ImageIcon("C:\\Users\\TechForest\\OneDrive\\Pictures\\Saved Pictures\\Plan\\highKnee.gif");
	Icon i3 = new ImageIcon("C:\\Users\\TechForest\\OneDrive\\Pictures\\Saved Pictures\\Plan\\pushUp.gif");
	Icon i4 = new ImageIcon("C:\\Users\\TechForest\\OneDrive\\Pictures\\Saved Pictures\\Plan\\pullUp.gif");
	Icon i5 = new ImageIcon("C:\\Users\\TechForest\\OneDrive\\Pictures\\Saved Pictures\\Plan\\towelRows.gif");
	Icon i6 = new ImageIcon("C:\\Users\\TechForest\\OneDrive\\Pictures\\Saved Pictures\\Plan\\lyingLegRise.gif");
	Icon i7 = new ImageIcon("C:\\Users\\TechForest\\OneDrive\\Pictures\\Saved Pictures\\Plan\\Crunch.gif");
	Icon i8 = new ImageIcon("C:\\Users\\TechForest\\OneDrive\\Pictures\\Saved Pictures\\Plan\\chairDips.gif");
	Icon i9 = new ImageIcon("C:\\Users\\TechForest\\OneDrive\\Pictures\\Saved Pictures\\Plan\\diamondPushUp.gif");
	Icon i10= new ImageIcon("C:\\Users\\TechForest\\OneDrive\\Pictures\\Saved Pictures\\Plan\\legBicepsCurl.gif");
	Icon i11 = new ImageIcon("C:\\Users\\TechForest\\OneDrive\\Pictures\\Saved Pictures\\Plan\\pikePushUp.gif");
	Icon i12 = new ImageIcon("C:\\Users\\TechForest\\OneDrive\\Pictures\\Saved Pictures\\Plan\\plank.gif");
	Icon i13 = new ImageIcon("C:\\Users\\TechForest\\OneDrive\\Pictures\\Saved Pictures\\Plan\\sqarts.gif");
	Icon i14= new ImageIcon("C:\\Users\\TechForest\\OneDrive\\Pictures\\Saved Pictures\\Plan\\alternateLungs.gif");
	Icon i15 = new ImageIcon("C:\\Users\\TechForest\\OneDrive\\Pictures\\Saved Pictures\\Plan\\wallSit.gif");
	Icon i16 = new ImageIcon("C:\\Users\\TechForest\\OneDrive\\Pictures\\Saved Pictures\\Plan\\calvesRise.gif");
	
	JButton jumpingJacks;
	JButton highKnee;
	JButton pushUp_Variation;
	JButton wallPullUp;
	JButton towelRows;
	JButton lyingLegRise;
	JButton absCrunch;
	JButton chairDips;
	JButton diamondPushUp;
	JButton legBicepsCurl;
	JButton pikePushUp;
	JButton plank;
	JButton sqarts;
	JButton alternateLungs;
	JButton wallSit;
	JButton calvesRise;
	Advance()
	{
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setLayout(new GridLayout(8,2));
		this.setTitle("Adavance");
		
		jumpingJacks = new JButton("JumpingJacks  -  30x");
		jumpingJacks.setFocusable(false);
		jumpingJacks.addActionListener(this);
		jumpingJacks.setFont(new Font("consolas",Font.PLAIN,40));
		jumpingJacks.setBorder(BorderFactory.createLineBorder(Color.white));
		jumpingJacks.setForeground(Color.red);
		jumpingJacks.setBackground(Color.black);
		jumpingJacks.setOpaque(true);

		highKnee = new JButton("HighKnee  -  30x");
		highKnee.setFocusable(false);
		highKnee.addActionListener(this);
		highKnee.setFont(new Font("consolas",Font.PLAIN,40));
		highKnee.setBorder(BorderFactory.createLineBorder(Color.white));
		highKnee.setForeground(Color.red);
		highKnee.setBackground(Color.black);
		highKnee.setOpaque(true);
		
		pushUp_Variation = new JButton("PushUp_Variation - each 10x");
		pushUp_Variation.setFocusable(false);
		pushUp_Variation.addActionListener(this);
		pushUp_Variation.setFont(new Font("consolas",Font.PLAIN,40));
		pushUp_Variation.setBorder(BorderFactory.createLineBorder(Color.white));
		pushUp_Variation.setForeground(Color.red);
		pushUp_Variation.setBackground(Color.black);
		pushUp_Variation.setOpaque(true);
		
		wallPullUp = new JButton("WallPullUp  -  12-15x");
		wallPullUp.setFocusable(false);
		wallPullUp.addActionListener(this);
		wallPullUp.setFont(new Font("consolas",Font.PLAIN,40));
		wallPullUp.setBorder(BorderFactory.createLineBorder(Color.white));
		wallPullUp.setForeground(Color.red);
		wallPullUp.setBackground(Color.black);
		wallPullUp.setOpaque(true);
		
		towelRows = new JButton("TowelRows  -  20x");
		towelRows.setFocusable(false);
		towelRows.addActionListener(this);
		towelRows.setFont(new Font("consolas",Font.PLAIN,40));
		towelRows.setBorder(BorderFactory.createLineBorder(Color.white));
		towelRows.setForeground(Color.red);
		towelRows.setBackground(Color.black);
		towelRows.setOpaque(true);
		
		lyingLegRise = new JButton("LyingLegRise  -  30x");
		lyingLegRise.setFocusable(false);
		lyingLegRise.addActionListener(this);
		lyingLegRise.setFont(new Font("consolas",Font.PLAIN,40));
		lyingLegRise.setBorder(BorderFactory.createLineBorder(Color.white));
		lyingLegRise.setForeground(Color.red);
		lyingLegRise.setBackground(Color.black);
		lyingLegRise.setOpaque(true);
		
		absCrunch = new JButton("AbsCrunch  -  30x");
		absCrunch.setFocusable(false);
		absCrunch.addActionListener(this);
		absCrunch.setFont(new Font("consolas",Font.PLAIN,40));
		absCrunch.setBorder(BorderFactory.createLineBorder(Color.white));
		absCrunch.setForeground(Color.red);
		absCrunch.setBackground(Color.black);
		absCrunch.setOpaque(true);
		
		chairDips = new JButton("ChairDips  -  30x");
		chairDips.setFocusable(false);
		chairDips.addActionListener(this);
		chairDips.setFont(new Font("consolas",Font.PLAIN,40));
		chairDips.setBorder(BorderFactory.createLineBorder(Color.white));
		chairDips.setForeground(Color.red);
		chairDips.setBackground(Color.black);
		chairDips.setOpaque(true);
		
		diamondPushUp = new JButton("DiamondPushUp  -  20x");
		diamondPushUp.setFocusable(false);
		diamondPushUp.addActionListener(this);
		diamondPushUp.setFont(new Font("consolas",Font.PLAIN,40));
		diamondPushUp.setBorder(BorderFactory.createLineBorder(Color.white));
		diamondPushUp.setForeground(Color.red);
		diamondPushUp.setBackground(Color.black);
		diamondPushUp.setOpaque(true);
		
		legBicepsCurl = new JButton("LegBicepsCurl  -  30x");
		legBicepsCurl.setFocusable(false);
		legBicepsCurl.addActionListener(this);
		legBicepsCurl.setFont(new Font("consolas",Font.PLAIN,40));
		legBicepsCurl.setBorder(BorderFactory.createLineBorder(Color.white));
		legBicepsCurl.setForeground(Color.red);
		legBicepsCurl.setBackground(Color.black);
		legBicepsCurl.setOpaque(true);
		
		pikePushUp = new JButton("PikePushUp  -  15x");
		pikePushUp.setFocusable(false);
		pikePushUp.addActionListener(this);
		pikePushUp.setFont(new Font("consolas",Font.PLAIN,40));
		pikePushUp.setBorder(BorderFactory.createLineBorder(Color.white));
		pikePushUp.setForeground(Color.red);
		pikePushUp.setBackground(Color.black);
		pikePushUp.setOpaque(true);
		
		plank = new JButton("Plank  -  60s");
		plank.setFocusable(false);
		plank.addActionListener(this);
		plank.setFont(new Font("consolas",Font.PLAIN,40));
		plank.setBorder(BorderFactory.createLineBorder(Color.white));
		plank.setForeground(Color.red);
		plank.setBackground(Color.black);
		plank.setOpaque(true);
		
		sqarts = new JButton("Sqarts  -  30x");
		sqarts.setFocusable(false);
		sqarts.addActionListener(this);
		sqarts.setFont(new Font("consolas",Font.PLAIN,40));
		sqarts.setBorder(BorderFactory.createLineBorder(Color.white));
		sqarts.setForeground(Color.red);
		sqarts.setBackground(Color.black);
		sqarts.setOpaque(true);
		
		alternateLungs = new JButton("AlternateLungs  -  30x");
		alternateLungs.setFocusable(false);
		alternateLungs.addActionListener(this);
		alternateLungs.setFont(new Font("consolas",Font.PLAIN,40));
		alternateLungs.setBorder(BorderFactory.createLineBorder(Color.white));
		alternateLungs.setForeground(Color.red);
		alternateLungs.setBackground(Color.black);
		alternateLungs.setOpaque(true);
		
		wallSit = new JButton("WallSit  -  60s");
		wallSit.setFocusable(false);
		wallSit.addActionListener(this);
		wallSit.setFont(new Font("consolas",Font.PLAIN,40));
		wallSit.setBorder(BorderFactory.createLineBorder(Color.white));
		wallSit.setForeground(Color.red);
		wallSit.setBackground(Color.black);
		wallSit.setOpaque(true);
		
		calvesRise = new JButton("CalvesRise  -  30x");
		calvesRise.setFocusable(false);
		calvesRise.addActionListener(this);
		calvesRise.setFont(new Font("consolas",Font.PLAIN,40));
		calvesRise.setBorder(BorderFactory.createLineBorder(Color.white));
		calvesRise.setForeground(Color.red);
		calvesRise.setBackground(Color.black);
		calvesRise.setOpaque(true);
		
		
		this.add(jumpingJacks);
		this.add(highKnee);
		this.add(pushUp_Variation);
		this.add(wallPullUp);
		this.add(towelRows);
		this.add(lyingLegRise);
		this.add(absCrunch);
		this.add(chairDips);
		this.add(diamondPushUp);
		this.add(legBicepsCurl);
		this.add(pikePushUp);
		this.add(plank);
		this.add(sqarts);
		this.add(alternateLungs);
		this.add(wallSit);
		this.add(calvesRise);
		
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
			new Advance();
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
		if(e.getSource() == pushUp_Variation)
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
		if(e.getSource() == towelRows)
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
		if(e.getSource() == absCrunch)
		{
			this.dispose();
			back.setIcon(i7);
			f.setVisible(true);
		}
		if(e.getSource() == chairDips)
		{
			this.dispose();
			back.setIcon(i8);
			f.setVisible(true);
		}
		if(e.getSource() == diamondPushUp)
		{
			this.dispose();
			back.setIcon(i9);
			f.setVisible(true);
		}
		if(e.getSource() == legBicepsCurl)
		{
			this.dispose();
			back.setIcon(i10);
			f.setVisible(true);
		}
		if(e.getSource() == pikePushUp)
		{
			this.dispose();
			back.setIcon(i11);
			f.setVisible(true);
		}
		if(e.getSource() == plank)
		{
			this.dispose();
			back.setIcon(i12);
			f.setVisible(true);
		}
		if(e.getSource() == sqarts)
		{
			this.dispose();
			back.setIcon(i13);
			f.setVisible(true);
		}
		if(e.getSource() == alternateLungs)
		{
			this.dispose();
			back.setIcon(i14);
			f.setVisible(true);
		}
		if(e.getSource() == wallSit)
		{
			this.dispose();
			back.setIcon(i15);
			f.setVisible(true);
		}
		if(e.getSource() == calvesRise)
		{
			this.dispose();
			back.setIcon(i16);
			f.setVisible(true);
		}
		
		
	}

}
