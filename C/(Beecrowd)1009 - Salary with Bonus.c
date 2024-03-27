#include <stdio.h>

int main() {
    char sellersName[20];
    double fixedSalary, totalSales, total;

    scanf("%s", &sellersName);
    scanf("%lf", &fixedSalary);
    scanf("%lf", &totalSales);

    total = fixedSalary + (totalSales * 0.15);

    printf("TOTAL = R$ %.2lf\n", total);

    return 0;
}