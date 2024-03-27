#include <stdio.h>

int main() {
    int code1, units1, code2, units2;
    float value1, value2, total;

    scanf("%d %d %f", &code1, &units1, &value1);
    scanf("%d %d %f", &code2, &units2, &value2);

    total = units1 * value1 + units2 * value2;

    printf("VALOR A PAGAR: R$ %.2f\n", total);

    return 0;
}