// #include <stdio.h>

// int main() {
//     // 2x - 2y + 3z = 2
//     // x + 2y - z  = 3
//     // 3x - y + 2z = 1
//     double a[3][4] = {
//         {2, -2, 3, 2},
//         {1, 2, -1, 3},
//         {3, -1, 2, 1}
//     };
//     int n = 3, i, j, k;
//     double x[3];

//     // Forward elimination
//     for (i = 0; i < n; i++) {
//         // for (k = i + 1; k < n; k++) {
//             double factor = a[k][i] / a[i][i];
//             for (j = 0; j <= n; j++)
//                 a[k][j] -= factor * a[i][j];
//         }
//     }

//     // Back substitution
//     for (i = n - 1; i >= 0; i--) {
//         x[i] = a[i][n];
//         for (j = i + 1; j < n; j++)
//             x[i] -= a[i][j] * x[j];
//         x[i] /= a[i][i];
//     }

//     printf("Solution using Gauss Elimination method:\n");
//     printf("x = %.3lf\n", x[0]);
//     printf("y = %.3lf\n", x[1]);
//     printf("z = %.3lf\n", x[2]);

//     return 0;
// }

#include <stdio.h>
#include <math.h>

double f(double x)
{
    return x * x * x - 5 * x + 1;
}

int main()
{
    double x0 = 0.0, x1 = 1.0, x2;
    int step = 1;

    printf("Secant method for x^3 - 5x + 1 = 0\n");
    printf("Step\tx2\n");

    do
    {
        x2 = x1 - f(x1) * (x1 - x0) / (f(x1) - f(x0));
        printf("%d\t%.6lf\n", step, x2);
        if (fabs(x2 - x1) < 0.0001)
            break;
        x0 = x1;
        x1 = x2;
        step++;
    } while (1);

    printf("\nRoot = %.3lf\n", x2);
    return 0;
}
