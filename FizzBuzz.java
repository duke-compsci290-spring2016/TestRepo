public class FizzBuzz {
  public static void main(String[] args) {
    if(args.length == 0 || args.length > 1){
      System.out.println("Incorrect number of arguments!");
    }else{
      int num = Integer.parseInt(args[0]);
      for(int i = 1; i <= num; i++ ){
           System.out.println(i);
      } 
    }
  }
} 
