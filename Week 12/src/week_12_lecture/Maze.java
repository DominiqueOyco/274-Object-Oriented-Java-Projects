package week_12_lecture;

import java.util.ArrayList;

public class Maze
{
   private char[][] cells;

   /**
      Constructs a maze from a string describing its contents.
      @param contents a string consisting of *, spaces, and newlines 
      terminating the rows.
   */
   public Maze(String contents)
   {
      int rows = 0;
      int columns = 0;
      int currentLength = 0;
      for (int i = 0; i < contents.length(); i++)
      {
         if (contents.charAt(i) == '\n')
         {
            columns = Math.max(columns, currentLength);
            currentLength = 0;
            rows++;
         }
         else
         {
            currentLength++;
         }
      }
      cells = new char[rows][columns];
      int row = 0;
      int column = 0;
      for (int i = 0; i < contents.length(); i++)
      {
         if (contents.charAt(i) == '\n')
         {
            row++;
            column = 0;
         }
         else
         {
            cells[row][column] = contents.charAt(i);
            column++;
         }
      }
   }

   public ArrayList<Location> emptyNeighbors(Location loc)
   {
      ArrayList<Location> result = new ArrayList<Location>();
      result.add(new Location(loc.getRow(), loc.getColumn() - 1));
      result.add(new Location(loc.getRow(), loc.getColumn() + 1));
      result.add(new Location(loc.getRow() - 1, loc.getColumn()));
      result.add(new Location(loc.getRow() + 1, loc.getColumn()));

      for (int i = result.size() - 1; i >= 0; i--)
      {
         if (!isEmpty(result.get(i))) result.remove(i);
      }
      return result;      
   }

   /**
      Checks whether a location is an exit.
      @param loc the location
      @return true if the location is an exit
   */
   
   //AN LOCATION IS AN EXIT IF: A. THE LOCATION IS EMPTY, B. IF IT IS AT THE BORDER OF THE MAZE(FIRST/LAST COLUMN AND FIRST/LAST ROWS)
   public boolean isExit(Location loc)
   {
	   int numRow = cells.length;
	   int numColumn = cells[0].length;
	     
	   if(loc.getRow() == numRow - 1 || loc.getRow() == 0){
		   return true;
	   }
	   
	   else if(loc.getColumn() == numColumn - 1 || loc.getColumn() == 0){
		   return true;
	   }

	   else{
		   return false;
	   }

   }

   /**
      Checks whether a location is within the maze.
      @param loc the location
      @return true if the location is valid
   */
   
   public boolean isValid(Location loc)
   {
	   int numRow = cells.length;
	   int numColumn = cells[0].length;
	   
	   int allowedRows = cells.length - 1;
	   int allowedColumns = cells[0].length - 1;
	     
	   if(loc.getRow() <= allowedRows && loc.getColumn() <= allowedColumns && loc.getRow() >= 0 && loc.getColumn() >= 0){
		   return true;
	   }

	   else{
		   return false;
	   }

   }

   /**
      Checks whether a location is within the maze and not a wall.
      @param loc the location
      @return true if the location is empty
   */
   public boolean isEmpty(Location loc)
   {	    
	  if(isValid(loc)){
		  return cells[loc.getRow()][loc.getColumn()] != '*';
	  }
	  else{
		  return false;
	  }
   }
}

