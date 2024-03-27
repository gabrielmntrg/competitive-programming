#include <stdio.h>

int main() {
    int a, b, c, greatest;

    scanf("%d %d %d", &a, &b, &c);
    greatest = (a > b) ? a : b;
    greatest = (c > greatest) ? c : greatest;
    
    printf("%d eh o maior\n", greatest);

    return 0;
}