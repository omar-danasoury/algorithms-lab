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

