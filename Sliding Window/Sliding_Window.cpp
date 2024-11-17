// #include <iostream>
// #include <deque>

// using namespace std;

// int main()
// {

//     int stem = 0;
//     deque<int> base = {2, 4, 5, 6, 4, 6};
//     deque<int> empty = {};

//     for (int i = 0; i < 3; i++)
//     {
//         empty.push_back(base[i]);
//     }

//     for (int i = 0; i < 4; i++)
//     {
//         cout << empty[i] << "";
//     }

//     // for (int j = 0; j < 4; j++){

//     // }

//     return 0;
// }

#include <iostream>
#include <vector>

using namespace std;

int main()
{
    vector<int> arr = {2, 5, 6, 2, 6, 7, 8};
    int length = arr.size();

    for (int start = 0; start < length; ++start)
    {
        for (int end = start; end < length; ++end)
        {
            for (int k = start; k <= end; ++k)
            {
                cout << arr[k] << " ";
            }
            cout << endl;
        }
    }

    return 0;
}
