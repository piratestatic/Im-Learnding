public class A4CoreyHMovieDVD extends A4CoreyHMedia {

      // local attributes
      private double size;  // value in MB

      // constructor
      public A4CoreyHMovieDVD(int id, String title, int year, double size, boolean available) {
            super(id, title, year, available);
            this.size = size;
      }

      // get method
      public double getSize() {
            return size;
      }

      // set method
      public void setSize(double size) {
            this.size = size;
      }

      // inherits calculate rental fee method and no different calculation so should not override

      @Override
      public String toString() {
      return "MovieDVD [ id=" + getId() + ", title=" + getTitle() + ", year=" + getYear() + ", size=" + size + "MB]";
      }
}
