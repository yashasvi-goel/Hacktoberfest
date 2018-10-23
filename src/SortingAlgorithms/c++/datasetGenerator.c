#include <stdio.h>
#include <stdlib.h>
int main()
{
	int *a;
	int m=10000;
	a=(int*)malloc(m*sizeof(int));
	printf("%d\n",m);
	for(int i=0;i<m;i++)
	{
		a[i]=rand();
	}
	for(int i=0;i<m;i++)
		printf("%d\n",a[i]);
	return 0;
}
