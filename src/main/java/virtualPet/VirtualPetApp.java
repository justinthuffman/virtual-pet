package virtualPet;

import java.util.Scanner;

public class VirtualPetApp {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		VirtualPet myVirtualPetInstance = new VirtualPet(0, 0, 0, 0, 0);

		System.out.println("            _             _\n" + "           | '-.       .-' |\n"
				+ "            \\'-.'-\"\"\"-'.-'/    _\n" + "             |= _:'.':_ =|    /:`)\n"
				+ "             \\ <6>   <6> /   /  /\n" + "             |=   |_|   =|   |:'\\\n"
				+ "             >\\:.  \"  .:/<    ) .|\n" + "              /'-._^_.-'\\    /.:/\n"
				+ "             /::.     .::\\  /' /\n" + "           .| '::.  .::'  |;.:/\n"
				+ "          /`\\:.         .:/`\\(\n" + "         |:. | ':.   .:' | .:|\n"
				+ "         | ` |:.;     ;.:| ` |\n" + "          \\:.|  |:. .:|  |.:/\n"
				+ "           \\ |:.|     |.:| /\n" + "           /'|  |\\   /|  |`\\\n"
				+ "          (,,/:.|.-'-.|.:\\,,)\n" + "            (,,,/     \\,,,) \nWelcome to your virtual cat!");

		String petAction;
		while (myVirtualPetInstance.notDead()) {
			do {
				System.out.println(myVirtualPetInstance.userInputChoices());
				petAction = input.nextLine();
			} while (!petAction.equals("1") && !petAction.equals("2") && !petAction.equals("3")
					&& !petAction.equals("4") && !petAction.equals("5"));
			switch (petAction) {
			case "1":
				System.out.print("\n \n \n \n \n \n \n \n \n \n \n \n");
				System.out.println("Mmmmmm mmmmm good. They love your cooking.");
				myVirtualPetInstance.eat();
				if (myVirtualPetInstance.notDead() == true) {
					System.out.println("");
					System.out.println(myVirtualPetInstance.statusUpdate());
				}
				break;

			case "2":
				System.out.print("\n \n \n \n \n \n \n \n \n \n \n \n");
				System.out.println("They drank SO MUCH!");
				myVirtualPetInstance.drink();
				if (myVirtualPetInstance.notDead() == true) {
					System.out.println("");
					System.out.println(myVirtualPetInstance.statusUpdate());
				}
				break;

			case "3":
				System.out.print("\n \n \n \n \n \n \n \n \n \n \n \n");
				System.out.println("They look so relieved!");
				myVirtualPetInstance.bathroom();
				if (myVirtualPetInstance.notDead() == true) {
					System.out.println("");
					System.out.println(myVirtualPetInstance.statusUpdate());
				}
				break;

			case "4":
				System.out.print("\n \n \n \n \n \n \n \n \n \n \n \n");
				System.out.println("All work and no play makes Homer something something");
				myVirtualPetInstance.play();
				if (myVirtualPetInstance.notDead() == true) {
					System.out.println("");
					System.out.println(myVirtualPetInstance.statusUpdate());
				}
				break;

			case "5":
				System.out.print("\n \n \n \n \n \n \n \n \n \n \n \n");
				System.out.println("Don't let the bedbugs bite (unless you're into that sort of thing).");
				myVirtualPetInstance.sleep();
				if (myVirtualPetInstance.notDead() == true) {
					System.out.println("");
					System.out.println(myVirtualPetInstance.statusUpdate());
				}
				break;

			}
		}
		if (myVirtualPetInstance.notDead() == false) {
			System.out.print(
					"\n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n");
			System.out.println("Ya blew it!\n             /\\\n" + "            \\ \\\n" + "             \\ \\\n"
					+ "             / /\n" + "            / /\n" + "           _\\ \\_/\\/\\\n"
					+ "          /  *  \\@@ =\n" + "         |       |Y/\n" + "         |       |~\n"
					+ "          \\ /_\\ /\n" + "           \\\\ //\n" + "            |||\n" + "           _|||_\n"
					+ "          ( / \\ ) \n" + myVirtualPetInstance.death());
			System.exit(0);
		}
		input.close();
//		System.out.println(" " + (myVirtualPetInstance.hunger) + " " + (myVirtualPetInstance.thirst) + " "
//				+ (myVirtualPetInstance.waste) + " " + (myVirtualPetInstance.boredom) + " "
//				+ (myVirtualPetInstance.tiredness));

	}
}