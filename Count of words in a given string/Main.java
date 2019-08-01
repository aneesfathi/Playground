#include<stdio.h>

int main()
{
  char s[100];
  int i,w=0;
  scanf("%[^\n]s",s);
  for(i=0;s[i]!='\0';i++)
  {
    if(s[i]==' ')
    {
      w++;
    }
  }
    w++;
    printf("%d",w);
  return 0;
}