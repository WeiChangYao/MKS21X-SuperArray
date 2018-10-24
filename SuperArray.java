public class SuperArray{
  private String[] data;
  private int size;
  public SuperArray(){
    size = 0;
    data = new String[10];
  }
  public void clear(){
    size = 0;
    data = new String[10];
  }
  public int size(){
    return size;
  }
  public boolean isEmpty(){
    return (size() == 0);
  }
  public boolean add(String thing){
    data[size()] = thing;
    size = size + 1; 
    return true;
  }
  public String toString(){
    for (int i = 0; i < size; i++) {
      if (i > 0) {
        return ", ";
        }
      return data[i];
    }
  }
  public String get(int index){
    if (index < 0 || index > size()){ //I kinda changed that btw
      return null;
    }
    else{
      return data[index];
    }
  }
  public String set(int index, String thing){
    if (index < 0 || index > size()){
      return null;
    }
    else{
      return get(index);
      data[index] = thing;
    }
  }
}
      

