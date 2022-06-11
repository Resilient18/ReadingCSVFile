package praticeReadingCsv;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class ReadingCsvFile {

	public static void main(String[] args) {
		
		String path = "C:\\Rajasree\\JAVA\\CSVPractice.csv";
		try { 
		doesFileExist(path);
		}
		catch(Exception e) {
		e.printStackTrace();
		 
		}

	}
	public static void doesFileExist( String path) { 
		
		String line= "";
		String splitBy = ",";
		 path = "C:\\Rajasree\\JAVA\\CSVPractice.csv";
		try {
			BufferedReader br = new BufferedReader(new FileReader(path));
			while((line =br.readLine())!= null  ) { 
			String[] dictionary = line.split(splitBy);	
			
			for (String str: dictionary)
				System.out.println(str);
			/*
			 * System.out.println(dictionary[1]); System.out.println(dictionary[2]);
			 */
				
			}
		} catch (IOException e) {
			
			e.printStackTrace();
		}
	}
}
