#include <stdio.h>
#include <stdlib.h>

int main()
{
    int i=0,j,a,b,sum[100]={0};
    while(scanf("%d %d",&a,&b)!=EOF){
        sum[i]=a+b;
        i++;
    }
    for(j=0;j<i;j++){
        printf("%d\n",sum[j]);
    }
    return 0;
}
// while(scanf("%d %d",&a,&b)!=EOF)这条语句表示当输入ctrl+z表示结束时退出while循环！关于scanf函数的返回值问题，网上有很多的讲解，其实只要知道简单的一点就行，该函数的返回值就是你正确输进去的数的个数。

