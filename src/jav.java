import java.util.Scanner;


public class jav {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
                
		int num1,num2,suma,resta,multi,division,n;
		Scanner escaner = new Scanner (System.in);
		System.out.print("Ingrese primer numero:"); 
		num1=escaner.nextInt();
		System.out.print("Ingrese segundo numero:"); 
		num2=escaner.nextInt();
		System.out.println("Mostrar Opcion:"); 
		System.out.println("1:"); 
		System.out.println("2:"); 
		System.out.println("3:"); 
		System.out.println("4:"); 
		n=escaner.nextInt(); 
		switch (n){ 
		case 1:
			suma=num1+num2; 
			System.out.println("La suma es"+suma); 
			break; 
			case 2: 
				resta=num1-num2;
				System.out.println("La resta es"+resta);
            break; 
            case 3:
            	multi=num1*num2; 
            System.out.println("La multiplicacion es"+multi); 
            break; 
            case 4: 
            	division=num1/num2; 
            	System.out.println("La division es"+division);
            	break; 
            
            	} 
		} 
	} 
