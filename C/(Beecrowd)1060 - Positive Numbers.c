#include <stdio.h>

int main() {
    float num; 
    int posit = 0;

    for (int i = 0; i < 6; i++) {
        scanf("%f", &num);
        if (num > 0) {
            posit ++;
        }
    }

    printf("%d valores positivos\n", posit);

    return 0;
}