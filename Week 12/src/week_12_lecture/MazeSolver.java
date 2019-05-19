package week_12_lecture;
public class MazeSolver
{
	/**
    Prints all solutions to the problem that can be extended from 
    a given partial solution.
    @param sol the partial solution
 */
 public static void solve(MazePartialSolution sol)
 {
    int exam = sol.examine();
    if (exam == 1) 
    { 
       System.out.println(sol); 
    }
    else if (exam != -1)
    {
       for (MazePartialSolution p : sol.extend())
       {
          solve(p);
       }
    }
 
 }
   public static void main(String[] args)
   {
      Maze myMaze = new Maze(
"* *******\n" +
"*     * *\n" +
"* ***** *\n" +
"* * *   *\n" +
"* * *** *\n" +
"*   *   *\n" +
"*** * * *\n" +
"*     * *\n" +
"******* *\n");
      MazeSolver.solve(new MazePartialSolution(myMaze, new Location(3, 3)));
   }
}
