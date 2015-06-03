import java.util.Scanner; //import lib I/O java 

public class Menu{
  int hasil=0; 
  //Fungsi Penjumlahan a + b
        void Penjumlahan (int a,int b){
            hasil=a+b;
            System.out.println("Pertambahan : "+a+" + "+b+" = "+hasil);
        }
        //Fungsi Pengurangan a + b
        void Pengurangan (int a,int b){
            hasil=a-b;
            System.out.println("Pengurangan : "+a+" - "+b+"  = "+hasil);
        }
        //Fungsi Perkalian a + b
        void Perkalian (int a,int b){
            hasil=a*b;
            System.out.println("Perkalian   : "+a+" X "+b+" = "+hasil);
        }
        //Fungsi Pembagian a + b
        void Pembagian (int a,int b){
            hasil=a/b;
            System.out.println("Pembagian   : "+a+" / "+b+"  = "+hasil);
        }
        //Fungsi Exit
        void Exit (){
            System.exit(0);
        }
 public static void main (String args[]){
  for (int i = 1; i < 9999 ; ){
  Scanner input = new Scanner( System.in );  
  
  System.out.println("pilihan  :");
  System.out.println("1. Penjumlahan");
  System.out.println("2. Pengurangan");
  System.out.println("3. Perkalian");
  System.out.println("4. Pembagian");
  System.out.println("5. Exit");
  System.out.println("Masukan Pilihan anda  :");
  int pilihan = input.nextInt(); 
  
  switch(pilihan){

  case 1 :
Scanner a1 = new Scanner(System.in);
System.out.print("Masukan Nilai A : ");
int a = a1.nextInt();
Scanner b2 = new Scanner(System.in);
System.out.print("Masukan Nilai B : ");
int b = b2.nextInt();
int c;
c = a+ b;
System.out.print("Hasil Dari "+ a );
System.out.print(" + " + b);
System.out.print(" = " + c);
System.out.println("");
     break;

   case 2 :
Scanner a2 = new Scanner(System.in);
System.out.print("Masukan Nilai A : ");
int x1 = a2.nextInt();
Scanner b1 = new Scanner(System.in);
System.out.print("Masukan Nilai B : ");
int x2 = b1.nextInt();
int x3;
x3 = x1 - x2;
System.out.print("Hasil Dari " + x1 );
System.out.print(" - " + x2 );
System.out.print(" = " + x3 );
System.out.println("");
     break;
  
   case 3 :
Scanner z1 = new Scanner(System.in);
System.out.print("Masukan Nilai A : ");
int na = z1.nextInt();
Scanner z2 = new Scanner(System.in);
System.out.print("Masukan Nilai B : ");
int nb = z2.nextInt();
int nc;
nc = na * nb;
System.out.print("Hasil Dari "+ na );
System.out.print(" X " + nb);
System.out.print(" = " + nc);
System.out.println("");
     break;
  
   case 4 :
Scanner k1 = new Scanner(System.in);
System.out.print("Masukan Nilai A : ");
double ka = k1.nextInt();
Scanner k2 = new Scanner(System.in);
System.out.print("Masukan Nilai B : ");
double kb = k2.nextInt();
double kc;
kc = ka/ kb;
System.out.print("Hasil Dari "+ ka );
System.out.print(" / " + kb);
System.out.print(" = " + kc);
System.out.println("");
      break;
    
    case 5 :
    System.exit(0);
   default :
     System.out.println("Maaf, pilihan salah");
     break;
   }
  }
 }

}