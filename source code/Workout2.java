package gym;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Workout2 extends JFrame implements ActionListener
{
	Icon image1;
	Icon image2;
	Icon image3;
	JButton b1;
	JButton b2;
	JButton b3;
	Workout2()
	{
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setLayout(new GridLayout());
		this.setTitle("Let's Start");
		
		image1 = new ImageIcon("C:\\Users\\TechForest\\OneDrive\\Pictures\\Saved Pictures\\Project\\Beg.jpg");
		b1 = new JButton(image1);
		b1.setText("Are you Beginner ?");
		b1.setFont(new Font("MV Boli",Font.BOLD,40));
		b1.setHorizontalTextPosition(JButton.CENTER);
		b1.setVerticalTextPosition(JButton.TOP);
		b1.setIconTextGap(100);
		b1.setFocusable(false);
		b1.setBackground(Color.green);
		b1.setOpaque(true);
		b1.addActionListener(this);
		this.add(b1);
		
		image2 = new ImageIcon("C:\\Users\\TechForest\\OneDrive\\Pictures\\Saved Pictures\\Project\\Int.jpg");
		b2 = new JButton(image2);
		b2.setText("Are you Mediate ?");
		b2.setFont(new Font("MV Boli",Font.BOLD,40));
		b2.setHorizontalTextPosition(JButton.CENTER);
		b2.setVerticalTextPosition(JButton.TOP);
		b2.setIconTextGap(100);
		b2.setFocusable(false);
		b2.setBackground(Color.yellow);
		b2.setOpaque(true);
		b2.addActionListener(this);
		this.add(b2);
		
		image3 = new ImageIcon("C:\\Users\\TechForest\\OneDrive\\Pictures\\Saved Pictures\\Project\\Adv.jpg");
		b3 = new JButton(image3);
		b3.setText("Are you Advance ?");
		b3.setFont(new Font("MV Boli",Font.BOLD,40));
		b3.setHorizontalTextPosition(JButton.CENTER);
		b3.setVerticalTextPosition(JButton.TOP);
		b3.setIconTextGap(100);
		b3.setFocusable(false);
		b3.setBackground(Color.red);
		b3.setOpaque(true);
		b3.addActionListener(this);
		this.add(b3);
		
		this.setSize(getMaximumSize());;
		this.setVisible(true);
	}
	
	@Override
	public void actionPerformed(ActionEvent e) 
	{
		if(e.getSource() == b1)
		{
			this.dispose();
			System.out.println("Beginner");
			new Beginner();
		}
		if(e.getSource() == b2)
		{
			this.dispose();
			System.out.println("Intermediate");
			new Intermediate();
		}
		if(e.getSource() == b3)
		{
			this.dispose();
			System.out.println("Advance");
			new Advance();
		}
	}

}
