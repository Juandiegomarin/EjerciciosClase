
package tema5_ejercicios_estructuras_almacenamiento;






public class Ej09 {

    
    public static void main(String[] args) {
        
        int[] array= new int[10];
        
        for (int i = 0; i < array.length; i++) {
            
            array[i]=utilidades.Utilidades.numeroEnteroRandom(1, 10);
            
        }
        System.out.println("Lista ordenada");
        ordenarBubble(array);
        
        for (int i = 0; i < array.length; i++) {
            
            if (i < array.length - 1) {

                System.out.print("[" + array[i] + "]" + "-");
            } else {
                System.out.print("[" + array[i] + "]");
            }
        }
        
        int numero=utilidades.Utilidades.numeroEnteroRandom(1, 10);;
        System.out.println("");
        for (int i = 0; i < array.length; i++) {
            
            if(array[i]==numero){
            
                System.out.println("El numero "+numero+" se encuentra en la posicion "+i+" del array");
                break;
            }else if(array[i]!=numero&&i==array.length-1){
                System.out.println("EL numero "+numero+" no se encuentra en esta lista");
            }
            
        }
    }
    
    private static void ordenarBubble(int[]list){
    
        int tmp;
	for (int i = 0; i < list.length-1; i++){
		for (int j=i+1; j < list.length; j++){
			if (list[i] > list[j]){
				tmp = list[i];
				list[i] = list[j];
				list[j] = tmp;
			}
		}
	}

    
    
    
    
    }
    
}
