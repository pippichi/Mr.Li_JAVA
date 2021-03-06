import java.awt.*;
import javax.swing.*;

class MessagePanel extends JPanel{
		private String message;
		private boolean centered;
		private int xCoordinate=20;
		private int yCoordinate=60;
		private int interval=10;
		
		public MessagePanel(){}
		public MessagePanel(String message){
		this.message=message;
		}
		public String getMessage(){
			return message;
			}
		public void setMessage(String message){
			this.message=message;
			repaint();
			}
			
		public int getXCoordinate(){
			return xCoordinate;
			}
			
		public int getYCoordinate(){
			return yCoordinate;
			}
			
		public void setXCoordinate(int x){
			xCoordinate=x;
			repaint();
			}
			
		public void setYCoordinate(int y){
			yCoordinate=y;
			repaint();
			}
		public boolean isCentered(){
			return centered;
			}
			
		public void setCentered(boolean centered){
			this.centered=centered;
			repaint();
			}
			
		public int getInterval(){
			return interval;
			}
		public void setInterval(int interval){
			this.interval=interval;
			repaint();
			}
			
	public void paintComponent(Graphics g){
		super.paintComponent(g);
		FontMetrics fm=g.getFontMetrics();
		int stringWidth=fm.stringWidth(message);
		int stringAscent=fm.getAscent();
		if(centered){
		  xCoordinate=getWidth()/2-stringWidth/2;
		  yCoordinate=getHeight()/2+stringAscent/2;
		  g.drawString(message,xCoordinate,yCoordinate);
	  }
	  else{
	  	g.drawString(message,xCoordinate,yCoordinate);
	  	}
		g.fill3DRect(getWidth()/2,getWidth()/2,getHeight()/2,getHeight()/2,true);
		}
		public void moveLeft(){
			xCoordinate-=interval;
			repaint();
			}
		public void moveRight(){
			xCoordinate+=interval;
			repaint();
			}
	  public void moveUp(){
			yCoordinate-=interval;
			repaint();
			}
		public void moveDown(){
			yCoordinate+=interval;
			repaint();
			}
		public Dimension getPreferredSize(){
			return new Dimension(200,30);
			}
	}