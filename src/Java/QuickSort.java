 public class QuickSort { 
  
  public static void sort(int[] array) {
    sort(array, 0, array.length);
  }
  
  private static void sort(int[] array, int lo, int hi) {
    if(lo < hi - 1) {
      int p = partition(array, lo, hi);
      sort(array, lo, p);
      sort(array, p, hi);
    }
  }
  
  private static int partition(int[] array, int lo, int hi) {
    int pivot = array[hi - 1];
    
    int i = lo;
    for(int j = lo; j < hi; j++) {
      if(array[j] < pivot) {
        int aux = array[i];
        array[i] = array[j];
        array[j] = aux;
        i++;
      }
    }
    
    int aux = array[i];
    array[i] = array[hi - 1];
    array[hi - 1] = aux;
    
    
    return i;
  }

 }
 
