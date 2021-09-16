package extraCalismaInheritance;

import java.util.Scanner;

public class OgrenciIsleri extends Universite {

	 public static int vize1;
	 public static int vize2;
	 public static int not;
	 public static boolean gectiMi;
	 
	 
	 public static int notHesaplama(int vize1, int vize2) {
		 Scanner scan=new Scanner(System.in);
		 System.out.println("lutfen notunuzu giriniz");
		 vize1=scan.nextInt();
		 vize2=scan.nextInt();
		 not=(vize1+vize2)/2;
		 return not;
		 
		 
	 }
	 
	 public static boolean gectiMi(boolean gectiMi) {
		 
		 if(not>=50) {
			 System.out.println("gecti");
		 }else {
			 System.out.println("kaldi");
		 }
		return gectiMi;
		 
	 }

}
