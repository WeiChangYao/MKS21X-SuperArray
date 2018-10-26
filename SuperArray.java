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
    if (size == data.length){
      resize();
    }
    data[size()] = thing;
    size = size + 1; 
    return true;
  }
  public String toString(){
    String ans = "[";
    for (int i = 0; i < size; i++) {
      if (i > 0) {
        ans += ", ";
        }
      ans += data[i];
    }
    return ans + "]";
  }
  public String toStringDebug(){
    String ans = "[";
    for (int i = 0; i < data.length; i++) {
      if (i > 0) {
        ans += ", ";
        }
      if (data[i] != null){
        ans += data[i];
        }
      else{
        ans += null;
        }
    }  
    return ans + "]";
  }
  public String get(int index){
    if (index < 0 || index > size()){ //I kinda changed that btw
      return null;
    }
    else{
      return data[index];
    }
  }
  public String set(int i, String thing){
    String ans = "";
    if (i < 0 || i > size()){
      return null;
    }
    else{
      ans += data[i];
      data[i] = thing;
    }
    return ans;
  }
  public void resize(){
    String[] data2;
    if (size == data.length){
      data2 = new String[data.length * 2];
      for (int i = 0; i<size; i++){
        data2[i] = data[i];
      }
      data = data2;
    }
  }
  public boolean contains(String target){
    for (int i = 0; i<size ; i++){
      if (data[i].equals(target)){
        return true;
      }    
    }
    return false;
  }
  public int indexOf(String target){
    for (int i = 0; i<size ; i++){
      if (data[i].equals(target)){
        return i;
      }
    }
    return -1;
  }
  public int lastIndexOf(String target){ 
    int lastI = -1;
    for (int i = 0; i<size ; i++){
      if (data[i].equals(target)){
        lastI = i;
      }
    }
    return lastI;
  }
  public void add(int index, String thing){
    //if (index < 0 || index > size) {
      //return null;
    //}  DON'T KNOW HOW TO RETURN ERROR!!!
    if (size() == data.length){
      resize();
    }
    int place = size();
    for (int i = size()-1; data[index] != null; i--){
      data[place] = data[i];
      place--;
    }
    data[index] = thing;
  }
  public String remove(int index){
    if (index < 0 || index >= size()){
      return null;
    }
    String ans = data[index];
    for (int i = index; i < size()-1; i++){
      data[i] = data[i+1];
    }
    data[size()-1] = null;
    return ans;
  }
  public void booRemove(int index){
    for (int i = index; i < size()-1; i++){
      data[i] = data[i+1];
    }
    data[size()-1] = null;
  }
  public boolean remove(String thing){
    for (int i = 0; i < size(); i ++){
      if (data[i] == thing) {
        booRemove(i);
        return true;
      }
    }
    return false;
  }
}
      



