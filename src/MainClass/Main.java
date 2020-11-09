package MainClass;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		System.out.printf("Ingrese un numero equipo y cantidad de globos: ");
		String caso = sc.nextLine();
		String[] casos = caso.split(" ");
		int equipo = Integer.parseInt(casos[0]);
		int[] equipos = new int[equipo];
		int nglobos = Integer.parseInt(casos[1]);
		ArrayList globos = new ArrayList();
		for(int i = 0; i < nglobos; i++) {
			
			caso = sc.nextLine();
			String[] parts = caso.split(" ");
			String nEquipo = parts[0];
			String color = parts[1];
			
			if(globos.size() == 0) {
				globos.add(color);
				equipos[Integer.parseInt(nEquipo)-1] += 1; // le agrega un punto cada vez que se selecciona un equipo.
			}
			else {
				boolean existe = globos.contains(color);
				if(existe) {
					System.out.println("El Color ya esta dentro");
				}
				else {
					globos.add(color);
					equipos[Integer.parseInt(nEquipo)-1] += 1;   
				}
			}			
		}
		int puntaje = 0, ganador = 0;		
		
		for (int x = 0; x < equipos.length; x++) {
			if (equipos[x] >= puntaje) {
				puntaje = equipos[x];
				ganador = x;
				
			}
		}
		for (int x = 0; x < equipos.length; x++) {
			if(equipos[ganador] == equipos[x] && ganador != x){
				   System.out.println("Empate"); 
				  return;  
			}
		}
		ganador += 1;
		System.out.println("El ganador es: " + ganador);
	}

}
