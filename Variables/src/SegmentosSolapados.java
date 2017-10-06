
public class SegmentosSolapados {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		// dados unos numeros ver si se solapan entre ellos
		
		
		int ai = 4;
		int af = 8;
		int bi = 5;
		int bf = 6;
		
		if (bi <= af && bi >= ai ||
			ai <= bf && ai >= bi ||
			ai <= bi && af >= bf ||
			bi <= ai && bf >= af ||
			ai == bi && af == bf ||
			af == bi && bf == ai){
			System.out.println("Se Solapan");
			}
		else{
			System.out.println("No se Solapan");
		}
			
		
	}

}
