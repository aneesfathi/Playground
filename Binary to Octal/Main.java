#include<stdio.h>
int pow_fn(int b,int exp)
{
  int i,s=1;
  for(i=0;i<exp;i++)
  {
    s=s*b;
  }
  return s;
}
int main()
{
 int b,r,s=0,exp=0;
  scanf("%d",&b);
  while(b!=0)
  {
    r=b%10;
    s=s+r*pow_fn(2,exp);
    exp++;
    b=b/10;
}
  int a[100],i=0,j;
  while(s!=0)
  {
    a[i++]=s%8;
    s=s/8;
  }
  for(j=i-1;j>=0;j--)
    printf("%d",a[j]);
}