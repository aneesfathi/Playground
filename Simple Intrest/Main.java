#include<stdio.h>
#include<math.h>
int main()
{
  float p,n,r,s;
  scanf("%f\n%f\n%f\n",&p,&n,&r);
  if(p>r)
  {
    s=(p*n*r)/100;
    printf("%f",s);
  }
  return 0;
}