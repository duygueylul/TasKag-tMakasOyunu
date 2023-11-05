package TasKagıtMakasOyunu;
import java.util.Scanner;

public class TasKagıtMakas {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int k_puan = 0;
		int b_puan = 0;
		System.out.println("Taş Kağıt Makas Oyununa Hoşgeldiniz!!");
		System.out.println("1- Taş  2-Kağıt  3-Makas");
		
		while(true) {
			System.out.println("Seçiminiz: ");
			int secim = scan.nextInt();
			int b_secim = (int)(Math.random() * 3);
			
			if(secim == 1) {
				if(b_secim == 1) {
					System.out.println("Bilgisayarın Seçimi: Taş  Sonuç: Berabere");
					System.out.println("Puanınız: " + k_puan + "Bilgisayarın Puanı: " + b_puan);
					
				}
				else if(b_secim == 2) {
					System.out.println("Bilgisayarın Seçimi: Kağıt  Sonuç: Kaybettiniz.");
					b_puan++;
					System.out.println("Puanınız: "+ k_puan + "Bilgisayarın Puanı: " + b_puan);
				}
				else {
					System.out.println("Bilgisayarın Seçimi: Makas  Sonuç: Kazandınız.");
					k_puan++;
					System.out.println("Puanınız: " + k_puan + "Bilgisayarın Puanı: " + b_puan);
					
				}
				
			}
			else if(secim == 2) {
				if(b_secim == 1) {
					System.out.println("Bilgisayarın Seçimi: Taş  Sonuç:  Kazandınız");
					k_puan++;
					System.out.println("Puanınız: " + k_puan + "Bilgisayarın Puanı: " + b_puan);
					
				}
				
			}
			else if(secim == 2) {
				if(b_secim == 1) {
					System.out.println("Bilgisayarın Seçimi: Taş  Sonuç: Kazandınız.");
					k_puan++;
					System.out.println("Puanınız: " + k_puan + "Bilgisayarın Puanı: " + b_puan);
					
				}
				else if(b_secim == 2) {
					System.out.println("Bilgisayarın Seçimi:  Kağıt  Sonuç: Berabere");
					System.out.println("Puanınız: " + k_puan + "Bilgisayarın Puanı: " + b_puan);
					
				}
				else {
					System.out.println("Bilgisayarın Seçimi: Makas  Sonuç: Kaybettiniz.");
					b_puan++;
					System.out.println("Puanınız: " + k_puan + "Bilgisayarın Puanı: " + b_puan);
					
				}
				
			}
			else if(secim == 3) {
				if(b_secim == 1) {
					System.out.println("Bilgisayarın Seçimi: Taş  Sonuç:  Kaybettiniz.");
					b_puan++;
					System.out.println("Puanınız: " + k_puan + "Bilgisayarın Puanı: " + b_puan);
					
				}
			}
			else if(b_secim == 2) {
				System.out.println("Bilgisayarın Seçimi: Kağıt  Sonuç:  Kazandınız.");
				k_puan++;
				System.out.println("Puanınız: " + k_puan + "Bilgisayarın Puanı: " + b_puan);
				
			}
			else {
				System.out.println("Hatlı Giriş Yaptınız!! Tekrar Deneyiniz.");
				continue;
			}
			if(k_puan == 3) {
				System.out.println("Oyunu " + k_puan + " - " + b_puan + "kazandınız.");
				break;
			}
			else if(b_puan == 3) {
				System.out.println("Oyunu " + b_puan + " - " + k_puan + "kaybettiniz.");
				break;
			}
		}
		

	}

}
