#include<stdio.h>
#include<math.h>
int main()
{
  float a,b,h;
  scanf("%f%f",&b,&a);
  h=sqrt((a*a)+(b*b));
  printf("%.2f",h);
  return 0;
}