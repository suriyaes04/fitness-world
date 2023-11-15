package gym;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Workout extends JFrame implements ActionListener
{
	JButton goal;
	JButton b;
	Workout()
	{
		ImageIcon t = new ImageIcon("C:\\Users\\TechForest\\OneDrive\\Pictures\\Saved Pictures\\Project\\Hub.png");
		JLabel l1 = new JLabel(t);
		l1.setBounds(35,10,200,150);
		l1.setBorder(BorderFactory.createLineBorder(Color.black));
		
		JComboBox<String> top = new JComboBox<>();
		top.setFont(new Font("MV Boli",Font.PLAIN,40));
		top.addItem("Training Plans");
		top.addItem("Report");
		top.addItem("Settings");
		top.addItem("Exit");
		top.addActionListener(o ->
		{
			if("Training Plans".equals(top.getSelectedItem()))
			{
				this.dispose();
				new Workout2();
			}
			if("Settings".equals(top.getSelectedItem()))
			{
				this.dispose();
				new SetGoal();
			}
			if("Exit".equals(top.getSelectedItem()))
			{
				System.exit(0);
			}
		});
		top.setBounds(10,170,300,50);
		
		goal = new JButton("Set Goal");
		goal.setFocusable(false);
		goal.setFont(new Font("MV Boli",Font.BOLD,30));
		goal.setBackground(Color.cyan);
		goal.setOpaque(true);
		goal.setForeground(Color.black);
		goal.setBounds(600,35,200,30);
		goal.addActionListener(this);
		
	    ImageIcon i = new ImageIcon("C:\\Users\\TechForest\\OneDrive\\Pictures\\Saved Pictures\\Project\\Fit.jpg");
		b = new JButton();
		b.setText("Day Begins");
		b.setIcon(i);
		b.setIconTextGap(25);
		b.setFont(new Font("consolas",Font.PLAIN,50));
		b.setForeground(Color.black);
		b.setBackground(Color.white);
		b.setFocusable(false);
		b.setBounds(400,80,600,600);
		b.setBorder(BorderFactory.createLineBorder(Color.black,5));

		b.setHorizontalTextPosition(JButton.CENTER);
		b.setVerticalTextPosition(JButton.TOP);
		b.addActionListener(this);

		
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setLayout(null);
		
		this.setTitle("Gym");
		
		 ImageIcon backgroundImage = new ImageIcon("C:\\Users\\TechForest\\OneDrive\\Pictures\\Saved Pictures\\Project\\background.jpg");
	        JPanel backgroundPanel = new JPanel()
	        {
	            @Override
	            protected void paintComponent(Graphics g) 
	            {
	                super.paintComponent(g);
	                g.drawImage(backgroundImage.getImage(), 0, 0, getWidth(), getHeight(), null);
	            }
	        };
	        backgroundPanel.setLayout(null);

		backgroundPanel.add(l1);
		backgroundPanel.add(top);
		backgroundPanel.add(goal);
		backgroundPanel.add(b);
		this.setContentPane(backgroundPanel);
		this.setSize(getMaximumSize());
		this.setVisible(true);
	}

	@Override
	public void actionPerformed(ActionEvent e) 
	{
		if(e.getSource() == goal)
		{
			this.dispose();
			new SetGoal();
		}
		if(e.getSource() == b)
		{
			this.dispose();
			new Workout2();
		}
	}
}



