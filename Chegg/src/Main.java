/*
 * Corey Hodges
 * Project 2
 * 12 June 2021
 * Main
 *
 */

import javax.swing.*;
import java.io.*;
import java.util.*;

public class Main {

	private static List<Polynomial> polyList = new ArrayList<>();

	public static void main(String[] args) {
		processPolyList();
	}

	public static ArrayList<String> fromFile() {
		//Create ArrayList and JFileChooser
		ArrayList<String> expressionList = new ArrayList<>();
		JFileChooser chooser = new JFileChooser();
		//Show directories and files
		chooser.setFileSelectionMode(JFileChooser.FILES_AND_DIRECTORIES);
		//user's current directory
		chooser.setCurrentDirectory(new File(System.getProperty("user.dir")));
		int response = chooser.showOpenDialog(null);
		if (response == JFileChooser.APPROVE_OPTION){
			File file = chooser.getSelectedFile();
			try {
				Scanner scan = new Scanner(file);
				if (file.isFile()){
					while (scan.hasNextLine()){
						String expression = scan.nextLine();
						expressionList.add(expression);
					}
				}
			}
			catch (NoSuchElementException nsee){
				JOptionPane.showMessageDialog(JOptionPane.getRootFrame(),"File is empty!");
			}
			catch(FileNotFoundException fnfe){
				JOptionPane.showMessageDialog(JOptionPane.getRootFrame(),"404 File Not Found!");
			}
		}
		return expressionList;
	}
	

	public static boolean checkStrongOrder( List<Polynomial> polyList){
		boolean isStrongOrder = true;
		Polynomial previous = polyList.get(polyList.size()-1);
		for(int i = polyList.size()-2; i > 0; i--){

			if (previous.compareTo(polyList.get(i)) < 0){
				isStrongOrder = false;
			}
		}
		return isStrongOrder;
	}

	public static boolean checkWeakOrder( List<Polynomial> polyList){
		boolean isWeakOrder = true;
		Polynomial previous = polyList.get(polyList.size()-1);
		for(int i = polyList.size()-2; i > 0; i--){

			if (previous.compareExponents(polyList.get(i)) < 0){
				isWeakOrder = false;
			}
		}
		return isWeakOrder;
	}

	public static void processPolyList(){
		try {
			ArrayList<String> a = fromFile();
			for (String element : a) {
				Polynomial p = new Polynomial(element);
				System.out.println(p);
				polyList.add(p);
			}
		}
		catch (InvalidPolynomialSyntax ips){
			JOptionPane.showMessageDialog(JOptionPane.getRootFrame(),ips.getMessage());
		}

		System.out.println("This list is sorted by the strong order: " + checkStrongOrder(polyList));
		System.out.println("This list is sorted by the weak order: " + checkWeakOrder(polyList));
	}
}