/** abstract class to represent a generic media*/

public abstract class Media {
      // attributes
      private int id;
      private String title;
      private int year;  // validate that 4 digits
      
      //Add an attribute to Media class to store indication when 
      //media object is rented versus available.
      private boolean available;

      // constructor
      public Media(int id, String title, int year) {

            this.id = id;
            this.title = title;
            this.year = year;
            this.object = object;
            }

   /*   
   // constructor to parse string with xml tags for its values
      public Pet(String line) {
          id = Integer.parseInt(line.substring(line.indexOf("<id>") + 4, line.indexOf("</id>")));
          name = line.substring(line.indexOf("<name>") + 6, line.indexOf("</name>"));
      }
      */
      
      
      
            // get methods
      		//Add code to constructor to create get and set methods as appropriate. 
			public boolean isAvailable() {
				return available;
			}
			
            public int getId() {
            	if (!available)
            		System.out.println("\n The media object" + getId() + "is currently not available"); 
                  return id;
            }

            public String getTitle() {          	
            	if (!available)
            		System.out.println("\n The media object" + getTitle() + "is currently not available"); 
            	return title;
            }

            public int getYear() {
                  return year;
            }

            // set methods
            //public void setTitle(String title) {
            //      this.title = title;
            //}

            public void setYear(int year) {
                  this.year = year;
            }

            public void mediaAvailable() {
            	if(available)
            		System.out.println("\nmedia object is available");
            	else
            		available = true;
            }
            
            public void notAvailable() {
            	if(!available)
            		System.out.println("\nMedia Object is not available");
            	else
            		available = true;
            }
            
            public void rentMedia() {
            	if (!available)
            		System.out.println ("\nCan't rent Media Object - currently unavailable");
            	else
            		System.out.println(toString());
            			
            }
             public void loadMedia() {
            	 System.out.println ("\nNothing Happens Right now");
            }
             
             public void findMedia() {
            	 System.out.println ("\nNothing Happens Right now");
             }
            // calculate rental fee; for generic media it is flat fee $3.50
            public double calculateRentalFee() {
                  return 3.50;
            }
            
				
      }
