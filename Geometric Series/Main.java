#include<stdio.h>
int main()
{
 int a,s,n,r,l;
  scanf("%d",&n);
  if(n % 2 == 1)
  {
    a=1;
    r=(n+1)/2;
    s=a*pow(2,r-1);
    printf("%d",s);
  }
  else
  {
    a=1;
    l=n/2;
    s=a*pow(3,l-1);
    printf("%d",s);
  }
  return 0;
}