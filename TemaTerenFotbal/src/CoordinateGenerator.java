import java.util.Random;
import java.util.Date;

      class CoordinateGenerator {
       	   private static Random randomGenerator;
           public CoordinateGenerator() {
           Date now = new Date();
           long sec = now.getTime();
           randomGenerator = new Random(sec);
}
           
      public static int generateX() {
      int x = (int) (Math.random()*100);
      if (x==99)
    	  x++;
      return x;
}
    public static int generateY() {
      int y = (int) (Math.random()*50);
      if (y==99)
    	  y++;
      return y;
    }
}