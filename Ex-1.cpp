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
    printf("�����빲�м���̨��");
	int n;
	scanf("%d",&n);
	printf("���� %d",fib(n));
	return 0;
}



