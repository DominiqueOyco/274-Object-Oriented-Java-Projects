package week_12_lecture;
import java.util.ArrayList;

public class MazePartialSolution 
{
   private Maze theMaze;
   private ArrayList<Location> path;

   public MazePartialSolution(Maze aMaze, Location start)
   {
      theMaze = aMaze;
      path = new ArrayList<Location>();
      path.add(start);
   }

   public MazePartialSolution(MazePartialSolution sol, Location next)
   {
      theMaze = sol.theMaze;
      path = new ArrayList<Location>();
      path.addAll(sol.path);
      path.add(next);
   }

   /**
      Examines a partial solution.
      @return 1 if accepted, 0 if it needs to be extended, or -1 if rejected.
   */
   public int examine()
   {
      Location last = path.get(path.size() - 1);
      if (theMaze.isExit(last))
      {
         return 1; 

      }
      else if (path.size() > 1 && theMaze.emptyNeighbors(last).size() == 1)
         // Dead end
      {
         return -1;  
      }
      else
      {
         return 0;  
      }
   }

   /**
      Yields all extensions of this partial solution.
      @return an array of partial solutions that extend this solution.
   */
   
   //path = [(0,1), (1,1)], last = (1,1), neighbors = [(1,2), (2,1)], result = [this + (1,2), this + (2,1)]
   //MAZE CLASS: result [, (1,2), (0,1), 
   //NEIGHBORS REMOVE LOCATIONS THAT ARE OVERLAPPING WITH PATH
   public MazePartialSolution[] extend()
   {
      Location last = path.get(path.size() - 1);
      ArrayList<Location> neighbors = theMaze.emptyNeighbors(last);
      neighbors.removeAll(path); // Already visited those
      MazePartialSolution[] result = new MazePartialSolution[neighbors.size()];
      for (int i = 0; i < neighbors.size(); i++)
      {
    	  result[i] = new MazePartialSolution(this, neighbors.get(i));
      }
      return result;
   }


public String toString()
   {
      return path.toString();
   }
}
