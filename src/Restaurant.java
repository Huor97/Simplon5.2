import java.util.Scanner;

public class Restaurant {
	public static void Clien() {
		//100 personne prendre des commende 
		/*for (int n = 0; n <= 100; n++) {
			System.out.println(n);
		}*/
		
	}
	public static void commende() {
		System.out.println("Il y a trois Menus.chaque Menue est 9 Eureu : \n\n" + " Végetarien : \n on peut choisir "
							+ "d'avoir en plus un peu de riz.\n une boisson\n\n " + "pulet : \n des légumes frais\n "
							+ "des frites ou du riz \n"+" Et une boisson : eau plate, eau gazeuse ou soda.\n\n " 
							+"Viende : La viande de boeuf et sa préparation reviennent un peu plus\n cher"
							+" Donc Les accompagnements proposés sont les mêmes.mais cette\n fois-ci pas de boisson inclue dans le menu.\n\n"
							+ "voila choisissiez votre menu:");
		Scanner Commende = new Scanner(System.in); 
			String Co = Commende.next();
			
			System.out.println("Choisis accompagnement\n");
			Scanner menu = new Scanner(System.in);
			String me = menu.next();
			
			System.out.println("Choisis boisson :");
			Scanner boisson = new Scanner(System.in); 
			String bo = boisson.next();
			
			 switch(Co) 
		        { 
		            case "végetarien": 
		                System.out.println(" ok c'est noté végetarien"); 
		                break; 
		            case "pulet": 
		                System.out.println("ok c'est noté pulet"); 
		                break; 
		            case "Viende": 
		                System.out.println("ok c'est noté Viende"); 
		                break; 
		            default: 
		                System.out.println("on n'a pas cette menue"); 
		        }
			 //Commende.close();
			 
				switch(me)
				{
				//menu végetarien
				case "Riz":
					System.out.println("ok c'est noté Riz");
					break;
				case "Non sans riz":
					System.out.println("ok on n'ajute pas");
					break;
				//menu pulet 
				case "des legumes frais":
					System.out.println("ok c'est noté legumes");
					break;
				case "Non sans legumes frais":
					System.out.println("ok on n'ajute pas");
					break;
				case "des fraites"+"ou du riz":
					System.out.println("ok c'est noté fraites " + "ok c'est noté riz");
					break;
				case "sans fraites"+"sans riz":
					System.out.println("ok on n'ajute pas");
					break;
				case "":
					default:
						System.out.println("on n'a pas cet accompagnement");
				
				}
				//menu.close();
				
				 
				switch(bo)
				{
					//les boisson
				case "eau plate":
					System.out.println("ok c'est noté eau plate");
					break;
				case "eau gazeuse":
					System.out.println("ok c'est noté eau gazeuse");
					break;
				case "soda":
					System.out.println("ok c'est noté soda");
					default:
						System.out.println("on n'a pas cette boisson");
				}
				Commende.close();
				menu.close();
				boisson.close();
		
	}
	
}
