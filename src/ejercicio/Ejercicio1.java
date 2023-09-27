package ejercicio;

public class Ejercicio1 {

    private static final boolean True = false;

    
	public static void main(String[] args) {



// Ejercicio 1a
/*  		a. Utilizando la sentencia while, imprima todos los números entre 2 variables “a”
			y “b”. Su código puede arrancar (por ejemplo):*/
// 		Se deberían mostrar los números:
//    	5,6,7,8,9,10,11,12,13,14

        int numeroInicio = 5;
        
        int numeroFin = 12;
        
        System.out.println("Inicia el item A del Ejercicio 1");
        
        while(numeroInicio <= numeroFin) {	
        	System.out.println(numeroInicio);
        	numeroInicio++; // numeroInicio = numeroInicio + 1;
        	}
        	

//		Ejercicio b
    
		System.out.println("Inicia el Item b del ejercicio 1");
/*		b. A lo anterior, solo muestre los números pares */
		
         numeroInicio = 5;

		while(numeroInicio <= numeroFin) {
		   if(numeroInicio % 2 == 0) {  
		   
	        	System.out.println(numeroInicio);
			  }
			  numeroInicio++;
		}

//		Ejercicio c
    
/* 		c. A lo anterior, con una variable extra, elija si se deben mostrar los números
			pares o impares */
    
    		System.out.println("Inicia el Item c del ejercicio 1");
    
			numeroInicio = 5;
			
			boolean esPar = True; //True -> imprime los pares; False imprime los impares
			
			while(numeroInicio <= numeroFin) {
				
				if(numeroInicio % 2 == 0 && esPar) {
					
					System.out.println(numeroInicio);	
				}
			    if(numeroInicio % 2 != 0 && !esPar) {
			    	
			    	System.out.println(numeroInicio);
			    }
			    numeroInicio++;
			    
			}

/*			d. Utilizando la sentencia for, hacer lo mismo que en (b) pero invirtiendo el orden*/
	numeroInicio = 5;
	System.out.println("Inicia el Item d del ejercicio 1");
	for (int numeroActual = numeroFin; numeroActual >= numeroInicio; numeroActual--) {
	    if (numeroActual % 2 == 0) {
	        System.out.println(numeroActual);
	    }}
	
	// Ejercicio 2
	
	System.out.println("Inicia el Ejercicio 2");

    float ingresosMensuales = 100000;
    int cantidadVehiculosMenora5anios = 3;
    int cantidadInmuebles = 1;
    int cantidadVehiculosLujo = 0; // incluye titular de activos , aeronave

    if (ingresosMensuales >= 489083 || 
    	cantidadVehiculosMenora5anios >= 3 ||
    	cantidadInmuebles >= 3 ||
    	cantidadVehiculosLujo > 0) {
    	
        System.out.println("El hogar pertenece al segmento de ingresos altos");
        
    } else {
    	
        System.out.println("El hogar NO pertenece al segmento de ingresos altos");
        
    }

    // Ejercicio 2d
	
	System.out.println("Inicia el Ejercicio 2d");
	
    double ingresosCatA = 748382.07;
    int superficieCatA = 30;
    int energiaCatA = 3330;

    double ingresosCatB = 1112459.83;
    int superficieCatB = 45;
    int energiaCatB = 5000;

    double ingresosCatC = 1557443.75;
    int superficieCatC = 60;
    int energiaCatC = 6700;

    double ingresosCatD = 1934273.04;
    int superficieCatD = 85;
    int energiaCatD = 10000;

    double ingresosCatE = 2277684.56;
    int superficieCatE = 110;
    int energiaCatE = 13000;

    double ingresosCatF = 2847105.70;
    int superficieCatF = 150;
    int energiaCatF = 16500;

    double ingresosCatG = 3416526.83;
    int superficieCatG = 200;
    int energiaCatG = 20000;

    double ingresosCatH = 4229985.60;
    int superficieCatH = 200;
    int energiaCatH = 20000;

    // Datos de entrada a Evaluar la categoria del monotributo

    double ingreso = 1112460;
    int superficie = 0;
    int energia = 0;

    
    if (ingreso <= ingresosCatA && superficie <= superficieCatA && energia <= energiaCatA) {
        System.out.println("Categoría A");
    } else if (ingreso <= ingresosCatB && superficie <= superficieCatB && energia <= energiaCatB) {
        System.out.println("Categoría B");
    } else if (ingreso <= ingresosCatC && superficie <= superficieCatC && energia <= energiaCatC) {
        System.out.println("Categoría C");
    } else if (ingreso <= ingresosCatD && superficie <= superficieCatD && energia <= energiaCatD) {
        System.out.println("Categoría D");
    } else if (ingreso <= ingresosCatE && superficie <= superficieCatE && energia <= energiaCatE) {
        System.out.println("Categoría E");
    } else if (ingreso <= ingresosCatF && superficie <= superficieCatF && energia <= energiaCatF) {
        System.out.println("Categoría F");
    } else if (ingreso <= ingresosCatG && superficie <= superficieCatG && energia <= energiaCatG) {
        System.out.println("Categoría G");
    } else if (ingreso <= ingresosCatH && superficie <= superficieCatH && energia <= energiaCatH) {
        System.out.println("Categoría H");
    } else {
        System.out.println("No se encuentra en ninguna categoría.");
    }
}
}