  #include<iostream>
  using namespace std;
    int main(){
    int a[] = {1,2,12,6,9,67};
    int length = 6;

    for(int i=0;i<length;i++){
        for(int j=i+1;j<length;j++){
            if(a[j]<=a[i]){
                int temp = a[i];
                a[i] = a[j];
                a[j] = temp;
            }
        }
    }

    //printing the sorted array
    for(int h=0;h<length;h++){
        cout<<a[h]<<" ";
    }
return 0;
    }
