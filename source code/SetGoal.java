package gym;

import java.awt.*;
import javax.swing.*;

public class SetGoal 
{
	JRadioButton male;
	JRadioButton female;
	JFrame f;
	JLabel days;
	JTextField wg;
	JTextField hg;
	JLabel w;
	JLabel h;
	SetGoal()
	{
		f = new JFrame();
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f.setLayout(null);
		f.setTitle("Goal");
		
		JSlider s = new JSlider(1,7,1);
		s.setPreferredSize(new Dimension(400,200));
		s.setPaintTrack(true);
		s.setMajorTickSpacing(1);
		s.setPaintLabels(true);
		s.setFont(new Font("Cambria",Font.PLAIN,50));
		s.setBounds(5,0, 900,200);
		
		days = new JLabel(s.getValue() +" Days");
		days.setBackground(Color.magenta);
		days.setOpaque(true);
		days.setFont(new Font("consolas",Font.BOLD,50));
		days.setBounds(1000,50,250,100);
		
		s.addChangeListener(x -> 
		{
			days.setText(s.getValue() + " Days");
		}
		);
		
		male = new JRadioButton(" Male ");
		female = new JRadioButton(" Female ");
		male.setBounds(50,200,300,100);
		male.setFont(new Font("Ariel",Font.BOLD,50));
		male.setForeground(Color.red);
		female.setBounds(500,200,300,100);
		female.setFont(new Font("Ariel",Font.BOLD,50));
		female.setForeground(Color.blue);
		ButtonGroup g = new ButtonGroup();
		g.add(male);
		g.add(female);
		
		w = new JLabel(" Weight : ");
		w.setFont(new Font("MV Boli",Font.BOLD,40));
		w.setForeground(Color.cyan);
		w.setBackground(Color.DARK_GRAY);
		w.setOpaque(true);
		w.setBounds(5,350,300,70);
		wg = new JTextField(5);
		wg.setFont(new Font("Areial",Font.ITALIC,40));
		wg.setForeground(Color.magenta);
		wg.setBackground(Color.BLUE);
		wg.setBounds(400,350,300,70);
		
		h = new JLabel(" Height : ");
		h.setFont(new Font("MV Boli",Font.BOLD,40));
		h.setForeground(Color.cyan);
		h.setBackground(Color.DARK_GRAY);
		h.setOpaque(true);
		h.setBounds(5,470,300,70);
		hg = new JTextField(5);
		hg.setFont(new Font("Areial",Font.ITALIC,40));
		hg.setForeground(Color.magenta);
		hg.setBackground(Color.BLUE);
		hg.setBounds(400,470,300,70);
		
		
		JButton b = new JButton("Set");
		b.setFocusable(false);
		b.setBackground(Color.BLACK);
		b.setForeground(Color.green);
		b.setFont(new Font("Consolas",Font.PLAIN,40));
		b.setBounds(1200,600, 100, 60);
		b.addActionListener(a -> 
		{
			if(a.getSource() == b)
			{
				f.dispose();
				new Workout();
			}
		}
		);
		f.add(b);
		f.add(s);
		f.add(days);
		f.add(male);
		f.add(female);
		f.add(w);
		f.add(h);
		f.add(wg);
		f.add(hg);
		f.setSize(1400,800);
		f.setVisible(true);	
	}
}
