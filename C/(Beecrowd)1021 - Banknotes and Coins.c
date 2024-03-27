#include <stdio.h>

int main() {
    int notes, coins;
    double value;

    scanf("%lf", &value);

    printf("NOTAS:\n");
    notes = value / 100;
    value -= notes * 100;
    printf("%d nota(s) de R$ 100.00\n", notes);

    notes = value / 50;
    value -= notes * 50;
    printf("%d nota(s) de R$ 50.00\n", notes);

    notes = value / 20;
    value -= notes * 20;
    printf("%d nota(s) de R$ 20.00\n", notes);
    
    notes = value / 10;
    value -= notes * 10;
    printf("%d nota(s) de R$ 10.00\n", notes);

    notes = value / 5;
    value -= notes * 5;
    printf("%d nota(s) de R$ 5.00\n", notes);

    notes = value / 2;
    value -= notes * 2;
    printf("%d nota(s) de R$ 2.00\n", notes);

    printf("MOEDAS:\n");
    coins = value / 1;
    value -= coins * 1;
    printf("%d moeda(s) de R$ 1.00\n", coins);

    coins = value / 0.5;
    value -= coins * 0.5;
    printf("%d moeda(s) de R$ 0.50\n", coins);

    coins = value / 0.25;
    value -= coins * 0.25;
    printf("%d moeda(s) de R$ 0.25\n", coins);

    coins = value / 0.10;
    value -= coins * 0.10;
    printf("%d moeda(s) de R$ 0.10\n", coins);

    coins = value / 0.05;
    value -= coins * 0.05;
    printf("%d moeda(s) de R$ 0.05\n", coins);

    coins = value / 0.01;
    value -= coins * 0.01;
    printf("%d moeda(s) de R$ 0.01\n", coins);

    return 0;
}