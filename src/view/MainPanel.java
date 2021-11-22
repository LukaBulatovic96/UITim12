package view;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Observable;

import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JTextArea;

import app.AppCore;
import cetvrti.CetvrtiPanel;
import deseti.DesetiPanel;
import deveti.DevetiPanel;
import drugi.DrugiPanel;
import dvanaesti.DvanaestiPanel;
import jedanaesti.JedanaestiPanel;
import osmi.OsmiPanel;
import peti.PetiPanel;
import prvi.PrviPanel;
import sedmi.SedmiPanel;
import sesti.SestiPanel;
import trinaesti.TrinaestiPanel;

public class MainPanel extends JPanel {
	

	private JButton addPanel1;
	private JButton addPanel2;
	private JButton addPanel4;
	private JButton addPanel5;
	private JButton addPanel6;
	private JButton addPanel7;
	private JButton addPanel8;
	private JButton addPanel9;
	private JButton addPanel10;
	private JButton addPanel11;
	private JButton addPanel12;
	private JButton addPanel13;

	
	private PrviPanel prviPanel;
	private DrugiPanel drugiPanel;
	private CetvrtiPanel cetvrtiPanel;
	private PetiPanel petiPanel;
	private SestiPanel sestiPanel;
	private SedmiPanel sedmiPanel;
	private OsmiPanel osmiPanel;
	private DevetiPanel devetiPanel;
	private DesetiPanel desetiPanel;
	private JedanaestiPanel jedanaestiPanel;
	private DvanaestiPanel dvanaestiPanel;
	private TrinaestiPanel trinaestiPanel;
	

	public MainPanel() {
		
		initPanel();
	}
	
	private void initPanel() {
		
		 prviPanel = new PrviPanel();
		 drugiPanel = new DrugiPanel();
		 cetvrtiPanel = new CetvrtiPanel();
		 petiPanel = new PetiPanel();
		 sestiPanel = new SestiPanel();
		 sedmiPanel = new  SedmiPanel();
		 osmiPanel = new OsmiPanel();
		 devetiPanel = new DevetiPanel();
		 desetiPanel = new DesetiPanel();
		 jedanaestiPanel = new JedanaestiPanel();
		 dvanaestiPanel = new DvanaestiPanel();
		 trinaestiPanel = new TrinaestiPanel();
				 
		 
		 
		 addPanel1= new JButton("1");
		 addPanel2 = new JButton("2");
		 addPanel4 = new JButton("4");
		 addPanel5 = new JButton("5");
		 addPanel6 = new JButton("6");
		 addPanel7 = new JButton("7");
		 addPanel8 = new JButton("8");
		 addPanel9 = new JButton("9");
		 addPanel10 = new JButton("10");
		 addPanel11 = new JButton("11");
		 addPanel12 = new JButton("12");
		 addPanel13 = new JButton("13");
		 
		 
		 addPanel1.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				AppCore.getInstance().getMainFrame().getMainPanel().removeAll();
				addButtons();
				AppCore.getInstance().getMainFrame().getMainPanel().add(prviPanel);
				AppCore.getInstance().getMainFrame().getMainPanel().repaint();
				AppCore.getInstance().getMainFrame().getMainPanel().revalidate();
			}
		});
		 
		 addPanel2.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				AppCore.getInstance().getMainFrame().getMainPanel().removeAll();
				addButtons();
				AppCore.getInstance().getMainFrame().getMainPanel().add(drugiPanel);
				AppCore.getInstance().getMainFrame().getMainPanel().repaint();
				AppCore.getInstance().getMainFrame().getMainPanel().revalidate();
				
			}
		});
		 
		 addPanel4.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				AppCore.getInstance().getMainFrame().getMainPanel().removeAll();
				addButtons();
				AppCore.getInstance().getMainFrame().getMainPanel().add(cetvrtiPanel);
				AppCore.getInstance().getMainFrame().getMainPanel().repaint();
				AppCore.getInstance().getMainFrame().getMainPanel().revalidate();
				
			}
		});
		 
		 addPanel5.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				AppCore.getInstance().getMainFrame().getMainPanel().removeAll();
				addButtons();
				AppCore.getInstance().getMainFrame().getMainPanel().add(petiPanel);
				AppCore.getInstance().getMainFrame().getMainPanel().repaint();
				AppCore.getInstance().getMainFrame().getMainPanel().revalidate();
				
			}
		});
		 
		 addPanel6.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				AppCore.getInstance().getMainFrame().getMainPanel().removeAll();
				addButtons();
				AppCore.getInstance().getMainFrame().getMainPanel().add(sestiPanel);
				AppCore.getInstance().getMainFrame().getMainPanel().repaint();
				AppCore.getInstance().getMainFrame().getMainPanel().revalidate();
				
			}
		});
		 
		 addPanel7.addActionListener(new ActionListener() {
				
				@Override
				public void actionPerformed(ActionEvent e) {
					AppCore.getInstance().getMainFrame().getMainPanel().removeAll();
					addButtons();
					AppCore.getInstance().getMainFrame().getMainPanel().add(sedmiPanel);
					AppCore.getInstance().getMainFrame().getMainPanel().repaint();
					AppCore.getInstance().getMainFrame().getMainPanel().revalidate();
					
				}
			});
		 
		 addPanel8.addActionListener(new ActionListener() {
				
				@Override
				public void actionPerformed(ActionEvent e) {
					AppCore.getInstance().getMainFrame().getMainPanel().removeAll();
					addButtons();
					AppCore.getInstance().getMainFrame().getMainPanel().add(osmiPanel);
					AppCore.getInstance().getMainFrame().getMainPanel().repaint();
					AppCore.getInstance().getMainFrame().getMainPanel().revalidate();
					
				}
			});
		 
		 addPanel9.addActionListener(new ActionListener() {
				
				@Override
				public void actionPerformed(ActionEvent e) {
					AppCore.getInstance().getMainFrame().getMainPanel().removeAll();
					addButtons();
					AppCore.getInstance().getMainFrame().getMainPanel().add(devetiPanel);
					AppCore.getInstance().getMainFrame().getMainPanel().repaint();
					AppCore.getInstance().getMainFrame().getMainPanel().revalidate();
					
				}
			});
		 
		 addPanel10.addActionListener(new ActionListener() {
				
				@Override
				public void actionPerformed(ActionEvent e) {
					AppCore.getInstance().getMainFrame().getMainPanel().removeAll();
					addButtons();
					AppCore.getInstance().getMainFrame().getMainPanel().add(desetiPanel);
					AppCore.getInstance().getMainFrame().getMainPanel().repaint();
					AppCore.getInstance().getMainFrame().getMainPanel().revalidate();
					
				}
			});
		 
		 addPanel11.addActionListener(new ActionListener() {
				
				@Override
				public void actionPerformed(ActionEvent e) {
					AppCore.getInstance().getMainFrame().getMainPanel().removeAll();
					addButtons();
					AppCore.getInstance().getMainFrame().getMainPanel().add(jedanaestiPanel);
					AppCore.getInstance().getMainFrame().getMainPanel().repaint();
					AppCore.getInstance().getMainFrame().getMainPanel().revalidate();
					
				}
			});
		 
		 addPanel12.addActionListener(new ActionListener() {
				
				@Override
				public void actionPerformed(ActionEvent e) {
					AppCore.getInstance().getMainFrame().getMainPanel().removeAll();
					addButtons();
					AppCore.getInstance().getMainFrame().getMainPanel().add(dvanaestiPanel);
					AppCore.getInstance().getMainFrame().getMainPanel().repaint();
					AppCore.getInstance().getMainFrame().getMainPanel().revalidate();
					
				}
			});
		 
		 addPanel13.addActionListener(new ActionListener() {
				
				@Override
				public void actionPerformed(ActionEvent e) {
					AppCore.getInstance().getMainFrame().getMainPanel().removeAll();
					addButtons();
					AppCore.getInstance().getMainFrame().getMainPanel().add(trinaestiPanel);
					AppCore.getInstance().getMainFrame().getMainPanel().repaint();
					AppCore.getInstance().getMainFrame().getMainPanel().revalidate();
					
				}
			});
		 
		 
	
		 
		 addButtons();
		 
		 //this.setLayout( new BoxLayout(this, BoxLayout.Y_AXIS));
		
	}
	
	private void addButtons() {
		this.add(addPanel1);
		this.add(addPanel2);
		this.add(addPanel4);
		this.add(addPanel5);
		this.add(addPanel6);
		this.add(addPanel7);
		this.add(addPanel8);
		this.add(addPanel9);
		this.add(addPanel10);
		this.add(addPanel11);
		this.add(addPanel12);
		this.add(addPanel13);
		
	}

	
	
	

}
