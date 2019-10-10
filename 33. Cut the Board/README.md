Suzumo has a chessboard with N rows and M columns. In one step, he can choose two cells of the chessboard which share a common edge (that has not been cut yet) and cut this edge.

Formally, the chessboard is split into two or more pieces if it is possible to partition its cells into two non-empty subsets S1 and S2 (S1∩S2=∅, |S1|+|S2|=NM) such that there is no pair of cells c1,c2 (c1∈S1,c2∈S2) which share a common edge that has not been cut.

Suzumo does not want the board to split into two or more pieces. Compute the maximum number of steps he can perform while satisfying this condition.

Input
The first line of the input contains a single integer T denoting the number of test cases. The description of T test cases follows.
The first and only line of each test case contains two space-separated integers N and M.
Output
For each test case, print a single line containing one integer — the maximum possible number of steps.

Constraints
1≤T≤64
1≤N,M≤8
Example Input
4
2 4
3 3
6 8
7 5
Example Output
3
4
35
24
Explanation
Example case 1:

See the picture which is uploaded in this file

The edges cut by Suzumo in one optimal solution are marked by red lines.
