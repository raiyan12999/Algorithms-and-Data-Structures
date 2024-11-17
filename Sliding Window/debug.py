import time

# Sample data for testing
nums = [1, 2, 3, 4, 5, 6, 7, 8, 9, 10] * 500  # Larger list for more noticeable timing difference
k = 3

# Version 1: Direct Range Iteration without Slicing
start_time = time.time()  # Record the start time

count = 0
for start in range(len(nums)):
    end = start
    while end < len(nums):
        score = 0
        for i in nums[start:end + 1]:  # Direct iteration without creating a new list
            if i % 2 != 0:
                score += 1
        if score == k:
            count += 1
        end += 1

end_time = time.time()  # Record the end time
print("Execution Time (Direct Iteration):", end_time - start_time, "seconds")

# Version 2: Explicit Slicing to Create a New List
start_time = time.time()  # Record the start time

count = 0
for start in range(len(nums)):
    end = start
    while end < len(nums):
        subarray = nums[start:end + 1]  # Explicit slicing to create a new list
        score = 0
        for i in subarray:
            if i % 2 != 0:
                score += 1
        if score == k:
            count += 1
        end += 1

end_time = time.time()  # Record the end time
print("Execution Time (Explicit Slicing):", end_time - start_time, "seconds")
