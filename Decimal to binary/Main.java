#include<stdio.h>
int main()
{
  int b,i,c=0;
 int  a[234];
  scanf("%d",&b);
  while(b!=0)
  {
    a[c++]=b%2;
    b=b/2;
  }
    for(i=c-1;i>=0;i--)
    {
      printf("%d",a[i]);
    }
  return 0;
}