public class D3CoreyHBatman extends D3CoreyHComicBookCharacter {

      // local attributes
      private int numBatarang;  //

      // constructor
      public D3CoreyHBatman(String identity, String characterName, int debut, int numBatarang) {
            super(identity, characterName, debut);
            this.numBatarang = numBatarang;
      }

      // get method
      public int getNumBatarang() {
            return numBatarang;
      }

      // set method
      public void setNumBatarang(int numBatarang) {
            this.numBatarang = numBatarang;
      }

      @Override
      public String toString() {
      return "Batman: \n secret identity = " + getIdentity() + "\n super hero name: " + getCharacterName() + "\n year he debuted: " + getDebut() + "\n number of batarangs in his utility belt: " + numBatarang + "\n";
      }
}
