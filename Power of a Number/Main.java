#include <stdio.h>
int main()
{
 int a,b,s=1,i;
  scanf("%d%d",&a,&b);
  if(b>=0)
  {
    for(i=0;i<b;i++)
    {
      s=s*a;
    }
    printf("%d",s);
  }
  else
    printf("Wrong input");
   return 0;
}