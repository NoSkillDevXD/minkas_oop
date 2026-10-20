package oop;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

import javax.swing.JOptionPane;

public class DarbsArFailu {
	static void saglabat(Minka runcis, String failaNosaukums) {
		try {
			FileWriter fw = new FileWriter(failaNosaukums, true);
			PrintWriter pw = new PrintWriter(fw);
			pw.println(runcis.nolasitAtributus());
			pw.println("+".repeat(10));
			pw.close();
			JOptionPane.showMessageDialog(null,
					"Ieraksts saglabāts " + failaNosaukums);
			
		} catch(IOException e) {
			JOptionPane.showMessageDialog(null,
			"Radās kļūda ierakstot failā!", "Kļūda",
			JOptionPane.ERROR_MESSAGE);
		}
	}
}
