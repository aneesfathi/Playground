#include<stdio.h>
int main()
{
 int a,b,c;
  scanf("%d\n%d\n%d\n",&a,&b,&c);
    if(b>a&&b<c)
    {
      printf("%d",b);
}
else if(a>b&&b<c)
{
    printf("%d",a);
}
else
printf("%d",c);
  return 0;
}