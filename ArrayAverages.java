import java.util.Arrays;

public class ArrayAverages{
  
  int[][] ray;

  public ArrayAverages(int[][] rayray){
    ray = rayray;
    

  }

  public void rowAverages(){
   for(int row = 0; row<ray.length; row++)
   {
    for(int col = 0; col<ray[row].length; col++)
    {
      
    }
   }
  }

  public void columnAverages(){

  }

  public void arrayAverage(){

  }

  public String toString(){
    for(int row=0; row<ray.length; row++)
    {
      System.out.println(Arrays.toString(ray[row]));
    }
    return "";
  }
}
