import java.util.Scanner;

public class MayorMenor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Escribe numero");
		
		int a = scanner.nextInt();

		
		
		System.out.println("Escribe el siguiente numero");
		
		int b = scanner.nextInt();
	
		if (a < b){
			
			System.out.println(a+ "es menor");
		}else{
			if (a > b){
		
			System.out.println(a+ "es mayor");
			}
			else{
			
			System.out.println("a y b son iguales");
		}
		}
		
	}}

