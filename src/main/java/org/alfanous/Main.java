package org.alfanous;

import org.alfanous.api.AlFanousSearch;
import org.alfanous.Models.*;

public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		  	//ElFanousSearch query = new ElFanousSearch("http://www.alfanous.org/jos2?action=search&query=gid:6236");
		try {
			System.out.println("Entred try block ");
			//The following line demonstrates how to search for the keyword الله using ElFanousSearch
			AlFanousSearch query = new AlFanousSearch("http://www.alfanous.org/jos2?action=search&query=%D8%A7%D9%84%D9%84%D9%87");
			Error queryError = query.getError();
			SearchResults queryResults = query.getSearchResults();
			System.out.println("Error : " + queryError.toString());
			System.out.println("Ayas count = " + queryResults.getCount());
			System.out.println("runtime = " + queryResults.getRuntime());
			int iterator = 0;
			for (AyaItem aya : queryResults.getAyaItems()) {
				System.out.println("Sura Name for aya number + " + iterator + " = " + aya.getSura().getArabicName());
				System.out.println("Aya text for aya number + " + iterator + " = " + aya.getAyaDetail().getText());
			}
		} catch (Exception e) {
			System.out.println("An Error has occured : " + e.getMessage());
		}
	  }
}
