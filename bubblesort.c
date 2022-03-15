#include <stdio.h>
int main()
{
    int ar[]={10,9,4,2,8,3,6,1};
    int n=8;
    BubbleSort(ar,n);
    return 0;
}

int BubbleSort(int ar[] , int n)
{
    int i,j,temp;
    for(i=0;i<n-1;i++)
    {
        for(j=0;j<n-1-i;j++)
        {
            if(ar[j]>ar[j+1])
            {
                temp=ar[j];
                ar[j]=ar[j+1];
                ar[j+1]=temp;
            }
        }
    }
    for(i=0;i<n;i++)
    {
        printf("%d ",ar[i]);
    }
}
