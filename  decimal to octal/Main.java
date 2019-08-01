#include<stdio.h>
int main()
{
  int b,i=0;
 int  a[234];
  scanf("%d",&b);
  while(b!=0)
  {
    a[i++]=b%8;
    b=b/8;
  }
    for(i=i-1;i>=0;i--)
    {
      printf("%d",a[i]);
    }
  return 0;
}