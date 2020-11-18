package com.test.findcapitalcity;

import java.util.Scanner;

import com.test.findcapitalcity.util.Util;
import com.test.findcapitalcity.service.Service;

/**
 * 
 * Application interacts with console and reads input
 *
 */
public class Application {

	public static void main(String[] args) throws Exception {

		Service service = new Service();
		Scanner scanner = null;
		try {
			System.out.print("Search capital by Country name or Country Code (name/code) : ");
			scanner = new Scanner(System.in);
			String choice = scanner.nextLine().toLowerCase();
			if (!("name".equals(choice) || "code".equals(choice))) {
				System.out.println("Invalid choice!");
			} else {
				while (true) {
					System.out.print("Enter your input (Quit?q): ");
					String input = scanner.nextLine();
					if ("q".equalsIgnoreCase(input)) {
						break;
					} else {
						String Countryname = null;
						try {
							if ("code".equals(choice)) {
								Countryname = Util.getCoutNameByCode(input);
							} else {
								Countryname = input.toUpperCase();
							}
							System.out.println(service.getContent(Countryname));
						} catch (Exception e) {
							System.out.println(e.getMessage());
						}
					}
				}
			}
		} catch (Exception e) {
			System.out.println(e.getMessage());
		} finally {
			if (null != scanner) {
				scanner.close();
			}
		}
	}
}
