package main;

public class ListaMascotas {

	private Mascota[] arrayMascotas;
	
	public ListaMascotas(){
		arrayMascotas = new Mascota[0];
	}

	public Mascota get(int index){
		return arrayMascotas[index];
	}
	
	public int size(){
		return arrayMascotas.length;
	}
	
	public void add(Mascota mascota){
		Mascota[] copyMascotas = new Mascota[arrayMascotas.length+1];
		for(int i=0;i<arrayMascotas.length;i++){
			copyMascotas[i]=arrayMascotas[i];
		}
		copyMascotas[copyMascotas.length-1]=mascota;
		arrayMascotas = copyMascotas;
	}
	
	public int indexOf(Mascota mascota){
		int index = -1; 
		for(int i=0; i<arrayMascotas.length; i++){
			if(arrayMascotas[i].equals(mascota)){
				index = i;
				 break; 
			}
		}	
		return index; 
}
	
	public void remove(Mascota mascota) {
		int index = indexOf(mascota);
		remove(index);
	}	
	
	public void remove(int index){
		if(index<0||index>arrayMascotas.length){
			System.out.println("Índice incorrecto...");
			return;
		}else{
			Mascota[] copyMascotas = new Mascota[arrayMascotas.length-1];
			int j=0;
			for(int i=0;i<arrayMascotas.length;i++){
				if(i!=index){
					copyMascotas[j++]=arrayMascotas[i];
				}
			}
			arrayMascotas = copyMascotas;
		}
	}
	
	public Mascota[] findByOwnerName(String name){
		Mascota findNameArrayMascotas[];  
		int counter = 0;
		for(Mascota mascota: arrayMascotas){
			if(mascota.getPropietario().getFullName().startsWith(name));
				counter++; 
		}
		findNameArrayMascotas = new Mascota[counter];  
		for(int i=0,k=0; i<findNameArrayMascotas.length; i++){
			if(arrayMascotas[i].getPropietario().getFullName().startsWith(name))
				findNameArrayMascotas[k++]=arrayMascotas[i];
		}
		return findNameArrayMascotas;
	}
	
	public Mascota[] findByOwnerEmail(String email){
		Mascota findEmailArrayMascotas[];  
		int counter = 0;
		for(Mascota mascota: arrayMascotas){
			if(mascota.getPropietario().getMail().startsWith(email));
				counter++; 
		}
		findEmailArrayMascotas = new Mascota[counter];  
		for(int i=0,k=0; i<findEmailArrayMascotas.length; i++){
			if(arrayMascotas[i].getPropietario().getMail().startsWith(email))
				findEmailArrayMascotas[k++]=arrayMascotas[i];
		}
		return findEmailArrayMascotas;
	}
	
	
}
