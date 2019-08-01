#include<stdio.h>
#include<string.h>
int main()
{
 char s[100],i,l=0;
  scanf("%[^\n]s",s);
  for(i=0;s[i]!='\0';i++)
  {
    l++;
  }
  printf("%d",l);
  return 0;
}