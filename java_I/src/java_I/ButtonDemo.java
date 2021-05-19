package java_I;


	import java.awt.*;

	import java.awt.event.*;
	import java.awt.event.KeyAdapter;
	import java.awt.event.KeyEvent;
	import java.awt.event.KeyListener;


import java.applet.*;

	public class ButtonDemo extends Applet implements ActionListener,AdjustmentListener , MouseMotionListener,ItemListener, MouseListener, KeyListener
	{
	  Button white,red, green, cyan, move_right, move_left, move_up, move_down,resize_plus, resize_minus, shock, handsup, regular;
	  Scrollbar vertSB, horzSB;
	  Checkbox button_movement, scroll_bar_movement, mouse_movement, keyMovement;
	  
	  
	class Robby
	{
	  		int x,y,w,h,c, mood, action, action2;
	  	Robby(int x,int y,int w, int h){
	  		this.x=x;this.y=y;this.w=w;this.h=h;}
	  	
	  	public void draw(Graphics g)
	  	{
	  		int mx,my;
	  		g.setColor(Color.MAGENTA);
		    g.fillArc(w+h+75+x, 55+y-h, 150+w+h, 125+h+h, 0, 180); // head circle
		    g.fillRect(w+h+75+x, 115+y, 150+w+h, 150+w+h); // body		 
		    g.fillRoundRect(w+h+75+x, 255+y+h, 150+w+h, 20+w+h, 20, 20); // cause bottom of body has round corners
		    g.fillRoundRect(40+x+w, 120+y, 30+w, 110+h+w, 30, 30); // right hand
		    g.fillRoundRect(230+x+w+h+w+h, 120+y, 30+w, 110+h+w, 30, 30); // left hand
		    g.fillRoundRect(95+x+w+h, 255+y+w+h, 30+w, 70+h+w, 30, 30); // right leg
		    g.fillRoundRect(175+x+w+h+w, 255+y+w+h, 30+w, 70+h+w, 30, 30); // left leg
		
		
		    g.setColor(Color.black);
		    g.fillOval(w+h+w/8+110+x, 80+y-h, 20+w, 20+h); // left eye
		    g.fillOval(w+h+h+170+x, 80+y-h, 20+w, 20+h); // right eye
		    g.drawRect(5, 0, 635, 395);
		    
		    
		    g.setColor(Color.white);
		    g.fillOval(173+x+w+h+w, 82+y-h, 10+w/2, 10+h/2); //eye		 
		    g.fillOval(113+x+w+h+w/4, 82+y-h, 10+w/2, 10+h/2); //eye
		    
		   
			g.setColor(Color.red); 
			g.fillRoundRect(105+x+w+h, 115+y, 90+w+h, 70+h+w, 20, 20); //mouth
			
			g.setColor(Color.white); //teeth		
		    int[] xPoints0 = new int[]{110+x+w+h, 115+x+w+h+w/8, 120+x+h+w+w/4};
	        int[] yPoints0 = new int[]{116+y, 126+y+h, 116+y};
	  		g.fillPolygon(xPoints0, yPoints0, 3);
	  		
	  		int[] xPoints1 = new int[]{120+x+w+h+w/4, w/4+125+x+w+h+w/8, w/4+130+x+w+h+w/4};
	        int[] yPoints1 = new int[]{116+y, 126+y+h, 116+y};
	        g.fillPolygon(xPoints1, yPoints1, 3);
	        
	        int[] xPoints2 = new int[]{130+x+w+h+2*(w/4), w/4+135+x+w+h+w/8+w/4, w/4+140+x+w/4+w+h+w/4};
	        int[] yPoints2 = new int[]{116+y, 126+y+h, 116+y};
	        g.fillPolygon(xPoints2, yPoints2, 3);
	        
	        int[] xPoints3 = new int[]{140+x+w+h+3*(w/4), 145+w+h+x+3*(w/4)+w/8, 150+x+w+h+4*(w/4)};
	        int[] yPoints3 = new int[]{116+y, 126+y+h, 116+y};
	        g.fillPolygon(xPoints3, yPoints3, 3);
	        
	        int[] xPoints4 = new int[]{150+x+w+h+4*(w/4), 155+w+h+x+4*(w/4)+w/8, 160+x+w+h+5*(w/4)};
	        int[] yPoints4 = new int[]{116+y, 126+y+h, 116+y};
	        g.fillPolygon(xPoints4, yPoints4, 3);
	        
	        int[] xPoints5 = new int[]{160+x+w+h+5*(w/4), 165+w+h+x+5*(w/4)+w/8, 170+x+w+h+6*(w/4)};
	        int[] yPoints5 = new int[]{116+y, 126+y+h, 116+y};
	        g.fillPolygon(xPoints5, yPoints5, 3);
	        
	        int[] xPoints6 = new int[]{170+x+w+h+6*(w/4), 175+w+h+x+6*(w/4)+w/8, 180+x+w+h+7*(w/4)};
	        int[] yPoints6 = new int[]{116+y, 126+y+h, 116+y};
	        g.fillPolygon(xPoints6, yPoints6, 3);
	        
	        int[] xPoints7 = new int[]{180+x+w+h+7*(w/4), 185+w+h+x+7*(w/4)+w/8, 190+x+w+h+8*(w/4)};
	        int[] yPoints7 = new int[]{116+y, 126+y+h, 116+y};
	        g.fillPolygon(xPoints7, yPoints7, 3);
	        
	        g.setColor(Color.white);
		    int[] xPoints8 = new int[]{110+x+w+h, 115+x+w+h+w/8, 120+x+h+w+w/4};
	        int[] yPoints8 = new int[]{186+y+h+w, 176+y+h, 186+y+h+w};
	  		g.fillPolygon(xPoints8, yPoints8, 3);
	  		
	  		int[] xPoints9 = new int[]{120+x+w+h+w/4, w/4+125+x+w+h+w/8, w/4+130+x+w+h+w/4};
	        int[] yPoints9 = new int[]{186+y+h+w, 176+y+h, 186+y+h+w};
	        g.fillPolygon(xPoints9, yPoints9, 3);
	        
	        int[] xPoints10 = new int[]{130+x+w+h+2*(w/4), w/4+135+x+w+h+w/8+w/4, w/4+140+x+w/4+w+h+w/4};
	        int[] yPoints10 = new int[]{186+y+h+w, 176+y+h, 186+y+h+w};
	        g.fillPolygon(xPoints10, yPoints10, 3);
	        
	        int[] xPoints11 = new int[]{140+x+w+h+3*(w/4), 145+w+h+x+3*(w/4)+w/8, 150+x+w+h+4*(w/4)};
	        int[] yPoints11 = new int[]{186+y+h+w, 176+y+h, 186+y+h+w};
	        g.fillPolygon(xPoints11, yPoints11, 3);
	        
	        int[] xPoints12 = new int[]{150+x+w+h+4*(w/4), 155+w+h+x+4*(w/4)+w/8, 160+x+w+h+5*(w/4)};
	        int[] yPoints12 = new int[]{186+y+h+w, 176+y+h, 186+y+h+w};
	        g.fillPolygon(xPoints12, yPoints12, 3);
	        
	        int[] xPoints13 = new int[]{160+x+w+h+5*(w/4), 165+w+h+x+5*(w/4)+w/8, 170+x+w+h+6*(w/4)};
	        int[] yPoints13 = new int[]{186+y+h+w, 176+y+h, 186+y+h+w};
	        g.fillPolygon(xPoints13, yPoints13, 3);
	        
	        int[] xPoints14 = new int[]{170+x+w+h+6*(w/4), 175+w+h+x+6*(w/4)+w/8, 180+x+w+h+7*(w/4)};
	        int[] yPoints14 = new int[]{186+y+h+w, 176+y+h, 186+y+h+w};
	        g.fillPolygon(xPoints14, yPoints14, 3);
	        
	        int[] xPoints15 = new int[]{180+x+w+h+7*(w/4), 185+w+h+x+7*(w/4)+w/8, 190+x+w+h+8*(w/4)};
	        int[] yPoints15 = new int[]{186+y+h+w, 176+y+h, 186+y+h+w};
	        g.fillPolygon(xPoints15, yPoints15, 3);
	        
		    g.setColor(Color.black); //band for hands
		    g.fillRect(230+x+w+h+w+h, 195+y+h, 30+w, 10+h); // left hand
		    g.fillRect(40+x+w, 195+y+h, 30+w, 10+h); // right hand
		    
		    switch(c)
		    {
		    case 1: g.setColor(Color.yellow);
		    g.fillRect(230+x+w+h+w+h, 195+y+h, 30+w, 10+h); // left hand
		    g.fillRect(40+x+w, 195+y+h, 30+w, 10+h);
		    break;
		    case 2: g.setColor(Color.cyan);
		    g.fillRect(230+x+w+h+w+h, 195+y+h, 30+w, 10+h); // left hand
		    g.fillRect(40+x+w, 195+y+h, 30+w, 10+h);
		    break;
		    case 3: g.setColor(Color.green);
		    g.fillRect(230+x+w+h+w+h, 195+y+h, 30+w, 10+h); // left hand
		    g.fillRect(40+x+w, 195+y+h, 30+w, 10+h);
		    break;
		    case 4: g.setColor(Color.blue);
		    g.fillRect(230+x+w+h+w+h, 195+y+h, 30+w, 10+h); // left hand
		    g.fillRect(40+x+w, 195+y+h, 30+w, 10+h);
		    break;
		    }
		    
		    switch (action)
	  		{
	  		case 1:
	  			g.setColor(Color.magenta);
	 		    g.fillOval(w+h+w/8+110+x, 80+y-h, 20+w, 20+h); // left eye
	 		    g.fillOval(w+h+h+170+x, 80+y-h, 20+w, 20+h); // right eye
	 		    g.fillOval(173+x+w+h+w, 82+y-h, 10+w/2, 10+h/2); //eye		 
	 		    g.fillOval(113+x+w+h+w/4, 82+y-h, 10+w/2, 10+h/2); //eye	 		    
	 			g.fillRoundRect(105+x+w+h, 115+y, 90+w+h, 70+h+w, 20, 20); //mouth	 		
	 		    //teeth
	 	  		g.fillPolygon(xPoints0, yPoints0, 3);	 	  			 	  		
	 	        g.fillPolygon(xPoints1, yPoints1, 3);	 	        	 	      
	 	        g.fillPolygon(xPoints2, yPoints2, 3);	 	      
	 	        g.fillPolygon(xPoints3, yPoints3, 3);	 	         	       
	 	        g.fillPolygon(xPoints4, yPoints4, 3);	 	         	      
	 	        g.fillPolygon(xPoints5, yPoints5, 3);	 	        	       
	 	        g.fillPolygon(xPoints6, yPoints6, 3);	 	      
	 	        g.fillPolygon(xPoints7, yPoints7, 3);	 	        	 	        
	 	  		g.fillPolygon(xPoints8, yPoints8, 3);	 	  			 	  		
	 	        g.fillPolygon(xPoints9, yPoints9, 3);	 	       
	 	        g.fillPolygon(xPoints10, yPoints10, 3);	 	        	 	     
	 	        g.fillPolygon(xPoints11, yPoints11, 3);	 	        	 	       
	 	        g.fillPolygon(xPoints12, yPoints12, 3);	 	        	 	        
	 	        g.fillPolygon(xPoints13, yPoints13, 3); 	        
	 	        g.fillPolygon(xPoints14, yPoints14, 3);       
	 	        g.fillPolygon(xPoints15, yPoints15, 3);	 	        
	 		    g.setColor(Color.black); //band for hands
	 		    g.fillRect(230+x+w+h+w+h, 195+y+h, 30+w, 10+h); // left hand
	 		    g.fillRect(40+x+w, 195+y+h, 30+w, 10+h); // right hand
	  		break;
	  		
	  		case 2:
	  			g.setColor(Color.black);
			    g.fillOval(w+h+w/8+110+x, 80+y-h, 20+w, 20+h); // left eye
			    g.fillOval(w+h+h+170+x, 80+y-h, 20+w, 20+h); // right eye			    			    
			    g.setColor(Color.white);
			    g.fillOval(173+x+w+h+w, 82+y-h, 10+w/2, 10+h/2); //eye		 
			    g.fillOval(113+x+w+h+w/4, 82+y-h, 10+w/2, 10+h/2); //eye			    			   
				g.setColor(Color.red); 
				g.fillRoundRect(105+x+w+h, 115+y, 90+w+h, 70+h+w, 20, 20); //mouth				
				g.setColor(Color.white); //teeth					  
		  		g.fillPolygon(xPoints0, yPoints0, 3);		  				  		
		        g.fillPolygon(xPoints1, yPoints1, 3);		        		        
		        g.fillPolygon(xPoints2, yPoints2, 3);		        		      
		        g.fillPolygon(xPoints3, yPoints3, 3);		        		       
		        g.fillPolygon(xPoints4, yPoints4, 3);		       		       
		        g.fillPolygon(xPoints5, yPoints5, 3);		        		        
		        g.fillPolygon(xPoints6, yPoints6, 3);		        		        
		        g.fillPolygon(xPoints7, yPoints7, 3);		        			   
		  		g.fillPolygon(xPoints8, yPoints8, 3);		  				  		
		        g.fillPolygon(xPoints9, yPoints9, 3);	        		      
		        g.fillPolygon(xPoints10, yPoints10, 3);		        		        
		        g.fillPolygon(xPoints11, yPoints11, 3);		        		       
		        g.fillPolygon(xPoints12, yPoints12, 3);		        		        
		        g.fillPolygon(xPoints13, yPoints13, 3);		       
		        g.fillPolygon(xPoints14, yPoints14, 3);	        
		        g.fillPolygon(xPoints15, yPoints15, 3);
	  			break;
	  			
	  		case 3: 
		  		g.setColor(Color.red);
		  		g.fillRoundRect(105+x+w+h, 113+y, 90+w+h, 74+h+w, 20, 20);	 
		  		g.setColor(Color.BLACK); 		
			    g.fillOval(173+x+w+h+w, 82+y-h, 10+w/2, 10+h/2); //eye		 
			    g.fillOval(113+x+w+h+w/4, 82+y-h, 10+w/2, 10+h/2); //eye
			    g.setColor(Color.white);
			    g.fillOval(w+h+w/8+112+x, 82+y-h, 15+w, 15+h); // left eye
			    g.fillOval(w+h+h+172+x, 82+y-h, 15+w, 15+h); // right eye
				break;
		  		case 4:  	
		  			g.setColor(Color.white); //band for hands
				    g.fillRect(230+x+w+h+w+h, 195+y+h, 30+w, 10+h); // left hand
				    g.fillRect(40+x+w, 195+y+h, 30+w, 10+h); // right hand
				    g.setColor(Color.white);
		  			g.fillRoundRect(40+x+w, 120+y, 30+w, 110+h+w, 30, 30); // right hand
				    g.fillRoundRect(230+x+w+h+w+h, 120+y, 30+w, 110+h+w, 30, 30); // left hand
				    g.fillRect(230+x+w+h+w+h, 195+y+h, 30+w, 10+h); // left hand
				    g.fillRect(40+x+w, 195+y+h, 30+w, 10+h); // right hand
				    g.setColor(Color.magenta);
				    g.fillRoundRect(40+x+w, 60+y, 30+w, 110+h+w, 30, 30); // right hand
				    g.fillRoundRect(230+x+w+h+w+h, 60+y, 30+w, 110+h+w, 30, 30); // left hand
				    g.setColor(Color.black);
				    g.fillRect(230+x+w+h+w+h, 85+y+h, 30+w, 10+h); // left hand
				    g.fillRect(40+x+w, 85+y+h, 30+w, 10+h); // right hand
				    break;
		  		case 5:
		  			g.setColor(Color.black);
				    g.fillOval(w+h+w/8+110+x, 80+y-h, 20+w, 20+h); // left eye
				    g.fillOval(w+h+h+170+x, 80+y-h, 20+w, 20+h); // right eye
				    		    
				    g.setColor(Color.white);
				    g.fillOval(173+x+w+h+w, 82+y-h, 10+w/2, 10+h/2); //eye		 
				    g.fillOval(113+x+w+h+w/4, 82+y-h, 10+w/2, 10+h/2); //eye
			
				    
				    
					g.setColor(Color.red); 
					g.fillRoundRect(105+x+w+h, 115+y, 90+w+h, 70+h+w, 20, 20); //mouth		
					g.setColor(Color.white); //teeth					 
			  		g.fillPolygon(xPoints0, yPoints0, 3);	  				  		
			        g.fillPolygon(xPoints1, yPoints1, 3);		        		        
			        g.fillPolygon(xPoints2, yPoints2, 3);		       		      
			        g.fillPolygon(xPoints3, yPoints3, 3);		        		       
			        g.fillPolygon(xPoints4, yPoints4, 3);		        		       
			        g.fillPolygon(xPoints5, yPoints5, 3);		        
			        g.fillPolygon(xPoints6, yPoints6, 3);		        		        
			        g.fillPolygon(xPoints7, yPoints7, 3);		       		       			   
			  		g.fillPolygon(xPoints8, yPoints8, 3);
			        g.fillPolygon(xPoints9, yPoints9, 3);     
			        g.fillPolygon(xPoints10, yPoints10, 3);      
			        g.fillPolygon(xPoints11, yPoints11, 3);
			        g.fillPolygon(xPoints12, yPoints12, 3);    
			        g.fillPolygon(xPoints13, yPoints13, 3);    
			        g.fillPolygon(xPoints14, yPoints14, 3);  
			        g.fillPolygon(xPoints15, yPoints15, 3);
		  			break;
		  		case 6:
		  			g.setColor(Color.white);
				    g.fillArc(w+h+75+x, 55+y-h, 150+w+h, 125+h+h, 0, 180); // head circle
				    g.fillRect(w+h+75+x, 115+y, 150+w+h, 150+w+h); // body		 
				    g.fillRoundRect(w+h+75+x, 255+y+h, 150+w+h, 20+w+h, 20, 20); // cause bottom of body has round corners
				    g.fillRoundRect(40+x+w, 120+y, 30+w, 110+h+w, 30, 30); // right hand
				    g.fillRoundRect(230+x+w+h+w+h, 120+y, 30+w, 110+h+w, 30, 30); // left hand
				    g.fillRoundRect(95+x+w+h, 255+y+w+h, 30+w, 70+h+w, 30, 30); // right leg
				    g.fillRoundRect(175+x+w+h+w, 255+y+w+h, 30+w, 70+h+w, 30, 30); // left leg
				    g.fillOval(w+h+w/8+110+x, 80+y-h, 20+w, 20+h); // left eye
				    g.fillOval(w+h+h+170+x, 80+y-h, 20+w, 20+h); // right eye
				    g.fillOval(173+x+w+h+w, 82+y-h, 10+w/2, 10+h/2); //eye		 
				    g.fillOval(113+x+w+h+w/4, 82+y-h, 10+w/2, 10+h/2); //eye			    				  	
					g.fillRoundRect(105+x+w+h, 115+y, 90+w+h, 70+h+w, 20, 20); //mouth
					
		  			g.setColor(Color.MAGENTA);
				    g.fillArc(w+h+75+x, 55+y-h, 115+w+h, 125+h+h, 0, 180); // head circle
				    g.fillRect(w+h+75+x, 115+y, 115+w+h, 150+w+h); // body		 
				    g.fillRoundRect(w+h+75+x, 255+y+h, 115+w+h, 20+w+h, 20, 20); // cause bottom of body has round corners				  
				    g.fillRoundRect(105+x+w+h+w/2, 255+y+w+h, 50+w, 70+h+w, 30, 30); // left leg
				    g.setColor(Color.black);
				    g.fillOval(w+h+w/8+110+x, 80+y-h, 20+w, 20+h); // left eye
				    g.fillOval(w+h+h+160+x, 80+y-h, 20+w, 20+h); // right eye
				    g.drawRoundRect(107+x+w+h+w/2, 160+y+h, 50+w, 85+h+w, 30, 30); 
				    g.fillRect(107+x+w+h+w/2, 215+y+h+w, 50+w, 10+h); // right hand
				    g.setColor(Color.white);
				    g.fillOval(163+x+w+h+w, 82+y-h, 10+w/2, 10+h/2); //eye		 
				    g.fillOval(113+x+w+h+w/4, 82+y-h, 10+w/2, 10+h/2); //eye
				    g.setColor(Color.red); 
					g.fillRoundRect(120+x+w+h, 115+y, 45+w, 35+h, 20, 20); //mouth		
		  		break;
		  		case 7:
		  			g.setColor(Color.white);
				    g.fillArc(w+h+75+x, 55+y-h, 150+w+h, 125+h+h, 0, 180); // head circle
				    g.fillRect(w+h+75+x, 115+y, 150+w+h, 150+w+h); // body		 
				    g.fillRoundRect(w+h+75+x, 255+y+h, 150+w+h, 20+w+h, 20, 20); // cause bottom of body has round corners
				    g.fillRoundRect(40+x+w, 120+y, 30+w, 110+h+w, 30, 30); // right hand
				    g.fillRoundRect(230+x+w+h+w+h, 120+y, 30+w, 110+h+w, 30, 30); // left hand
				    g.fillRoundRect(95+x+w+h, 255+y+w+h, 30+w, 70+h+w, 30, 30); // right leg
				    g.fillRoundRect(175+x+w+h+w, 255+y+w+h, 30+w, 70+h+w, 30, 30); // left leg
				    g.fillOval(w+h+w/8+110+x, 80+y-h, 20+w, 20+h); // left eye
				    g.fillOval(w+h+h+170+x, 80+y-h, 20+w, 20+h); // right eye
				    g.fillOval(173+x+w+h+w, 82+y-h, 10+w/2, 10+h/2); //eye		 
				    g.fillOval(113+x+w+h+w/4, 82+y-h, 10+w/2, 10+h/2); //eye			    				  	
					g.fillRoundRect(105+x+w+h, 115+y, 90+w+h, 70+h+w, 20, 20); //mouth
					
		  			g.setColor(Color.MAGENTA);
				    g.fillArc(w+h+75+x, 55+y-h, 115+w+h, 125+h+h, 0, 180); // head circle
				    g.fillRect(w+h+75+x, 115+y, 115+w+h, 150+w+h); // body		 
				    g.fillRoundRect(w+h+75+x, 255+y+h, 115+w+h, 20+w+h, 20, 20); // cause bottom of body has round corners				  
				    g.fillRoundRect(105+x+w+h+w/2, 255+y+w+h, 50+w, 70+h+w, 30, 30); // left leg
				    g.setColor(Color.black);
				    g.fillOval(w+h+w/8+90+x, 80+y-h, 20+w, 20+h); // left eye
				    g.fillOval(w+h+h+140+x, 80+y-h, 20+w, 20+h); // right eye
				    g.drawRoundRect(107+x+w+h+w/2, 160+y+h, 50+w, 85+h+w, 30, 30); 
				    g.fillRect(107+x+w+h+w/2, 215+y+h+w, 50+w, 10+h); // right hand
				    g.setColor(Color.white);
				    g.fillOval(143+x+w+h+w, 82+y-h, 10+w/2, 10+h/2); //eye		 
				    g.fillOval(93+x+w+h+w/4, 82+y-h, 10+w/2, 10+h/2); //eye
				    g.setColor(Color.red); 
					g.fillRoundRect(100+x+w+h, 115+y, 45+w, 35+h, 20, 20); //mouth		
		  		break;
		  		case 8:
		  			g.setColor(Color.white); //band for hands
				   
				    g.fillRect(40+x+w, 195+y+h, 30+w, 10+h); // right hand
				    g.setColor(Color.white);
		  			g.fillRoundRect(40+x+w, 120+y, 30+w, 110+h+w, 30, 30); // right hand
				   
				 
				    g.fillRect(40+x+w, 195+y+h, 30+w, 10+h); // right hand
				    g.setColor(Color.magenta);
				    g.fillRoundRect(40+x+w, 60+y, 30+w, 110+h+w, 30, 30); // right hand
				  
				    g.setColor(Color.black);
				   
				    g.fillRect(40+x+w, 85+y+h, 30+w, 10+h); // right hand
				    
				   
				    break;
		  		
	  		}


	  			}
	  	public void draw1(Graphics g1)
	  	{
	  		
	  		g1.setColor(Color.yellow);
		    g1.fillArc(w+h+350+x, 55+y-h, 150+w+h, 125+h+h, 0, 180); // head circle
		    g1.fillRect(w+h+350+x, 115+y, 150+w+h, 150+w+h); // body		 
		    g1.fillRoundRect(w+h+350+x, 255+y+h, 150+w+h, 20+w+h, 20, 20); // cause bottom of body has round corners
		    g1.fillRoundRect(315+x+w, 120+y, 30+w, 110+h+w, 30, 30); // right hand
		    g1.fillRoundRect(505+x+w+h+w+h, 120+y, 30+w, 110+h+w, 30, 30); // left hand
		    g1.fillRoundRect(370+x+w+h, 255+y+w+h, 30+w, 70+h+w, 30, 30); // right leg
		    g1.fillRoundRect(450+x+w+h+w, 255+y+w+h, 30+w, 70+h+w, 30, 30); // left leg
		
		
		    g1.setColor(Color.black);
		    g1.fillOval(w+h+w/8+385+x, 80+y-h, 20+w, 20+h); // left eye
		    g1.fillOval(w+h+h+445+x, 80+y-h, 20+w, 20+h); // right eye
		    g1.drawRect(5, 0, 635, 395);
		    
		    
		    g1.setColor(Color.white);
		    g1.fillOval(448+x+w+h+w, 82+y-h, 10+w/2, 10+h/2); //eye		 
		    g1.fillOval(388+x+w+h+w/4, 82+y-h, 10+w/2, 10+h/2); //eye
		    
		   
			g1.setColor(Color.red); 
			g1.fillRoundRect(405+x+w+h, 115+y, 45+w+h, 35+h+w, 20, 20); //mouth
			
			
	        
		    g1.setColor(Color.black); //band for hands
		    g1.fillRect(505+x+w+h+w+h, 195+y+h, 30+w, 10+h); // left hand
		    g1.fillRect(315+x+w, 195+y+h, 30+w, 10+h); // right hand
		    
		    switch(action2)
		    {
		    case 1: 
		    	g1.setColor(Color.yellow);
			    g1.fillArc(w+h+350+x, 55+y-h, 150+w+h, 125+h+h, 0, 180); // head circle
			    g1.fillRect(w+h+350+x, 115+y, 150+w+h, 150+w+h); // body		 
			    g1.fillRoundRect(w+h+350+x, 255+y+h, 150+w+h, 20+w+h, 20, 20); // cause bottom of body has round corners
			    g1.fillRoundRect(315+x+w, 120+y, 30+w, 110+h+w, 30, 30); // right hand
			    g1.fillRoundRect(505+x+w+h+w+h, 120+y, 30+w, 110+h+w, 30, 30); // left hand
			    g1.fillRoundRect(370+x+w+h, 255+y+w+h, 30+w, 70+h+w, 30, 30); // right leg
			    g1.fillRoundRect(450+x+w+h+w, 255+y+w+h, 30+w, 70+h+w, 30, 30); // left leg
			
			
			    g1.setColor(Color.black);
			    g1.fillOval(w+h+w/8+385+x, 80+y-h, 20+w, 20+h); // left eye
			    g1.fillOval(w+h+h+445+x, 80+y-h, 20+w, 20+h); // right eye
			    g1.drawRect(5, 0, 635, 395);
			    
			    
			    g1.setColor(Color.white);
			    g1.fillOval(448+x+w+h+w, 82+y-h, 10+w/2, 10+h/2); //eye		 
			    g1.fillOval(388+x+w+h+w/4, 82+y-h, 10+w/2, 10+h/2); //eye
			    
			   
				g1.setColor(Color.red); 
				g1.fillRoundRect(405+x+w+h, 115+y, 45+w+h, 35+h+w, 20, 20); //mouth
				
				
		        
			    g1.setColor(Color.black); //band for hands
			    g1.fillRect(505+x+w+h+w+h, 195+y+h, 30+w, 10+h); // left hand
			    g1.fillRect(315+x+w, 195+y+h, 30+w, 10+h); // right hand
		    break;
		    case 2: g1.setColor(Color.yellow);
		    g1.fillArc(w+h+350+x, 55+y-h, 150+w+h, 125+h+h, 0, 180); // head circle
		    g1.fillRect(w+h+350+x, 115+y, 150+w+h, 150+w+h); // body		 
		    g1.fillRoundRect(w+h+350+x, 255+y+h, 150+w+h, 20+w+h, 20, 20); // cause bottom of body has round corners
		    g1.fillRoundRect(315+x+w, 120+y, 30+w, 110+h+w, 30, 30); // right hand
		    g1.fillRoundRect(505+x+w+h+w+h, 120+y, 30+w, 110+h+w, 30, 30); // left hand
		    g1.fillRoundRect(370+x+w+h, 255+y+w+h, 30+w, 70+h+w, 30, 30); // right leg
		    g1.fillRoundRect(450+x+w+h+w, 255+y+w+h, 30+w, 70+h+w, 30, 30); // left leg
		    break;
		    case 3: g1.setColor(Color.white);
		    g1.fillArc(w+h+350+x, 55+y-h, 150+w+h, 125+h+h, 0, 180); // head circle
		    g1.fillRect(w+h+350+x, 115+y, 150+w+h, 150+w+h); // body		 
		    g1.fillRoundRect(w+h+350+x, 255+y+h, 150+w+h, 20+w+h, 20, 20); // cause bottom of body has round corners
		    g1.fillRoundRect(315+x+w, 120+y, 30+w, 110+h+w, 30, 30); // right hand
		    g1.fillRoundRect(505+x+w+h+w+h, 120+y, 30+w, 110+h+w, 30, 30); // left hand
		    g1.fillRoundRect(370+x+w+h, 255+y+w+h, 30+w, 70+h+w, 30, 30); // right leg
		    g1.fillRoundRect(450+x+w+h+w, 255+y+w+h, 30+w, 70+h+w, 30, 30); // left leg
		    g1.fillOval(w+h+w/8+385+x, 80+y-h, 20+w, 20+h); // left eye
		    g1.fillOval(w+h+h+445+x, 80+y-h, 20+w, 20+h); // right eye
		    g1.fillOval(448+x+w+h+w, 82+y-h, 10+w/2, 10+h/2); //eye		 
		    g1.fillOval(388+x+w+h+w/4, 82+y-h, 10+w/2, 10+h/2); //eye			    				  	
			g1.fillRoundRect(380+x+w+h, 115+y, 90+w+h, 70+h+w, 20, 20); //mouth
			
  			g1.setColor(Color.yellow);
		    g1.fillArc(w+h+350+x, 55+y-h, 115+w+h, 125+h+h, 0, 180); // head circle
		    g1.fillRect(w+h+350+x, 115+y, 115+w+h, 150+w+h); // body		 
		    g1.fillRoundRect(w+h+350+x, 255+y+h, 115+w+h, 20+w+h, 20, 20); // cause bottom of body has round corners				  
		    g1.fillRoundRect(380+x+w+h+w/2, 255+y+w+h, 50+w, 70+h+w, 30, 30); // left leg
		    g1.setColor(Color.black);
		    g1.fillOval(w+h+w/8+385+x, 80+y-h, 20+w, 20+h); // left eye
		    g1.fillOval(w+h+h+435+x, 80+y-h, 20+w, 20+h); // right eye
		    g1.drawRoundRect(382+x+w+h+w/2, 160+y+h, 50+w, 85+h+w, 30, 30); 
		    g1.fillRect(382+x+w+h+w/2, 215+y+h+w, 50+w, 10+h); // right hand
		    g1.setColor(Color.white);
		    g1.fillOval(438+x+w+h+w, 82+y-h, 10+w/2, 10+h/2); //eye		 
		    g1.fillOval(388+x+w+h+w/4, 82+y-h, 10+w/2, 10+h/2); //eye
		    g1.setColor(Color.red); 
			g1.fillRoundRect(395+x+w+h, 115+y, 45+w, 35+h, 20, 20); //mouth		
		    break;
		    case 4:g1.setColor(Color.white);
		    g1.fillArc(w+h+350+x, 55+y-h, 150+w+h, 125+h+h, 0, 180); // head circle
		    g1.fillRect(w+h+350+x, 115+y, 150+w+h, 150+w+h); // body		 
		    g1.fillRoundRect(w+h+350+x, 255+y+h, 150+w+h, 20+w+h, 20, 20); // cause bottom of body has round corners
		    g1.fillRoundRect(315+x+w, 120+y, 30+w, 110+h+w, 30, 30); // right hand
		    g1.fillRoundRect(505+x+w+h+w+h, 120+y, 30+w, 110+h+w, 30, 30); // left hand
		    g1.fillRoundRect(370+x+w+h, 255+y+w+h, 30+w, 70+h+w, 30, 30); // right leg
		    g1.fillRoundRect(450+x+w+h+w, 255+y+w+h, 30+w, 70+h+w, 30, 30); // left leg
		    g1.fillOval(w+h+w/8+385+x, 80+y-h, 20+w, 20+h); // left eye
		    g1.fillOval(w+h+h+445+x, 80+y-h, 20+w, 20+h); // right eye
		    g1.fillOval(448+x+w+h+w, 82+y-h, 10+w/2, 10+h/2); //eye		 
		    g1.fillOval(448+x+w+h+w/4, 82+y-h, 10+w/2, 10+h/2); //eye			    				  	
			g1.fillRoundRect(380+x+w+h, 115+y, 90+w+h, 70+h+w, 20, 20); //mouth
			
  			g1.setColor(Color.yellow);
		    g1.fillArc(w+h+350+x, 55+y-h, 115+w+h, 125+h+h, 0, 180); // head circle
		    g1.fillRect(w+h+350+x, 115+y, 115+w+h, 150+w+h); // body		 
		    g1.fillRoundRect(w+h+350+x, 255+y+h, 115+w+h, 20+w+h, 20, 20); // cause bottom of body has round corners				  
		    g1.fillRoundRect(380+x+w+h+w/2, 255+y+w+h, 50+w, 70+h+w, 30, 30); // left leg
		    g1.setColor(Color.black);
		    g1.fillOval(w+h+w/8+365+x, 80+y-h, 20+w, 20+h); // left eye
		    g1.fillOval(w+h+h+415+x, 80+y-h, 20+w, 20+h); // right eye
		    g1.drawRoundRect(382+x+w+h+w/2, 160+y+h, 50+w, 85+h+w, 30, 30); 
		    g1.fillRect(382+x+w+h+w/2, 215+y+h+w, 50+w, 10+h); // right hand
		    g1.setColor(Color.white);
		    g1.fillOval(418+x+w+h+w, 82+y-h, 10+w/2, 10+h/2); //eye		 
		    g1.fillOval(368+x+w+h+w/4, 82+y-h, 10+w/2, 10+h/2); //eye
		    g1.setColor(Color.red); 
			g1.fillRoundRect(375+x+w+h, 115+y, 45+w, 35+h, 20, 20); //mouth	
		    break;
		    
		    case 5:
		    	g1.setColor(Color.white);
		    	g1.fillRoundRect(315+x+w, 120+y, 30+w, 110+h+w, 30, 30); // right hand
				g1.fillRoundRect(505+x+w+h+w+h, 120+y, 30+w, 110+h+w, 30, 30); // left hand
		    	g1.setColor(Color.yellow);
			    g1.fillArc(w+h+350+x, 55+y-h, 150+w+h, 125+h+h, 0, 180); // head circle
			    g1.fillRect(w+h+350+x, 115+y, 150+w+h, 150+w+h); // body		 
			    g1.fillRoundRect(w+h+350+x, 255+y+h, 150+w+h, 20+w+h, 20, 20); // cause bottom of body has round corners
			    g1.fillRoundRect(315+x+w, 50+y, 30+w, 110+h+w, 30, 30); // right hand
			    g1.fillRoundRect(505+x+w+h+w+h, 50+y, 30+w, 110+h+w, 30, 30); // left hand
			    g1.fillRoundRect(370+x+w+h, 255+y+w+h, 30+w, 70+h+w, 30, 30); // right leg
			    g1.fillRoundRect(450+x+w+h+w, 255+y+w+h, 30+w, 70+h+w, 30, 30); // left leg
			
			
			    g1.setColor(Color.black);
			    g1.fillOval(w+h+w/8+385+x, 80+y-h, 20+w, 20+h); // left eye
			    g1.fillOval(w+h+h+445+x, 80+y-h, 20+w, 20+h); // right eye
			    g1.drawRect(5, 0, 635, 395);
			    
			    
			    g1.setColor(Color.white);
			    g1.fillOval(448+x+w+h+w, 82+y-h, 10+w/2, 10+h/2); //eye		 
			    g1.fillOval(388+x+w+h+w/4, 82+y-h, 10+w/2, 10+h/2); //eye
			    
			   
				g1.setColor(Color.red); 
				g1.fillRoundRect(405+x+w+h, 115+y, 45+w+h, 35+h+w, 20, 20); //mouth
				
				
		        
			    g1.setColor(Color.black); //band for hands
			    g1.fillRect(505+x+w+h+w+h, 125+y+h, 30+w, 10+h); // left hand
			    g1.fillRect(315+x+w, 125+y+h, 30+w, 10+h); // right hand
		    	break;
		    }

	  	}
	  	
	 public void  reColor(int cc)
	 {
		 c=cc;
	 }	 
	 
	 public void mood (int m)
	{
		mood=m;
	}
		
	 public void action (int a)
	{
		action=a;
	}
		
	 public void action2 (int a1)
		{
			action2=a1;
		}
}

	  	Robby R;
	  	Robby R1;
	  public void init() 
	  {
	
		this.addMouseListener(this) ;
		this.addMouseMotionListener(this);
	
		
		
	resize(820,500);
	int x=0,y=0,w=0,h=0;
	
	R = new Robby(x+30,y,w,h);
	R1 = new Robby(x+60,y,w,h);
	Label strControls=new Label("Select controls: ");
	Label strResize=new Label("Resize your character:");
	Label strArmBandClrs=new Label("Modify armbands:");
	Label strEmotions=new Label("Choose emotion:");
	strControls.setBounds(660,0,180,15);
	Font font = new Font("Bahnschrift", Font.BOLD, 15);
    strControls.setFont(font);
    strResize.setBounds(656,120,180,15);
    strResize.setFont(font);
    strArmBandClrs.setBounds(670, 185, 180, 15);
    strArmBandClrs.setFont(font);
    strEmotions.setBounds(680,290,180,15);
    strEmotions.setFont(font);
    
    
    
	    white = new Button("Cyan");
	    red = new Button("Yellow");
	    green = new Button ("Green");
	    cyan = new Button ("Default");
	    move_right = new Button ("Move right");
	    move_left = new Button ("Move left");
	    move_up = new Button ("Move up");
	    move_down = new Button ("Move down");
	    resize_plus= new Button ("Resize +");
	    resize_minus = new Button ("Resize -");
	    shock= new Button ("Shocked");
	    handsup = new Button ("Hands up");
	    regular = new Button ("Regular");
	   
	    vertSB = new Scrollbar(Scrollbar.VERTICAL,0,1,-55,55);
		horzSB = new Scrollbar(Scrollbar.HORIZONTAL,0,1,100,325);
		
		button_movement = new Checkbox("With buttons", null,false);
		scroll_bar_movement = new Checkbox("With scrollbar", null,false);
		mouse_movement = new Checkbox("With mouse", null,false);
	
	    
	setLayout(null);
	white.setBounds(670,210,60,30);
	red.setBounds(742,210,60,30);
	green.setBounds(670, 245, 60, 30);
	cyan.setBounds(742, 245, 60, 30);
	move_right.setBounds(400, 465, 70, 30);
	move_left.setBounds(250,465,70,30);
	move_up.setBounds(325, 425, 70, 30);
	move_down.setBounds(325,465,70,30);
	resize_plus.setBounds(665, 140, 70, 30);
	resize_minus.setBounds(740, 140, 70, 30);
	shock.setBounds(700,355,70,30);
	handsup.setBounds(740,320,70,30);
	regular.setBounds(665,320,70,30);
	
	vertSB.setBounds(615,5,20,380);
	horzSB.setBounds(0,370,610,20);
	
	button_movement.setBounds(665,20,100,20);
	scroll_bar_movement.setBounds(665,45,100,20);
	mouse_movement.setBounds(665,70,100,20);
	
	
	
	    add(strControls);
	    add(strResize);
	    add(strArmBandClrs);
	    add(strEmotions);
	    add(white);
	    add(red);
	    add(green);
	    add(cyan);
	    add(move_right);
	    add(move_left);
	    add(move_up);
	    add(move_down);
	    add(resize_plus);
	    add(resize_minus);
	    add(shock);
	    add(handsup);
	    add(regular);
	    
	    add(vertSB);
	    add(horzSB);
	    
	    add(button_movement);
	    add(scroll_bar_movement);
	    add(mouse_movement);
	    
	    

	    white.addActionListener(this);
	    red.addActionListener(this);
	    green.addActionListener(this);
	    cyan.addActionListener(this);
	    move_right.addActionListener(this);
	    move_left.addActionListener(this);
	    move_up.addActionListener(this);
	    move_down.addActionListener(this);
	    resize_plus.addActionListener(this);
	    resize_minus.addActionListener(this);
	    shock.addActionListener(this);
	    handsup.addActionListener(this);
	    regular.addActionListener(this);
	    
	    vertSB.addAdjustmentListener(this);
	    horzSB.addAdjustmentListener(this);
	    addMouseMotionListener(this);
	    
	   button_movement.addItemListener(this);
	   scroll_bar_movement.addItemListener(this);
	   mouse_movement.addItemListener(this);
	 
	   

	
	   this.addKeyListener(this);
	    this.setFocusable(true);
	  }

	  
	
		
		public void adjustmentValueChanged(AdjustmentEvent ae)
		{
			
			if(scroll_bar_movement.getState()==true)
			{
			
				 repaint();
			int nVertSB=0;
			int nHorzSB=0;
			Scrollbar scrl;
			scrl=(Scrollbar)ae.getSource();
			int nValue=ae.getValue();
			if(scrl.equals(vertSB))
			{
				 nVertSB=nValue;
				 R=new Robby(horzSB.getValue()-50,nVertSB,0,0);
			}
			else  
			{
				 nHorzSB=nValue;
				 R=new Robby(nHorzSB-50,vertSB.getValue(),0,0);
			}
			}
		    repaint();
		}
		
		

	  public void actionPerformed(ActionEvent ae ) {
		  
			if(button_movement.getState()==true)
			{
	    String str = ae.getActionCommand();
	    if(str.equals("Cyan")) 
	    {R.reColor(2);} 
	    else if (str.equals("Yellow")) 
	    {R.reColor(1);}   
	    else if(str.equals("Green")) 
	    {R.reColor(3);}   
	    else if (str.equals("Default"))
	    {R.reColor(4);}
	    else if (str.equals("Move right"))
	    {
	    	if(R.x>=-20 && R.x<=250 && R.y>=-890&& R.y<=55)
	    	{
	    	R.action(6);R.x+=5;
	    	}
	    	else
	    	{
	    		R.action(7);R.x-=5;
	    	}
	    }
	    else if (str.equals("Move left"))
	    {
	    	if(R.x>=-20 && R.x<=250 && R.y>=-890&& R.y<=55)
	    	{
	    	R.action(7);R.x-=5;
	    	}
	    	else
	    	{
	    		R.action(6);R.x+=5;
	    	}
	    }
	    else if (str.equals("Move down"))
	    {
	    	 if(R.x>=-20 && R.x<=250 && R.y>=-890&& R.y<=55)	 
	    	 {
	    		 R.action(2);R.y+=5;R.h=R.w+=1;R.x-=3;
	    	 }
	    	 else
	    	 {
	    		 R.action(1);R.y-=5;R.h=R.w-=1;R.x+=3;
	    	 }
	    }
	    else if (str.equals("Move up"))
	    {
	    	if(R.x>=-20 && R.x<=250 && R.y>=-890&& R.y<=55)	 
	    	 {
	    	R.action(1);R.y-=5;R.h=R.w-=1;R.x+=3;
	    	 }
	    	else
	    	{
	    		R.action(2);R.y+=5;R.h=R.w+=1;R.x-=3;
	    	}
	    }
	    else if (str.equals("Resize +"))
	    {R1.h=R1.w+=1;}
	    else if (str.equals("Resize -"))
	    {R.h=R.w-=1;}
	    else if (str.equals("Shocked"))
	    {R.action(3);}
	    else if (str.equals("Hands up"))
	    {  R.action(4); }
	    else if (str.equals("Regular"))
	    {R.action(5);}
	    
			}
	    
	    repaint();
	  }

	  public void paint(Graphics g) {
	     R.draw(g);
	     R1.draw1(g);
	  }
	

	@Override
	public void mouseDragged(MouseEvent me) {
	
		// TODO Auto-generated method stub
		 int x = me.getX();
		    int y = me.getY();
		    if(mouse_movement.getState()==true)
		    {
		    vertSB.setValue(y);
		    horzSB.setValue(x);
		    if(x>=0 && x<=250 && y>=-100&& y<=55)
		    R=new Robby(x,y,5,5);
		    }
		    repaint();
		     
		    	
	}
	

	
	public void keyPressed(KeyEvent k) {
		// TODO Auto-generated method stub
		
		
				int key = k.getKeyCode(); 
				  switch(key) {
				    case KeyEvent.VK_LEFT:
				    	if(R.x>=-20 && R.x<=390 && R.y>=-890&& R.y<=55)
				    	{
				    	R.action(7);R.x-=5;
				    	}
				    	else
				    	{
				    		R.action(6);R.x+=5;
				    	}
				      break;
				    case KeyEvent.VK_RIGHT:
				    	if(R.x>=-20 && R.x<390 && R.y>=-890&& R.y<=55)
				    	{
				    	R.action(6);R.x+=5;
				    	}
				    	else
				    	{
				    		R.action(7);R.x-=5;
				    	}
				      break;
				    case KeyEvent.VK_UP:
				    	if(R.x>=-20 && R.x<=390 && R.y>=-1000&& R.y<=55)	 
				    	 {
				    	R.action(1);R.y-=5;R.h=R.w-=1;R.x+=3;
				    	 }
				    	else
				    	{
				    		R.action(2);R.y+=5;R.h=R.w+=1;R.x-=3;
				    	}
				      break;
				    case KeyEvent.VK_DOWN:
				    	if(R.x>=-20 && R.x<=390 && R.y>=-1000&& R.y<=55)	 
				    	 {
				    		 R.action(2);R.y+=5;R.h=R.w+=1;R.x-=3;
				    	 }
				    	 else
				    	 {
				    		 R.action(1);R.y-=5;R.h=R.w-=1;R.x+=3;
				    	 }
				      break;
				    case KeyEvent.VK_S:
				    	if(R1.x>=-20 && R1.x<=390 && R1.y>=-1000&& R1.y<=55)	 
				    	 {
				    		 R1.action2(1);R1.y+=5;R1.h=R1.w+=1;R1.x-=3;
				    	 }
				    	 else
				    	 {
				    		 R1.action2(2);R1.y-=5;R1.h=R1.w-=1;R1.x+=3;
				    	 }
				    	break;
				    case KeyEvent.VK_W:
				    	if(R1.x>=-20 && R1.x<=390 && R1.y>=-1000&& R1.y<=55)	 
				    	 {
				    		R1.action2(2);R1.y-=5;R1.h=R1.w-=1;R1.x+=3;
				    	 }
				    	 else
				    	 {
				    		 R1.action2(1);R1.y+=5;R1.h=R1.w+=1;R1.x-=3;
				    	 }
				      break;
				    case KeyEvent.VK_D:
				    	if(R1.x>=-20 && R1.x<=390 && R1.y>=-1000&& R1.y<=55)	 
				    	 {
				    		R1.action2(3);R1.x+=5;
				    	 }
				    	 else
				    	 {
				    		 R1.action(4);R1.x-=5;
				    	 }			    	
				      break;
				    case KeyEvent.VK_A:
				    	if(R1.x>=-20 && R1.x<=490 && R1.y>=-1000&& R1.y<=55)	 
				    	 {
				    		R1.action2(4);R1.x-=5;
				    	 }
				    	 else
				    	 {
				    		 R1.action2(3);R1.x+=5; 
				    	 }
				    	break;
				    case KeyEvent.VK_1:
				    R.action(3);
				    break;
				    case KeyEvent.VK_2:
					    R.action(5);
					    break;
				    case KeyEvent.VK_3:
					    R.action(8);
					    break;
				    case KeyEvent.VK_4:
					    R.action(4);
					    break;
	
					    
					   
				  }
				  if(R1.x-R.x <=1)
				  {
				    	R.action(3);
				    	R1.action2(5);
				  }
		 
		 repaint();
	}

	@Override
	public void mouseMoved(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void itemStateChanged(ItemEvent arg0) {
		// TODO Auto-generated method stub
		
	}


	@Override
	public void mouseClicked(MouseEvent e) {
		// TODO Auto-generated method stub

	}


	@Override
	public void mouseEntered(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}


	@Override
	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}




	


	@Override
	public void mouseReleased(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}




	@Override
	public void mousePressed(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
		   
		if(arg0.getButton() == MouseEvent.BUTTON3)
		{
			R.action(8);
			
		}
		else if(arg0.getButton() == MouseEvent.BUTTON1)
		{
			
			R.action(5);
			
		}
		else if(arg0.getButton() == MouseEvent.BUTTON2)
		{
			
			R.action(3);
			
		}
	}




	




	@Override
	public void keyReleased(KeyEvent arg0) {
		// TODO Auto-generated method stub
		
	}




	@Override
	public void keyTyped(KeyEvent arg0) {
		// TODO Auto-generated method stub
		
	}




	
	



	
	}
	