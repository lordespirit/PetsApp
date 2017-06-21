package tests;
import org.junit.Assert;
import org.junit.Test;
import main.Aves;
import main.Canidos;
import main.Felinos;
import main.ListaMascotas;
import main.Mascota;
import main.Person;
import main.Roedores;

public class testMascotas {

	/*
	
	@Test
	public void testListaMascotas(){
		
		ListaMascotas list = new ListaMascotas();
		
		list.add(new Canidos("Firulais", 40, 0.4f , 0.65f));
		list.add(new Felinos("Garfield", 15, 0.2f , 0.40f));
		list.add(new Aves("Piolin", 0.22f, 0.1f , 0.1f));
		
		
	Assert.assertNotNull(list.get(0));
	Assert.assertNotNull(list.get(1));
	Assert.assertNotNull(list.get(2));
		
		for(int i=0;i< list.size();i++){
			System.out.println("Mascota: " +  list.get(i).getNombre() +
					" | Estado Nutrici�n: " + list.get(i).getEstadoNutricion() +
					" | Peso Racion Comida: " + list.get(i).getPesoRacion() );
		}
		
	}
	
	@Test
	public void testListaMascotas2(){
		
		ListaMascotas list = new ListaMascotas();
		
		list.add(new Canidos("Firulais", 40, 0.4f , 0.65f));
		list.add(new Felinos("Garfield", 15, 0.2f , 0.40f));
		list.add(new Aves("Piolin", 0.22f, 0.1f , 0.1f));
		list.add(new Roedores("Tambor", 0.35f , 0.1f , 0.24f));
		
		
		for(int i=0;i< list.size();i++){
			if(list.get(i).getClass().isAssignableFrom(Canidos.class)){
				Canidos canido = (Canidos) list.get(i);
				System.out.println("Canido: " +  canido.getNombre() +
						" | Estado Nutrici�n: " + canido.getEstadoNutricion() +
						" | Calidad de Colmillos: " +canido.getCalidadColmillo() +
						" | Peso Racion Comida: " + canido.getPesoRacion() );
			}else if(list.get(i).getClass().isAssignableFrom(Felinos.class)){
				Felinos felino = (Felinos) list.get(i);
				System.out.println("Felino: " +  felino.getNombre() +
						" | Estado Nutrici�n: " + felino.getEstadoNutricion() +
						" | Calidad de Garras: " + felino.getCalidadGarras() +
						" | Peso Racion Comida: " + felino.getPesoRacion() );
			}else if(list.get(i).getClass().isAssignableFrom(Aves.class)){
				Aves ave = (Aves) list.get(i);
				System.out.println("Ave: " +  ave.getNombre() +
						" | Estado Nutrici�n: " + ave.getEstadoNutricion() +
						" | Calidad de Plumas: " + ave.getCalidadPlumas() +
						" | Peso Racion Comida: " + ave.getPesoRacion() );
			}else if(list.get(i).getClass().isAssignableFrom(Roedores.class)){
				Roedores roedor = (Roedores) list.get(i);
				System.out.println("Roedor: " +  roedor.getNombre() +
						" | Estado Nutrici�n: " + roedor.getEstadoNutricion() +
						" | Calidad de Pelaje: " + roedor.getCalidadPelaje() +
						" | Peso Racion Comida: " + roedor.getPesoRacion() );
			}
		}
		
	}
	*/
	
	@Test
	public void testListaMascotasPropietario(){
		
		ListaMascotas list = new ListaMascotas();

		Canidos can1 = new Canidos("Firulais", 40, 0.4f , 0.65f);
		Person per1 = new Person("Edu Valles;00346664585;edu@edu.com;Av.Madrid");
		list.add(can1);
		can1.setPropietario(per1);
		
		Canidos can2 = new Canidos("Rex", 20, 1f , 1.5f);
		Person per2 = new Person("Fredy Campino;00346617845;fredy@cam.com;Calle Marina");
		list.add(can2);
		can2.setPropietario(per2);
		
		Aves ave1 = new Aves("Piolin", 0.1f, 0.1f , 0.1f);
		Person per3 = new Person("Jose Rodriguez;00345854211;jose@rodr.es;Callejon Verde 12");
		list.add(ave1);
		ave1.setPropietario(per3);
		
		Roedores roedor1 = new Roedores("Mordisquitos", 0.3f, 0.2f , 0.25f);
		list.add(roedor1);
		roedor1.setPropietario(per1);
		
		Mascota[] busqueda1 = list.findByOwnerEmail("jose@");
		Mascota[] busqueda = list.findByOwnerName("Edu");
		
		Assert.assertEquals(1, busqueda1.length);
		Assert.assertEquals(2, busqueda.length);

		for(int i=0;i< list.size();i++){
			if(list.get(i).getClass().isAssignableFrom(Canidos.class)){
				Canidos canido = (Canidos) list.get(i);
				System.out.println("Canido: " +  canido.getNombre() +
						" | Estado Nutrici�n: " + canido.getEstadoNutricion() +
						" | Calidad de Colmillos: " +canido.getCalidadColmillo() +
						" | Peso Racion Comida: " + canido.getPesoRacion() +
						" | Due�o : " + canido.getPropietario().getFullName());
				
			}else if(list.get(i).getClass().isAssignableFrom(Felinos.class)){
				Felinos felino = (Felinos) list.get(i);
				System.out.println("Felino: " +  felino.getNombre() +
						" | Estado Nutrici�n: " + felino.getEstadoNutricion() +
						" | Calidad de Garras: " + felino.getCalidadGarras() +
						" | Peso Racion Comida: " + felino.getPesoRacion() +
						" | Due�o : " + felino.getPropietario().getFullName());
				
			}else if(list.get(i).getClass().isAssignableFrom(Aves.class)){
				Aves ave = (Aves) list.get(i);
				System.out.println("Ave: " +  ave.getNombre() +
						" | Estado Nutrici�n: " + ave.getEstadoNutricion() +
						" | Calidad de Plumas: " + ave.getCalidadPlumas() +
						" | Peso Racion Comida: " + ave.getPesoRacion()  +
						" | Due�o : " + ave.getPropietario().getFullName());
			}else if(list.get(i).getClass().isAssignableFrom(Roedores.class)){
				
				Roedores roedor = (Roedores) list.get(i);
				System.out.println("Roedor: " +  roedor.getNombre() +
						" | Estado Nutrici�n: " + roedor.getEstadoNutricion() +
						" | Calidad de Pelaje: " + roedor.getCalidadPelaje() +
						" | Peso Racion Comida: " + roedor.getPesoRacion()  +
						" | Due�o : " + roedor.getPropietario().getFullName());
			}
		}
		
	}
	
	
	
}
