public class QuickSort{
              
              public int[] sort(int[] a, int low, int high){
                                int i = low;
                                int j = high;
                                int pivotKey = a[low];
                                if(low > high){
                                  return null;
                                }
                                while(i<j){                //双向比较
                                            while(i<j && a[j]>=pivotKey){  //从高到低
                                                       j--;
                                            }
                                            while(i<j && a[i]<=pivotKey){  //从低到高
                                                       i++;
                                            }
                                            if(i!=j){
                                                       a[i] ^= a[j];
                                                       a[j] ^= a[i];
                                                       a[i] ^= a[j];
                                            }
                                       }
                                      a[low] = a[i];
                                      a[i] = pivotKey;
                                      this.sort(a, low; i-1);
                                      this.sort(a, i+1; high);
                                          return a;
              }
               
              public static int randomNumber(int min, int max){            //产生min到max的随机数
                             return Math.floor(Math.random()*(max-min)+min);
              }
              public static void main(String[] args){
                            QuickSort quick = new QuickSort();      
                            int[] a = new int[10];
                            for(int i = 0;i<a.length;i++){
                                       a[i] = quick.randomNumber(-10,10);
                            }
                            Arrays.toString(quick.sort(a,0,a.length-1));
              }
}
