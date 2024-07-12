# JS - Kata DNI

Perform the following exercise without object orientation or with object orientation (second option recommended).
Calculate the letter of the DNI (National Identity Card).

## The algorithm for calculating the letter of the DNI is as follows :

The number must be between 0 and 99999999
We take the complete number of up to 8 digits of our DNI, we divide it by 23 and we keep the remainder of this division (module 23).
According to the result, from 0 to 22, one of the following letters will correspond: (T, R, W, A, G, M, Y, F, P, P, D, X, B, N, J, Z, S, Q, V, H, L, C, K, E).
If the data entered is not a number, a message "the data entered is incorrect" should be displayed and a new prompt should be sent.
The process must be repeated until the user presses "cancel".

## Requirements:

- Unit tests of the function that calculates the letter should be performed.

Translated with DeepL.com (free version)