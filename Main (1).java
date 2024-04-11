class Main{
  public static void moon() {
    System.out.print("glow");
  }
  public static void winter(int temp) {
    if(temp > -80){
      System.out.print(" )) ");
      temp -= 1;
      winter(temp);
    }
  }
  public static void main( String [] args){
    winter(91);
    moon();
  }
}