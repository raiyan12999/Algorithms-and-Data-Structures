#include <iostream>
#include <deque>

using namespace std;

int main()
{

    int stem = 0;
    deque<int> base = {2, 4, 5, 6, 4, 6};
    deque<int> empty = {};

    for (int i = 0; i < 3; i++)
    {
        empty.push_back(base[i]);
    }

    // code

    return 0;
}