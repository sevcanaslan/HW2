
public class WorkerManagement {
public  void vergiHesapla(Worker worker) {
		
		if(worker.getSalary()<worker.getSalaryLimit()) {
			
		}
		else {
			double vergiMiktar=(worker.getSalary()*worker.getTax());
			worker.setVergiMiktari(vergiMiktar);

		}
	}
	
	
	public void bonusHesapla(Worker worker) {
		
		if(worker.getWorkHours()>40) {
			int bonusMiktari= (worker.getWorkHours()-40)*worker.getBonus();
			worker.setBonusMiktari(bonusMiktari);
		}
		else {
		}
		
	}
	

	public void maasArtısı(Worker worker) {
		int calisilanYil= worker.getYil()-worker.getHireYear();
		if(calisilanYil<=10) {
			double artisMiktari= worker.getSalary()*(0.05);
			worker.setArtisMiktari(artisMiktari);
		}
		else if(calisilanYil>10 && calisilanYil<20) {
			double artisMiktari= worker.getSalary()*(0.1);
			worker.setArtisMiktari(artisMiktari);
			double guncelMaas= worker.getSalary()+ artisMiktari;
			 worker.setSalary(guncelMaas);
		}
		else {
			double artisMiktari= worker.getSalary()*(0.15);
			worker.setArtisMiktari(artisMiktari);
		}
	}
	
	
	/*
	Adı : Ahmet
	Maaşı : 3000.0
	Çalışma Saati : 65.0
	Başlangıç Yılı : 1995
	Vergi : 90.0
	Bonus : 750.0
	Maaş Artışı : 450.0
	Vergi ve Bonuslar ile birlikte maaş : 3660.0
	Toplam maaş : 4110.0
	*/

	public void bilgileriGetir(Worker worker) {
		
		double maas= worker.getSalary()+worker.getBonusMiktari()-worker.getVergiMiktari();
		double genelToplamMaas=  worker.getSalary()+worker.getBonusMiktari()+worker.getArtisMiktari()-worker.getVergiMiktari();
		System.out.println("Adı : "+ worker.getWorkerName()+ "\nMaaşı : " + worker.getSalary()+ "\nÇalışma Saati : "+ worker.getWorkHours()+
				"\nBaşlangıç Yılı : " + worker.getHireYear()+ "\nVergi : "+ worker.getVergiMiktari()+ "\nBonus : " + worker.getBonusMiktari()+
				"\nMaaş Artışı : " + worker.getArtisMiktari()+"\nVergi ve Bonuslar ile birlikte maaş : " + maas+ "TL"+
				"\nToplam maaş : " + genelToplamMaas+ "TL") ;
	}
	
}
