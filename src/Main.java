
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Maaş, Vergi, Bonus, Maaşı artımı hesaplayan bir program

		// Sınıfın attributeleri
		// name, salary, workHours(Çalıştığı saat), hireYear(İşe Giriş Yılı)
		// tax(vergi), bonus(mesai ücreti)
		// salaryRaise(Maaş artırımı)

		// tax methodu--> eğer çalışanın maaşı 2000 tl den az ise
		// vergi uygulanmayacak, fazla ise maaşının %5 i kadar vergisi olacak

		// bonus metodu--> eğer haftada 40 saatten fazla çalıştıysa
		// çalıştığı saat başına 30 tl maaşa bonus uygulanacak
		// ve ne kadar bonus aldığı hesaplanacak

		// raiseSalary--> işe girdiği yıla göre maaş artışı yapılacak
		// şuanki yıl 2022, 10 yıldan az ise %5, 10- 20 yıl arasında %10
		// 20 yıldan fazla ise %15 zam yapılcak

		// employye bilgilerini goster method
		/*
		 * Adı : Ahmet Maaşı : 3000.0 Çalışma Saati : 65.0 Başlangıç Yılı : 1995 Vergi :
		 * 90.0 Bonus : 750.0 Maaş Artışı : 450.0 Vergi ve Bonuslar ile birlikte maaş :
		 * 3660.0 Toplam maaş : 4110.0
		 */

		Worker worker1 = new Worker("İsmail", 3000, 65, 1995);
		WorkerManagement workerManagement = new WorkerManagement();

		workerManagement.vergiHesapla(worker1);
		workerManagement.bonusHesapla(worker1);
		workerManagement.maasArtısı(worker1);
		workerManagement.bilgileriGetir(worker1);

		System.out.println("------------------------------------------");
		Worker worker2 = new Worker("sevcan", 5000, 45, 2020);

		workerManagement.vergiHesapla(worker2);
		workerManagement.bonusHesapla(worker2);
		workerManagement.maasArtısı(worker2);

		workerManagement.bilgileriGetir(worker2);

	}

}
