#include<stdio.h>
int main()
{
 int i,a=0,b=1,num,c;
  scanf("%d",&num);
  printf("%d %d ",a,b);
  for(i=2;i<num;i++)
  {
    c=a+b;
    a=b;
    b=c;
    printf("%d ",c);
  }
  return 0;
}