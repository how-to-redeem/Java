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
// while(scanf("%d %d",&a,&b)!=EOF)��������ʾ������ctrl+z��ʾ����ʱ�˳�whileѭ��������scanf�����ķ���ֵ���⣬�����кܶ�Ľ��⣬��ʵֻҪ֪���򵥵�һ����У��ú����ķ���ֵ��������ȷ���ȥ�����ĸ�����

