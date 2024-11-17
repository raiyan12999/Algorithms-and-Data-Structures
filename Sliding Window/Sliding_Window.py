arr = [2, 5, 6, 2, 6, 7, 8]

length = len(arr)

k = 3 # Size of the window

# arr[a:b] a inclusive and b exclusive

# Fixed Sized Sliding Window
left = 0
while left <= (length - k):
    right = left + k
    print(arr[left:right])
    left += 1

# Variable Sized Sliding Window
for start in range(length):
    end = start
    while end < length:
        print(arr[start:end + 1])
        end += 1 

print(arr)
