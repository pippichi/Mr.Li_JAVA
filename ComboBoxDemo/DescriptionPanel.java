import javax.swing.*;
import java.awt.*;

public class DescriptionPanel extends JPanel{
	private JLabel jlblImageTitle = new JLabel();
	
	private JTextArea jtaDescription = new JTextArea();
	
	public DescriptionPanel(){
		//center the icon and text and place the text under the icon
		jlblImageTitle.setHorizontalAlignment(JLabel.CENTER);
		jlblImageTitle.setHorizontalTextPosition(JLabel.CENTER);
		jlblImageTitle.setVerticalTextPosition(JLabel.BOTTOM);
		
		jlblImageTitle.setFont(new Font("SansSerif",Font.BOLD,16));
		jtaDescription.setFont(new Font("Serif",Font.PLAIN,14));
		
		//set lineWrap and wrapStyleWord true for the text area
		jtaDescription.setLineWrap(true);
		jtaDescription.setWrapStyleWord(true);
		jtaDescription.setEditable(false);
		
		//Create a scroll pane to hold the text area
		JScrollPane scrollPane = new JScrollPane(jtaDescription);
		
		setLayout(new BorderLayout(5,5));
		add(scrollPane,BorderLayout.CENTER);
		add(jlblImageTitle,BorderLayout.WEST);
	}	
	
	public void setTitle(String title){
		jlblImageTitle.setText(title);	
	}
	public void setImageIcon(ImageIcon icon){
		jlblImageTitle.setIcon(icon);	
	}
	public void setDescription(String text){
		jtaDescription.setText(text);	
	}
	
}