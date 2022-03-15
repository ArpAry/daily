#include <stdio.h>
int main()
{
   int ar[]={9,8,7,1,4,6,5,2,0};
  insertionSort( ar , 9);
}

void insertionSort(int ar[] , int n)
{
    int i,j,temp;
    for(i=1;i<n;i++)
    {
        j=i;
        while(j>0&&ar[j]<ar[j-1])
        {
            temp=ar[j-1];
            ar[j-1]=ar[j];
            ar[j]=temp;
            j--;          
        }
    }
    for(i=0;i<n;i++)
        printf("%d  ",ar[i]);
}