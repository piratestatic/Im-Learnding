public class D5CoreyHSpiderMan extends D5CoreyHComicBookCharacter {

	//attribute
	private float total;
      
	public void catchPhrase() {

        System.out.println("My Spider-Sense is tingling.");
	}
	
	public void numWebCartridges(float amount) {
		System.out.println("Float amount of web cartridges I have:  ");
		total = total + amount;
	}

	public void numWebCartridges(int amount) {
		System.out.println("My total amount including the \"int\" amount cartridges:  ");
		total = total + amount;
	}
	
	public float getTotal() {
		return total;
	}
}

