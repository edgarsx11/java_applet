package java_I;

import java.applet.*;

import java.awt.*;
import java.awt.event.*;
public class gra extends Applet implements AdjustmentListener, MouseMotionListener ,ActionListener, ItemListener,MouseListener, KeyListener
{
private int last_x, last_y;
        int size = 1;
        Button resize;
        Button reColor;
        Button square;
        Button eraser;
        Button circle;
        Button pen;
        Button elipse;
        Button rectangle;
        Button setWidthHeight;
        TextField lineSizer;
        TextField widthSize;
        TextField heightSize;
        String str = "";
        String action = "";
        String figure = "";
        int width=1;
        int height=1;
        List colors;
        
	public void init() 
	{
			resize(950,500);
			
		this.addMouseListener(this) ;
		this.addMouseMotionListener(this);
		
		Label lineSizer_str=new Label("Size of brush: ");
		lineSizer=new TextField(6);
		setLayout(null);
		lineSizer_str.setBounds(10,38,80,20);
		lineSizer.setBounds(90,38,80,20);
		add(lineSizer);
		add(lineSizer_str);
		lineSizer.addActionListener((ActionListener) this);
		
		resize=new Button("RESIZE");
		resize.setBounds(90,65,80,20);
		add(resize);
		resize.addActionListener(this);
		reColor = new Button("Change color");
		setLayout(null);
		reColor.setBounds(90,160,80,20);
		add(reColor);
		reColor.addActionListener(this);
		
		square = new Button ("Square");
		square.setBounds(10,275,59,30);
        add(square);
        square.addActionListener(this);
        
        circle = new Button ("Circle");
        circle.setBounds(70,240,59,30);
        add(circle);
        circle.addActionListener(this);
        
        eraser = new Button ("Eraser");
        eraser.setBounds(130,240,59,30);
        add(eraser);
        eraser.addActionListener(this);
        
        pen = new Button ("Pen");     
        pen.setBounds(10,240,59,30);
        add(pen);
        pen.addActionListener(this);
        
        rectangle = new Button ("Rectangle");
        rectangle.setBounds(70,275,59,30);
        add(rectangle);
        rectangle.addActionListener(this);
        
        elipse = new Button ("Elipse");
        elipse.setBounds(130,275,59,30);
        add(elipse);
        elipse.addActionListener(this);
        
        setWidthHeight = new Button ("SET");
        setWidthHeight.setBounds(55,375,80,20);
        add(setWidthHeight);
        setWidthHeight.addActionListener(this);
        
		colors = new List(10, true);
		colors.add("Green");
		colors.add("Red");
		colors.add("Blue");
		colors.add("Black");
		colors.add("Yellow");
		colors.add("Orange");
		colors.add("Gray");
		colors.add("Dark Gray");
		colors.add("Light Gray");
		colors.add("Magenta");
		colors.add("Cyan");
		colors.add("Pink");
		colors.setBounds(10,90,160,60);
		add(colors);
		colors.addActionListener(this);
		
		Label widthStr=new Label("Width: ");
		widthSize=new TextField(6);
		setLayout(null);
		widthStr.setBounds(10,320,45,20);
		widthSize.setBounds(55,320,80,20);
		add(widthSize);
		add(widthStr);
		widthSize.addActionListener((ActionListener) this);
		
		Label heightStr=new Label("Height: ");
		heightSize=new TextField(6);
		setLayout(null);
		heightStr.setBounds(10,345,45,20);
		heightSize.setBounds(55,345,80,20);
		add(heightSize);
		add(heightStr);
		heightSize.addActionListener((ActionListener) this);
		
		this.setFocusable(true);this.hasFocus();
		this.addKeyListener(this);
		
	
	}

	public void mousePressed(MouseEvent e) 
	{
		Graphics g = this.getGraphics();
		
		 if(action =="Green"){g.setColor(Color.green);}
	     else if(action =="Red"){g.setColor(Color.red);}
	     else if(action =="Blue"){g.setColor(Color.blue);}
	     else if(action =="Black"){g.setColor(Color.black);}
	     else if(action =="Yellow"){g.setColor(Color.yellow);}
	     else if(action =="Orange"){g.setColor(Color.orange);}
	     else if(action =="Gray"){g.setColor(Color.gray);}
	     else if(action =="Dark Gray"){g.setColor(Color.darkGray);}
	     else if(action =="Light Gray"){g.setColor(Color.lightGray);}
	     else if(action =="Magenta"){g.setColor(Color.magenta);}
	     else if(action =="Cyan"){g.setColor(Color.cyan);}
	     else if(action =="Pink"){g.setColor(Color.pink);}
		
		last_x = e.getX();	last_y = e.getY();
		int x = e.getX(), y = e.getY();
		
		
		if(e.getButton() == MouseEvent.BUTTON1)
		{
		if(x>200 && x<860 && y>20 && y<450)
		  {
			if(figure == "Square")
				g.fillRect(last_x, last_y,size,size);
			else if (figure == "Circle")
				g.fillOval(last_x, last_y,size,size);
			else if (figure == "Rectangle")
				g.fillRect(last_x, last_y, width, height);
			else if (figure == "Elipse")
				g.fillOval(last_x, last_y, width, height);
		  }
		}
		else if (e.getButton() == MouseEvent.BUTTON3)
		{
			if(x>200 && x<860 && y>20 && y<450)
			  {
				if(figure == "Square")
					g.drawRect(last_x, last_y,size,size);
				else if (figure == "Circle")
					g.drawOval(last_x, last_y,size,size);
				else if (figure == "Rectangle")
					g.drawRect(last_x, last_y, width, height);
				else if (figure == "Elipse")
					g.drawOval(last_x, last_y, width, height);
			  }
		}
		
		
	}

	public void mouseDragged(MouseEvent e) 
	{
	Graphics g = this.getGraphics();
	 if(action =="Green"){g.setColor(Color.green);}
     else if(action =="Red"){g.setColor(Color.red);}
     else if(action =="Blue"){g.setColor(Color.blue);}
     else if(action =="Black"){g.setColor(Color.black);}
     else if(action =="Yellow"){g.setColor(Color.yellow);}
     else if(action =="Orange"){g.setColor(Color.orange);}
     else if(action =="Gray"){g.setColor(Color.gray);}
     else if(action =="Dark Gray"){g.setColor(Color.darkGray);}
     else if(action =="Light Gray"){g.setColor(Color.lightGray);}
     else if(action =="Magenta"){g.setColor(Color.magenta);}
     else if(action =="Cyan"){g.setColor(Color.cyan);}
     else if(action =="Pink"){g.setColor(Color.pink);}
	 
		 int x = e.getX(), y = e.getY();
		 
		 
		 if(x>200 && x<890 && y>20 && y<490)
			 {
			if(figure == "Pen")
			{
			 if(size>1)
				{
					
					g.fillOval(last_x, last_y,size,size);
					last_x =x; last_y =y;
				}
			else
				{
					g.drawLine(last_x, last_y,x,y);
					last_x = x; last_y = y;
				}
			}
			 
			 if(figure == "Eraser")
				 {
					g.setColor(Color.white);
				  
				    g.fillRect(last_x, last_y,size-5,size-5);
				    last_x = x; last_y = y;
				 }
			 }
	
	}

	public void mouseReleased(MouseEvent e) {;}
	public void mouseClicked(MouseEvent e) {;}
	public void mouseEntered(MouseEvent e) {;}
	public void mouseExited(MouseEvent e) {;}
	public void mouseMoved(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}
	
	@Override
	public void itemStateChanged(ItemEvent arg0) {
		// TODO Auto-generated method stub
		
	}
	
	@Override
	public void actionPerformed(ActionEvent arg0) {
		// TODO Auto-generated method stub
		String str1 =arg0.getActionCommand();
		if(str1.equals("RESIZE"))
		size = Double.valueOf(lineSizer.getText()).intValue();
		
		String str2 =arg0.getActionCommand();
		if(str2.equals("Change color"))
		{
			int colorIndexes[];
			colorIndexes = colors.getSelectedIndexes();
	        for(int i=0; i<colorIndexes.length; i++)
	        {
	           action = colors.getItem(colorIndexes[i]);
	        }
	    	if(str1.equals("RESIZE"))
	    	size = Double.valueOf(lineSizer.getText()).intValue();
		}
		
		String str3 =arg0.getActionCommand();
		
		String str4 = arg0.getActionCommand();
		if(str4.equals("SET"))
		{
			width = Double.valueOf(widthSize.getText()).intValue();
			height = Double.valueOf(heightSize.getText()).intValue();
		}
		
		if(str3.equals("Square"))
			figure = square.getLabel();
		else if (str3.equals("Circle"))
			figure = circle.getLabel();
		else if (str3.equals("Eraser"))
			figure = eraser.getLabel();
		else if (str3.equals("Pen"))
			figure = pen.getLabel();
		else if (str3.equals("Rectangle"))
			figure = rectangle.getLabel();
		else if (str3.equals("Elipse"))
			figure = elipse.getLabel();
		
	}
	
	@Override
	public void adjustmentValueChanged(AdjustmentEvent arg0) {
		// TODO Auto-generated method stub
		
	}
	public void paint (Graphics g2)
	{
		
		g2.setColor(Color.BLACK);
		g2.drawRect(0,0,200,400);
	}

	@Override
	public void keyPressed(KeyEvent arg0) {
		// TODO Auto-generated method stub
		if (arg0.getKeyCode() == KeyEvent.VK_A)
				System.out.println("aaaa1");
	}

	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}
}