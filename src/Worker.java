
public class Worker {
	
	
	//Sınıfın attributeleri
		//name, salary, workHours(Çalıştığı saat), hireYear(İşe Giriş Yılı)
		//tax(vergi), bonus(mesai ücreti)
		//salaryRaise(Maaş artırımı)
		
		private String workerName;
		private double Salary;
		private int workHours;
		private int hireYear;
		private double vergiMiktari;
		private double bonusMiktari;
		private double artisMiktari;
		private double tax = 0.05;
		private int bonus = 30;
		private int yil =2022;
		private int salaryLimit = 2000;
		
		
		public Worker(String workerName, double salary, int workHours, int hireYear) {
			super();
			this.workerName = workerName;
			Salary = salary;
			this.workHours = workHours;
			this.hireYear = hireYear;
		}
		
		
		public double getVergiMiktari() {
			return vergiMiktari;
		}
		
		
		
		public void setVergiMiktari(double vergiMiktari) {
			this.vergiMiktari = vergiMiktari;
		}
		
		
		
		public double getBonusMiktari() {
			return bonusMiktari;
		}


		public void setBonusMiktari(double bonusMiktari) {
			this.bonusMiktari = bonusMiktari;
		}


		public double getArtisMiktari() {
			return artisMiktari;
		}


		public void setArtisMiktari(double artisMiktari) {
			this.artisMiktari = artisMiktari;
		}


		public String getWorkerName() {
			return workerName;
		}
		public void setWorkerName(String workerName) {
			this.workerName = workerName;
		}
		public double getSalary() {
			return Salary;
		}
		public void setSalary(double salary) {
			Salary = salary;
		}
		public int getWorkHours() {
			return workHours;
		}
		public void setWorkHours(int workHours) {
			this.workHours = workHours;
		}
		public int getHireYear() {
			return hireYear;
		}
		public void setHireYear(int hireYear) {
			this.hireYear = hireYear;
		}
		public double getTax() {
			return tax;
		}
		public void setTax(double tax) {
			this.tax = tax;
		}
		public int getBonus() {
			return bonus;
		}
		public void setBonus(int bonus) {
			this.bonus = bonus;
		}
		public int getSalaryLimit() {
			return salaryLimit;
		}
		public void setSalaryLimit(int salaryLimit) {
			this.salaryLimit = salaryLimit;
		}
		public int getYil() {
			return yil;
		}
		public void setYil(int yil) {
			this.yil = yil;
		}
		
		

}
