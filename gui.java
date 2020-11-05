import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.applet.*;

public class gui extends Applet implements ActionListener {
	Label zahl = new Label("Zahl                          ");
	Label radius2 = new Label("Radius                          ");
	Label radius = new Label("Radius in cm                          ");
	Label umfang = new Label("Umfang                          ");
	Label flaeche = new Label("Fläche                          ");
	Button kreis = new Button("Kreis                  ");
	TextField radiuszahl = new TextField(50);
	Button wuerfel = new Button("Quadrat");
	
	Label Infos = new Label("                            ");
	Label mittelpunkt = new Label(" ");
	
	boolean bolli;
	
	int x = 250;
	int y = 250;
	
	public void init() {
		
		
		setSize(500, 500);
		
		add(radius);
		add(radiuszahl);
		add(kreis);
		add(wuerfel);
		
		add(radius2);
		add(umfang);
		add(flaeche);
		

		
		add(Infos);
		
		add(mittelpunkt);
		
		//setLayout(new GridLayout(0, 3));
		setBackground(Color.lightGray);
		radius.setBackground(Color.WHITE);
		radiuszahl.setBackground(Color.WHITE);
		kreis.setBackground(Color.WHITE);
		radius2.setBackground(Color.WHITE);
		umfang.setBackground(Color.WHITE);
		flaeche.setBackground(Color.WHITE);
		Infos.setBackground(Color.WHITE);
		
		kreis.addActionListener(this);
		wuerfel.addActionListener(this);
	}

	public void actionPerformed(ActionEvent e) {
		if(e.getSource() == kreis){
			bolli = false;
		if(Integer.parseInt(radiuszahl.getText()) >= 0){
			radius2.setText("Radius: " + radiuszahl.getText());
			umfang.setText("Umfang: " + 2*Math.PI*Integer.parseInt(radiuszahl.getText()) + " cm");
			flaeche.setText("Fläche: " + Math.PI*Integer.parseInt(radiuszahl.getText())*Integer.parseInt(radiuszahl.getText()) + " cm²");
			Infos.setText(" ");
			mittelpunkt.setText("Mittelpunkt: " + (x - Integer.parseInt(radiuszahl.getText())));
			repaint();
			
		}else {
			add(Infos);
			Infos.setText("Das geht nicht!                        ");
			radiuszahl.setText("Das geht nicht! ");
			radius2.setText("Radius: ");
			umfang.setText("Umfang: ");
			flaeche.setText("Fläche: ");
		}
		}
		
	if(e.getSource() == wuerfel) {
		bolli = true;
	if(Integer.parseInt(radiuszahl.getText()) >= 0) {
		umfang.setText("Umfang: " + (4*Integer.parseInt(radiuszahl.getText()) + "cm"));
		flaeche.setText("Fläche: " + (Integer.parseInt(radiuszahl.getText())*Integer.parseInt(radiuszahl.getText()) + "cm²"));
		repaint();
	}else {
		add(Infos);
		Infos.setText("Das geht nicht!                        ");
		radiuszahl.setText("Das geht nicht! ");
		radius2.setText("Radius: ");
		umfang.setText("Umfang: ");
		flaeche.setText("Fläche: ");
	}
	}
	}
	
	public void paint(Graphics p) {
		
		if(bolli == false) {
		p.drawOval(x, y, Integer.parseInt(radiuszahl.getText()), Integer.parseInt(radiuszahl.getText()));
		}
		if(bolli == true) {
		p.drawRect(x, y, Integer.parseInt(radiuszahl.getText()), (Integer.parseInt(radiuszahl.getText())));
		}
	}
}
