#include<stdio.h>
int main()
{
  int a,n,i,s=0;
  scanf("%d",&a);
  for(i=0;i<3;i++)
  {
  n=(a%10);
  s=s+n;
    a=a/10;
  }
  printf("%d",s);
  return 0;
}