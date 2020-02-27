package com.cts.gscp.ui;

import java.time.DateTimeException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.List;
import java.util.Scanner;

import com.cts.gscp.exception.GuitarStoreException;
import com.cts.gscp.model.Guitar;
import com.cts.gscp.model.GuitarStoreAppMenu;
import com.cts.gscp.service.GuitarService;
import com.cts.gscp.service.GuitarServiceImpl;

public class GuitarStoreManagementUI {
	private static GuitarService guitarService;
	private static Scanner scan;
	private static DateTimeFormatter dtFormatter;
	
	public static void main(String[] args) {
		try {
			guitarService=new GuitarServiceImpl();
			
		} catch (GuitarStoreException ex) {
			ex.printStackTrace();
		}
		
		scan=new Scanner(System.in);
		dtFormatter=DateTimeFormatter.ofPattern("dd-MM-yyyy");
		
		GuitarStoreAppMenu menu=null;
		
		while(menu!=GuitarStoreAppMenu.Quit) {
			System.out.println("SELECT");
			System.out.println("============================");
			System.out.println("Choice\tMenu Item");
			System.out.println("===========================");
			for (GuitarStoreAppMenu m : GuitarStoreAppMenu.values()) {
				System.out.println(m.ordinal() + "\t" + m.name());
			}
			System.out.print("Option: ");
			int option = -1;
			if (scan.hasNextInt())
				option = scan.nextInt();
			else {
				scan.next();
				System.out.println("Kindly choose from below:");
				continue;
			}

			if (option < 0 || option >= GuitarStoreAppMenu.values().length) {
				System.out.println("Invalid Choice");
			} else {
				menu = GuitarStoreAppMenu.values()[option];
				switch (menu) {
				case Add:
					doAdd();
					break;
				case List:
					doList();
					break;
				case Search:
					doSearch();
					break;
				case Remove:
					doRemove();
					break;
				case Quit:
					System.out.println("Thank You !! Come Again !!");
					break;
				}
			}

		}

		scan.close();
		try {
			guitarService.persist();
		} catch (GuitarStoreException e) {
			e.printStackTrace();
		}
	}

	private static void doAdd() {
		try {
			Guitar guitar = new Guitar();
			System.out.print("Guitar Model: ");
			guitar.setGuitarModel(scan.next());
			System.out.print("Guitar Name: ");
			guitar.setGuitarName(scan.next());
			System.out.print("Date Added(dd-MM-yyyy): ");
			String dtStr = scan.next();

			try {
				guitar.setDateAdded(LocalDate.parse(dtStr, dtFormatter));
			} catch (DateTimeException exp) {
				throw new GuitarStoreException(
						"Date must be in the format day(dd)-month(MM)-year(yyyy)");
			}
			System.out.print("Price: ");
			if (scan.hasNextDouble())
				guitar.setPrice(scan.nextDouble());
			else {
				scan.next();
				throw new GuitarStoreException("Price is a number");
			}

			String guitarModel = guitarService.add(guitar);
			System.out.println("Guitar is Added with code: " + guitarModel);
		} catch (GuitarStoreException exp) {
			System.out.println(exp.getMessage());
		}
	}

	private static void doList() {
		List<Guitar> guitars;
		try {
			guitars = guitarService.getAll();
			if (guitars.size() == 0) {
				System.out.println("No Guitars To display");
			} else {
				for (Guitar b : guitars)
					System.out.println(b);
			}
		} catch (GuitarStoreException exp) {
			System.out.println(exp.getMessage());
		}
	}

	private static void doSearch() {
		System.out.print("Guitar Model: ");
		String guitarModel = scan.next();

		try {
			Guitar guitar = guitarService.get(guitarModel);
			if (guitar != null) {
				System.out.println(guitar);
			} else {
				System.out.println("No Such Guitar");
			}
		} catch (GuitarStoreException exp) {
			System.out.println(exp.getMessage());
		}
	}

	private static void doRemove() {
		System.out.print("Guitar Model: ");
		String bcode = scan.next();
		try {
			boolean isDone = guitarService.delete(bcode);
			if (isDone) {
				System.out.println("Guitar entry Deleted");
			} else {
				System.out.println("No Such Guitar");
			}
		} catch (GuitarStoreException exp) {
			System.out.println(exp.getMessage());
		}
	}

		
}


