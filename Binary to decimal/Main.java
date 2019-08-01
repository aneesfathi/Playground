#include<stdio.h>
int main()
{
  int sum=0,i,n,r;
  scanf("%d",&n);
 while(n!=0)
  {
    r=n%10;
  sum=sum+r*pow(2,i);
  n=n/10;
   i++;
}
  printf("%d",sum);
  return 0;
}