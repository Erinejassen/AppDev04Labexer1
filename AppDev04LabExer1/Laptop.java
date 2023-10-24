package AppDev04LabExer1;

public abstract class Laptop 
{
	public abstract int getRAM();
	public abstract int getSSD();
	public abstract String getCPU();

	public String toString() {
	 return "RAM="+this.getRAM()+"GB, SSD="+this.getSSD()+", CPU="+this.getCPU();
	 }
}
	class Minimum extends Laptop
	{
		private int ram;
		private int ssd;
		private String cpu;
		
		public Minimum(int ram, int ssd, String cpu)
		{
			  this.ram=ram;
			  this.ssd=ssd;
			  this.cpu=cpu;
		}
		
	public int getRAM() {
		
		return ram;
	}

	public int getSSD() {

		return ssd;
	}

	public String getCPU() {
		
		return cpu;
	}
}
	
	class Recommended extends Laptop
	{
		private int ram;
		private int ssd;
		private String cpu;
		
		public Recommended(int ram, int ssd, String cpu)
		{
			  this.ram=ram;
			  this.ssd=ssd;
			  this.cpu=cpu;
		}
		

	public int getRAM() {
		
		return ram;
	}

	public int getSSD() {

		return ssd;
	}

	public String getCPU() {
		
		return cpu;
	}
}

