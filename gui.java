import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.applet.*;

public class gui extends Applet implements ActionListener {
	Label zahl = new Label("Zahl");
	Label radius2 = new Label("Radius");
	Label radius = new Label("Radius in cm");
	Label umfang = new Label("Umfang");
	Label flaeche = new Label("Fläche");
	Button berechnen = new Button("berechnen");
	TextField radiuszahl = new TextField();
	
	public void init() {
		setSize(5000, 5000);
		
		add(radius);
		add(radiuszahl);
		add(berechnen);
		
		add(radius2);
		add(umfang);
		add(flaeche);
		
		setLayout(new GridLayout(0, 3));
		setBackground(Color.lightGray);
		
		berechnen.addActionListener(this);
	}

	public void actionPerformed(ActionEvent e) {
		if(e.getSource() == berechnen){
			radius2.setText("Radius: " + radiuszahl.getText());
			umfang.setText("Umfang: " + 2*Math.PI*Integer.parseInt(radiuszahl.getText()) + " cm");
			flaeche.setText("Fläche: " + Math.PI*Integer.parseInt(radiuszahl.getText()) + " cm²" );
		}

		
	}
	

}
