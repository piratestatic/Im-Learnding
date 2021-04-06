public abstract class D3CoreyHComicBookCharacter {

      // attributes
      private String identity;
      private String characterName;
      private int debut;

      // constructor
      public D3CoreyHComicBookCharacter(String identity, String characterName, int debut) {

            this.identity = identity;
            this.characterName = characterName;
            this.debut = debut;
            }

            // get methods
            public String getIdentity() {
                  return identity;
            }

            public String getCharacterName() {
                  return characterName;
            }

            public int getDebut() {
                return debut;
            }
            // set methods
            public void setCharacterName(String characterName) {
                  this.characterName = characterName;
            }

            public void setDebut(int debut) {
                this.debut = debut;
            }
  }
