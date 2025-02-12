public class Gee17{
  public static void main(String[] args){

int[][] ray = new int[7][7];

//populate the array with sequential numbers
// 1 2 3 4 5 6 7
// 8 9 10 11 12 13 14
//15 16 17 18 19 20 21
//22 23 24 25...
ray[0][0] = 1;
ray[0][1] = 2;
ray[0][2] = 3;
ray[1][0] = 4;
ray[1][1] = 5;
ray[1][2] = 6;
ray[2][0] = 7;
ray[2][1] = 8;
ray[2][2] = 9;
ray[2][3] = 10;


ArrayAverages twoDee = new ArrayAverages();
System.out.println(twoDee);
    twoDee.rowAverages();
    twoDee.columnAverages();
    twoDee.arrayAverage();
  }
}
