package section1;

public class Computer {
	private String manufacturer;
	private String processor;
	private int ramSize;
	private int diskSize;
	private double processorSpeed;
	
	public Computer(String man, String proc, int ram, int disk, double procSpeed) {
		manufacturer = man;
		processor = proc;
		ramSize = ram;
		diskSize = disk;
		processorSpeed = procSpeed;
	}
	
	public double computePower() {
		return ramSize * getProcessorSpeed();
	}

	public int getRamSize() {
		return ramSize;
	}

	public int getDiskSize() {
		return diskSize;
	}

	public double getProcessorSpeed() {
		return processorSpeed;
	}
	
	public String toString() {
		String result =		"Manufacturer: " + manufacturer + 
							"\nCPU: " + processor + 
							"\nRAM: " + ramSize + "MB" +
							"\nDisk: " + diskSize + "GB" + 
							"\nProcessor Speed: " + processorSpeed + "Ghz";
		return result;
	}
}
