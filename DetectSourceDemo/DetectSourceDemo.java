import java.awt.event.*;
import javax.swing.*;

public class DetectSourceDemo extends JFrame{
	private JButton jbtNew=new JButton("New");
	private JButton jbtSave=new JButton("Save");
	private JButton jbtPrint=new JButton("Print");
	private JButton jbtOpen=new JButton("Open");
	
	public DetectSourceDemo(){
		JPanel panel=new JPanel();
		panel.add(jbtNew);
		panel.add(jbtOpen);
		panel.add(jbtPrint);
		panel.add(jbtSave);
		add(panel);
		
		ButtonListener listener=new ButtonListener();
		
		jbtNew.addActionListener(listener);
		jbtOpen.addActionListener(listener);
		jbtSave.addActionListener(listener);
		jbtPrint.addActionListener(listener);
		}
		
		class ButtonListener implements ActionListener{
			public void actionPerformed(ActionEvent e){
				if(e.getSource()==jbtNew){
					System.out.println("Process New");
					}
				else if(e.getSource()==jbtOpen){
					System.out.println("Process Open");
					}
				else if(e.getSource()==jbtPrint){
					System.out.println("Process Print");
					}
				else if(e.getSource()==jbtSave){
					System.out.println("Process Save");
					}
				}
			}
			
		public static void main(String[] args){
			JFrame frame=new DetectSourceDemo();
			frame.setTitle("DetectSourceDemo");
			frame.setLocationRelativeTo(null);
			frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			frame.pack();
			frame.setVisible(true);
			}
	}