
public class D7CoreyHSpiderMan {
	
	private int numWebCartridges;
	
	public D7CoreyHSpiderMan(int numWebCartridges) {
		
		if (numWebCartridges <= 0) //probably should set a max
			throw new D7CoreyHIllegalSpiderManArgumentException(numWebCartridges);
		
		if (numWebCartridges >= 11) 
			throw new IllegalArgumentException("Whoa even SpiderMan has his limits! "
					+ "The most he can carry is 10.");
		
		this.numWebCartridges = numWebCartridges;
		
	}

	public int getNumWebCartridges() {
		return numWebCartridges;
	}
}
