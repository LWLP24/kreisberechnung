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
	Button berechnen = new Button("Berechnen");
	TextField radiuszahl = new TextField(50);
	
	Label Infos = new Label("                            ");
	Label mittelpunkt = new Label(" ");
	
	int x = 250;
	int y = 250;
	
	public void init() {
		
		setSize(500, 500);
		
		add(radius);
		add(radiuszahl);
		add(berechnen);
		
		add(radius2);
		add(umfang);
		add(flaeche);
		

		
		add(Infos);
		
		add(mittelpunkt);
		
		//setLayout(new GridLayout(0, 3));
		setBackground(Color.lightGray);
		radius.setBackground(Color.WHITE);
		radiuszahl.setBackground(Color.WHITE);
		berechnen.setBackground(Color.WHITE);
		radius2.setBackground(Color.WHITE);
		umfang.setBackground(Color.WHITE);
		flaeche.setBackground(Color.WHITE);
		Infos.setBackground(Color.WHITE);
		
		berechnen.addActionListener(this);
	}

	public void actionPerformed(ActionEvent e) {
		if(e.getSource() == berechnen){
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
	
	}
	
	public void paint(Graphics p) {
		p.drawOval(x, y, Integer.parseInt(radiuszahl.getText()), Integer.parseInt(radiuszahl.getText()));
	}
}
