 #include<stdio.h>
int main()
{
  int n,i,s,p,y=-1,b=-1;
    scanf("%d",&n);
  int a[n];
  for(i=0;i<n;i++)
  {
    scanf("%d",&a[i]);
  }
  scanf("%d%d",&s,&p);
  for(i=0;i<n;i++)
  {
    if(s==a[i] && y==-1)
    {
      y=i;
    }
    if(p==a[i] && b==-1)
    {
       b=i;
    }
  }
   printf("Element 1 index = %d\nElement 2 index = %d",y,b);
}
