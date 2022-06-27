import java.util.HashMap;
import java.util.Map;


  public class Recorder {
        private Map<String, String> map = new HashMap<>();

        public void put(String key,String value) {
                map.put(key,value);
                System.out.println(key+"="+value);
        }

        public void get(String key){
                if(!map.equals(key)){
                  IllegalArgumentException e = new IllegalArgumentException();
                  throw e ; 
                }

                System.out.println(map.get(key));
        }
  }

  public void delete(String key){
      if(!map.equals(key)){
        IllegalArgumentException e = new IllegalArgumentException();
        throw e ;
      }
      map.delete(key);
      System.out.println("deleted:" + key);
  }

  public void delete(){
          map.get();
          System.out.println("deleted all");
  }

