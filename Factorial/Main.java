#include<stdio.h>
int main()
{
long int i,fact=1,a;
  scanf("%ld",&a);
  for(i=1;i<=a;i++)
  {
    fact*=i;
  }
    printf("%ld",fact);
return 0;
}