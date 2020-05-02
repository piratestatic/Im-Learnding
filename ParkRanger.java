import java.util.*;
import java.lang.*;


class ParkRanger {

    static String[][] stateCards = { { "Alabama", "Yellowhammer", "Camelia", "false" },
        { "Alaska", "Willow Ptarmigan", "Forget-Me-Not", "false" },
        { "Arizona", "Cactus Wren", "Saguaro Cactus Blossom", "false" },
        { "Arkansas", "Mockingbird", "Apple Blossom", "false" },
        { "California", "California Valley Quail", "Golden Poppy", "false" },
        { "Colorado", "Lark Bunting", "Rocky Mountain Columbine", "false" },
        { "Connecticut", "Robin", "Mountain Laurel", "false" },
        { "Delaware", "Blue Hen Chicken", "Peach Blossom", "false" },
        { "Florida", "Mockingbird", "Orange Blossom", "false" },
        { "Georgia", "Brown Thrasher", "Cherokee Rose", "false" }, { "Hawaii", "Nene", "Hawaiian Hibiscus", "false" },
        { "Idaho", "Mountain Bluebird", "Syringa, mock orange", "false" }, { "Illinois", "Cardinal", "Violet", "false" },
        { "Indiana", "Cardinal", "Peony", "false" }, { "Iowa", "Eastern Goldfinch", "Wild Praire Rose", "false" },
        { "Kansas", "Western Meadowlark", "Sunflower", "false" }, { "Kentucky", "Cardinal", "Goldenrod", "false" },
        { "Louisiana", "Eastern Brown Pelican", "Magnolia", "false" },
        { "Maine", "Chickadee", "Pine Cone and Tassel", "false" },
        { "Maryland", "Baltimore Oriole", "Black-Eyed Susan", "false" },
        { "Massachusetts", "Chickadee", "Mayflower", "false" }, { "Michigan", "Robin", "Apple Blossom", "false" },
        { "Minnesota", "Common Loon", "Pink and White Lady's Slippper", "false" },
        { "Mississippi", "Mockingbird", "Magnolia", "false" }, { "Missouri", "Bluebird", "Hawthorn", "false" },
        { "Montana", "Western Meadowlark", "Bitterroot", "false" },
        { "Nebraska", "Western Meadowlark", "Goldenrod", "false" },
        { "Nevada", "Mountain Bluebird", "Sagebrush", "false" },
        { "New Hampshire", "Purple Finch", "Purple Lilac", "false" },
        { "New Jersey", "Eastern Goldfinch", "Violet", "false" }, { "New Mexico", "Roadrunner", "Yucca Flower", "false" },
        { "New York", "Bluebird", "Rose", "false" }, { "North Carolina", "Cardinal", "Flowering Dogwood", "false" },
        { "North Dakota", "Western Meadowlark", "Wild Praire Rose", "false" },
        { "Ohio", "Cardinal", "Scarlet Carnation", "false" },
        { "Oklahoma", "Scissor-tailed Flycatcher", "Oklahoma Rose", "false" },
        { "Oregon", "Western Meadowlark", "Oregon Grape", "false" },
        { "Pennsylvania", "Ruffed Grouse", "Mountain Laurel", "false" },
        { "Rhode Island", "Rhode Island Red", "Violet", "false" },
        { "South Carolina", "Great Carolina Wren", "Yellow Jessamine", "false" },
        { "South Dakota", "Ring-necked Pheasant", "Pasque Flower", "false" },
        { "Tennessee", "Mockingbird", "Purple Passionflower", "false" },
        { "Texas", "Mockingbird", "Bluebonnet Sp.", "false" }, { "Utah", "Common American Gull", "Sego Lily", "false" },
        { "Vermont", "Hermit Thrush", "Red Clover", "false" }, { "Virginia", "Cardinal", " American Dogwood", "false" },
        { "Washington", "Willow Goldfinch", "Coast Rhododendrum", "false" },
        { "West Virginia", "Cardinal", "Rhododendron", "false" }, { "Wisconsin", "Robin", "Wood Violet", "false" },
        { "Wyoming", "Western Meadowlark", "Indian Paintbrush", "false" } };

  public static void main(String[] args) {
    String userInput;
    Scanner scannerIn = new Scanner(System.in);
    while (true) {
      System.out.printf("Enter a State or None to exit: ");
      userInput = scannerIn.nextLine().trim();
      if (userInput.equalsIgnoreCase("none")) {
        break;
      }

      for (String[] state : stateCards) {
        if (userInput.equalsIgnoreCase(state[0])) {
          System.out.printf("State: %s\nBird: %s\nFlower: %s\n", state[0], state[1], state[2]);
          state[3] = "true";
          break;
        }
      }
    }

    System.out.printf("**** Thank you! *****\n");
    System.out.printf("A summary report for each State, Bird, and Flower is:\n");
    for (String[] state : stateCards) {
      if (state[3] == "true") {
        System.out.printf("%s, %s, %s\n", state[0], state[1], state[2]);
      }
    }

  }
}
