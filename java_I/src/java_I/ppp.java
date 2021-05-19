package java_I;

import java.applet.*;
import java.awt.*;
import java.awt.event.*;
import java.lang.*;
public class ppp extends Applet implements AdjustmentListener, MouseMotionListener ,ActionListener, ItemListener,MouseListener 
{
private int last_x, last_y;
int size=1;
int oval_width;
int oval_height;
int rect_width;
int rect_height;
Button resize;
TextField name_TF;
TextField ovalw_TF;
TextField ovalh_TF;
TextField rectw_TF;
TextField recth_TF;
List color;
String msg = "";
Button recolor;
Checkbox linech;
Checkbox ovalch;
Checkbox ovalfillch;
Checkbox rectch;
Checkbox rectfillch;
public void init() 
{
	resize(950,500);
	setBackground(new Color(192,192,192));
	this.addMouseListener(this);
	this.addMouseMotionListener(this);
	
	Label name_L=new Label("Size of brush: ");
	name_TF=new TextField(6);
	setLayout(null);
	name_L.setBounds(10,38,80,20);
	name_TF.setBounds(90,38,80,20);
	add(name_TF);
	add(name_L);
	name_TF.addActionListener(this);
	linech = new Checkbox("Draw line", null, false);
	setLayout(null);
	linech.setBounds(20,10,150,20);
	add(linech);
	linech.addItemListener(this);
	
	//oval
	ovalch = new Checkbox("Draw oval", null, false);
	setLayout(null);
	ovalch.setBounds(20,200,150,20);
	add(ovalch);
	ovalfillch = new Checkbox("Fill oval", null, false);
	setLayout(null);
	ovalfillch.setBounds(20,225,150,20);
	add(ovalfillch);
	ovalfillch.addItemListener(this);
	Label oval_L=new Label("Size of oval: ");
	Label oval_wL=new Label("Width: ");
	Label oval_hL=new Label("Height: ");
	ovalw_TF=new TextField(6);
	ovalh_TF=new TextField(6);
	setLayout(null);
	oval_L.setBounds(20,255,80,20);
	oval_wL.setBounds(20,280,80,20);
	ovalw_TF.setBounds(65,280,40,20);
	oval_hL.setBounds(20,305,80,20);
	ovalh_TF.setBounds(65,305,40,20);
	add(ovalw_TF);
	add(ovalh_TF);
	add(oval_L);
	add(oval_wL);
	add(oval_hL);
	ovalw_TF.addActionListener(this);
	ovalh_TF.addActionListener(this);
	
	//rectangle
	rectch = new Checkbox("Draw rectangle", null, false);
	setLayout(null);
	rectch.setBounds(20,350,150,20);
	add(rectch);
	rectch.addItemListener(this);
	rectfillch = new Checkbox("Fill rectangle", null, false);
	setLayout(null);
	rectfillch.setBounds(20,375,150,20);
	add(rectfillch);
	rectfillch.addItemListener(this);
	Label rect_L=new Label("Size of rectangle: ");
	Label rect_wL=new Label("Width: ");
	Label rect_hL=new Label("Height: ");
	rectw_TF=new TextField(6);
	recth_TF=new TextField(6);
	setLayout(null);
	rect_L.setBounds(20,405,100,20);
	rect_wL.setBounds(20,430,80,20);
	rectw_TF.setBounds(65,430,40,20);
	rect_hL.setBounds(20,455,80,20);
	recth_TF.setBounds(65,455,40,20);
	add(rectw_TF);
	add(recth_TF);
	add(rect_L);
	add(rect_wL);
	add(rect_hL);
	rectw_TF.addActionListener(this);
	recth_TF.addActionListener(this);
	
    setLayout(null);
    resize=new Button("RESIZE");
	resize.setBounds(90,65,80,20);
	add(resize);
	resize.addActionListener(this);
	
	color = new List(10, true);
	color.add("Green");
	color.add("Red");
	color.add("Blue");
	color.add("Black");
	color.add("Yellow");
	color.add("Orange");
	color.add("Gray");
	color.add("Dark Gray");
	color.add("Light Gray");
	color.add("Magenta");
	color.add("Cyan");
	color.add("Pink");
	color.setBounds(10,90,160,60);
	add(color);
	color.addActionListener(this);
	
	recolor=new Button("RECOLOR");
	setLayout(null);
	recolor.setBounds(90,160,80,20);
	add(recolor);
	recolor.addActionListener(this);
	
}
public void mousePressed(MouseEvent e) 
{
	last_x = e.getX();
	last_y = e.getY();
	
	Graphics g = this.getGraphics();
	 if(msg=="Green"){g.setColor(Color.green);}
   else if(msg=="Red"){g.setColor(Color.red);}
   else if(msg=="Blue"){g.setColor(Color.blue);}
   else if(msg=="Black"){g.setColor(Color.black);}
   else if(msg=="Yellow"){g.setColor(Color.yellow);}
   else if(msg=="Orange"){g.setColor(Color.orange);}
   else if(msg=="Gray"){g.setColor(Color.gray);}
   else if(msg=="Dark Gray"){g.setColor(Color.darkGray);}
   else if(msg=="Light Gray"){g.setColor(Color.lightGray);}
   else if(msg=="Magenta"){g.setColor(Color.magenta);}
   else if(msg=="Cyan"){g.setColor(Color.cyan);}
   else if(msg=="Pink"){g.setColor(Color.pink);}
	 
	 if(ovalch.getState()==true)
	 {
		 if(last_x>200 && last_x<890 && last_y>20 && last_y<480)
		 {
		 if(ovalfillch.getState()==true)
		 {
			   oval_width = Float.valueOf(ovalw_TF.getText()).intValue(); 
			   oval_height = Float.valueOf(ovalh_TF.getText()).intValue(); 
		       g.fillOval(last_x,last_y, oval_width,oval_height);
		 }
		 else
		 {
			   oval_width = Float.valueOf(ovalw_TF.getText()).intValue(); 
			   oval_height = Float.valueOf(ovalh_TF.getText()).intValue(); 
		       g.drawOval(last_x,last_y, oval_width,oval_height);
		 }
		 }
	 }
	 
	 if(rectch.getState()==true)
	 {
		 if(last_x>200 && last_x<890 && last_y>20 && last_y<480)
		 {
		 if(rectfillch.getState()==true)
		 {
			 	rect_width = Float.valueOf(rectw_TF.getText()).intValue(); 
			 	rect_height = Float.valueOf(recth_TF.getText()).intValue(); 
		       g.fillRect(last_x,last_y, rect_width,rect_height);
		 }
		 else
		 {
			   rect_width = Float.valueOf(rectw_TF.getText()).intValue(); 
			   rect_height = Float.valueOf(recth_TF.getText()).intValue(); 
		       g.drawRect(last_x,last_y, rect_width,rect_height);
		 }
		 }
	 }
}
public void mouseDragged(MouseEvent e)
{
	Graphics g = this.getGraphics();
	 if(msg=="Green"){g.setColor(Color.green);}
     else if(msg=="Red"){g.setColor(Color.red);}
     else if(msg=="Blue"){g.setColor(Color.blue);}
     else if(msg=="Black"){g.setColor(Color.black);}
     else if(msg=="Yellow"){g.setColor(Color.yellow);}
     else if(msg=="Orange"){g.setColor(Color.orange);}
     else if(msg=="Gray"){g.setColor(Color.gray);}
     else if(msg=="Dark Gray"){g.setColor(Color.darkGray);}
     else if(msg=="Light Gray"){g.setColor(Color.lightGray);}
     else if(msg=="Magenta"){g.setColor(Color.magenta);}
     else if(msg=="Cyan"){g.setColor(Color.cyan);}
     else if(msg=="Pink"){g.setColor(Color.pink);}
	 
	 if(linech.getState()==true)
	 {
		 int x = e.getX(), y = e.getY();
		 if(x>200 && x<890 && y>20 && y<480)
		 {
		 if(size>1)
		{
			//g.setColor(new Color(0,0,0));
			g.fillOval(last_x, last_y,size,size);
			last_x =x; last_y =y;
		}
		else
		{
			g.drawLine(last_x, last_y,x,y);
			last_x = x; last_y = y;
		}
		 }
	 }
	 
}
public void actionPerformed(ActionEvent ae) 
{
	String str =ae.getActionCommand();
	if(str.equals("RESIZE"))
	size = Float.valueOf(name_TF.getText()).intValue();
	
	String str2 =ae.getActionCommand();
	if(str2.equals("RECOLOR"))
	{
		int idx[];
    	idx = color.getSelectedIndexes();
        for(int i=0; i<idx.length; i++)
        {
           msg = color.getItem(idx[i]);
        }
	}
	//repaint();	
}
public void mouseReleased(MouseEvent e) {;}
public void mouseClicked(MouseEvent e){	;}
public void mouseEntered(MouseEvent e) {;}
public void mouseExited(MouseEvent e) {;}
public void mouseMoved(MouseEvent e) {;}
public void itemStateChanged(ItemEvent arg0) {
	// TODO Auto-generated method stub
	
}
public void adjustmentValueChanged(AdjustmentEvent arg0) {
	// TODO Auto-generated method stub
	
}
public void paint (Graphics g2)
{
	g2.setColor(new Color(160,160,160));
	g2.setColor(Color.white);
	g2.fillRect(200,20,700,470);
}

}

