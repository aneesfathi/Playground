#include<stdio.h>
int main()
{
int num,n_term1,n_term2,sum=0,rem1,rem2,t,h;
  scanf("%d",&num);
  if(num%2 == 1)
  {
    rem1= (num+1)/2;
    t=sum+(rem1-1)*2;
  printf("%d",t);
  }
  else
  {
    rem2=(num/2);
    h=sum+(rem2-1)*1;
    printf("%d",h);
  }
  return 0;
}