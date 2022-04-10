import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;

public class A4CoreyHManager {
	
    // attribute
	//stores a list of Media objects
    private ArrayList<A4CoreyHMedia> mediaObjects;
    
    // default constructor
    public A4CoreyHManager() {
       
        // initialize empty mediaObjects list
        mediaObjects = new ArrayList<A4CoreyHMedia>();
    }
    
    // load all Media files from directory; assumes file name convention starts with Media type Ebook, MovieDVD or MusicCD 
    // If directory is not found, it will throw exception
    public A4CoreyHManager(String directory) throws FileNotFoundException {
       
        // initialize empty mediaObjects list
        mediaObjects = new ArrayList<A4CoreyHMedia>();
       
        // Create a File object for directory
        File directoryPath = new File(directory);
       
        // Get list of all files and directories
        File fileslist[] = directoryPath.listFiles();
       
        if (fileslist == null)
            throw new FileNotFoundException("Could not load, no such directory");
       
        // declare local variables
        A4CoreyHMedia media = null;
        String line = null;
        Scanner scan = null;
       
        // Process each Media file
        for (File file : fileslist) {
           
            // parse files whose filename starts with "Ebook" or "MovieDVD"
            if (file.getName().contains("Ebook") || file.getName().contains("MovieDVD") || file.getName().contains("MusicCD")) {

                // open and read line (assumes whole object is stored on single line)
                scan = new Scanner(file);
                line = scan.nextLine();   // assumes the file is not empty
               
                // if Ebook object than call Ebook constructor
                if (file.getName().contains("Ebook")) 
                    //media = new EBook(line);       
                
                // if MovieDVD object than call MovieDVD constructor
                if (file.getName().contains("MovieDVD")) 
                    //media = new MovieDVD(line);     
               
                // if MusicCD object than call MusicCD constructor
                if (file.getName().contains("MusicCD")) 
                    //media = new MusciCD(line);
                // add Media object to mediaObjects attribute
                mediaObjects.add(media);
            }
        }
    }
    
    // creates (or overwrites) a file for each Media object in mediaObjects attribute in the given directory
    public void createMediaFiles(String directory) throws IOException {
       
        PrintWriter out = null;
       
        // for all Media objects create files using Media type and id value as filename
        for (int i=0; i < mediaObjects.size(); i++) {
            String filename = directory + "/" + mediaObjects.get(i).getClass().getSimpleName() + "-" + mediaObjects.get(i).getId() + ".txt";
            out = new PrintWriter(new FileWriter(filename));  // create/overwrite file
            out.println(mediaObjects.get(i).toString());  // write the Media's data
            out.flush();      // flush all the data to the file
            out.close();    // close the stream
        }
}
    
    // display all stored mediaObjects on console
    public void displayAllMedia() {
       
        // for all Media objects display the xml tag data
        for (int i=0; i < mediaObjects.size(); i++) {
            System.out.println(mediaObjects.get(i).toString());
        }
    }
    
    // add Media object
    public void addMedia(A4CoreyHMedia media) {
        mediaObjects.add(media);
    }
	
}

