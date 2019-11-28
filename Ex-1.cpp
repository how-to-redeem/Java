#include<stdio.h>

int fib(int n){
	
	if(n <= 2){
	return 2;
	}
	
	else{
	return fib(n-1)+fib(n-2);
	}
}
int main(){
    printf("请输入共有几级台阶");
	int n;
	scanf("%d",&n);
	printf("答案是 %d",fib(n));
	return 0;
}



