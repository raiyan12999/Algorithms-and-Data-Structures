#include <stdio.h>

int main()
{
    int arr[] = {2, 5, 6, 2, 6, 7, 8};
    int length = sizeof(arr) / sizeof(arr[0]);

    for (int start = 0; start < length; start++)
    {
        for (int end = start; end < length; end++)
        {
            for (int k = start; k <= end; k++)
            {
                printf("%d ", arr[k]);
            }
            printf("\n");
        }
    }

    return 0;
}
