package week_12_lecture;

/**
   A location in a maze.
*/
public class Location
{
   private int row;
   private int column;

   /**
      Constructs a location.
      @param row the row
      @param column the column
   */
   public Location(int row, int column)
   {
	   this.row = row;
	   this.column = column;
   }

   /**
      Gets the row of this location
      @return the row
   */
   public int getRow()
   {
	   return this.row;
   }

   /**
      Gets the column of this location
      @return the column
   */
   public int getColumn()
   {
	   return this.column;
   }

   public String toString()
   {
      return "(" + row + "," + column + ")";
   }

   public boolean equals(Object otherObject)
   {
      Location other = (Location) otherObject;
      if(this.row == other.row && this.column == other.column){
    	  return true;
      }
      
      else{
    	  return false;
      }

   }
}

