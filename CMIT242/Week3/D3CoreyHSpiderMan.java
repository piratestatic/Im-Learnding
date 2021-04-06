public class D3CoreyHSpiderMan extends D3CoreyHComicBookCharacter {

      //attributes
      private boolean spideySense;  //

      //constructor
      public D3CoreyHSpiderMan(String identity, String characterName, int debut, boolean spideySense) {
            super(identity, characterName, debut);
            this.spideySense = spideySense;
      }

      //get method
      public boolean getSpideySense() {
            return spideySense;
      }

      //set method
      public void setSpideySense(boolean spideySense) {
            this.spideySense = spideySense;
      }

      @Override
      public String toString() {
      return "Spider Man \n secret identity: " + getIdentity() + "\n super hero name: " + getCharacterName() + "\n year debuted = " + getDebut() + "\n Spidey Sense tingling? = " + spideySense + "\n";
      }
}
