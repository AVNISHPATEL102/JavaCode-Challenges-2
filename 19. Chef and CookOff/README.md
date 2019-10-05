Chef has obtained the results of a past Cook-Off. He wants to estimate the skill level of each contestant. The contestants can be classified with high probability (w.h.p.) based on the number of solved problems:

A contestant that solved exactly 0 problems is a beginner.

A contestant that solved exactly 1 problem is a junior developer.

A contestant that solved exactly 2 problems is a middle developer.

A contestant that solved exactly 3 problems is a senior developer.

A contestant that solved exactly 4 problems is a hacker.

A contestant that solved all five problems is Jeff Dean.

Please help Chef to identify the programming level of each participant.



Input

The first line of the input contains a single integer N denoting the number of competitors.
N lines follow. The i-th of these lines contains five space-separated integers Ai, 1, Ai, 2, Ai, 3, Ai, 4, Ai, 5. The j-th of these integers (1 ≤ j ≤ 5) is 1 if the i-th contestant solved the j-th problem and 0 otherwise.

Output

For each participant, print a single line containing one string denoting Chef's classification of that contestant — one of the strings "Beginner", "Junior Developer", "Middle Developer", "Senior Developer", "Hacker", "Jeff Dean" (without quotes).

Constraints

1 ≤ N ≤ 5000

0 ≤ Ai, j ≤ 1 for each valid i, j

Example

Input:

7

0 0 0 0 0

0 1 0 1 0

0 0 1 0 0

1 1 1 1 1

0 1 1 1 0

0 1 1 1 1

1 1 1 1 0

Output:

Beginner

Middle Developer

Junior Developer

Jeff Dean

Senior Developer

Hacker

Hacker
