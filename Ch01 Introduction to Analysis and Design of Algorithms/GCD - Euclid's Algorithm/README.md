# GCD - Euclid's Algorithms
Euclid's Algorithm is a simple one to find the ***gcd*** (greatest common divisor) ***between two non-negative, not-both-zreo numbers***.

This section is to understand the idea of an algorithms, as well as to practice writing psuedocode for the Euclid's algorithm to solve it ***Recursively and Iteratively***.

## Euclid's Algorithm (Recursively)
First, we write the psuedocode as follows.

### Psudocode of Euclid's Algorithm (Recursively)
**Algorithm** Euclid(m,n)  
&emsp; **Input**: Two non-negative, not both zero integers **m** and **n**.  
&emsp; **Output**: The greatest common divisor between m and n.  
&emsp;If n = 0  
&emsp;&emsp; return m  
&emsp;else return Euclid(n, m mod n)

### Java code of Recursive Euclid's Algorithm
The code can be found in [Euclid.java](https://github.com/omar-danasoury/algorithms-lab/blob/main/Ch01%20Introduction%20to%20Analysis%20and%20Design%20of%20Algorithms/GCD%20-%20Euclid's%20Algorithm/Euclid.java).

```
/**
* Applies the algorithm of Euclid's to solve the gcd
* problem recursively.
* The psueodocode can be found at ../README.md.
*
* @param m first non-negative integer, m != 0 if n = 0.
* @param n second non-negative integer, n != 0 if m = 0.
* @return greatest common divisor between m and n
*/
public int recursive_gcd(int m, int n){
    if(n == 0)
        return m;
       
    return recursive_gcd(n, m % n);
}
```
