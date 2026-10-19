package oop;

import javax.swing.JOptionPane;

public class MinkuTante {

	public static void main(String[] args) {
		Minka runcis = new Minka("Muris", "Rūdis", "Oranžs", "Oļegs",
				2017, true, "loto");
		
		JOptionPane.showMessageDialog(null, 
				runcis.nolasitAtributus());
		runcis.medit();
	}

}
