#include<stdio.h>
int main()
{
  int i,n,v;
  scanf("%d",&n);
  int a[n];
  for(i=0;i<n;i++)
  {
    scanf("%d",&a[i]);
  }
  scanf("%d",&v);
  for(i=0;i<n;i++)
  {
    if(a[i]==v)
    {
      printf("%d",i+1);
    return 0;
    }
  }
    printf("%d isn't present in the array.",v);
   return 0;
}