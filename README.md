# Kata description
The objective of this kata is to build a scoring "service". You're not expected to write a complete game with
dice rolls and automatic best hand selections (although you can if you want to and have time). Rather, given
a roll, you're supposed to score that roll given a specified category the player wants to use it for. The categories
you're supposed to support are listed and explained below.

## Chance: 
The player scores the sum of all dice, no matter what they read.
For example:
  
-   1,1,3,3,6 placed on "chance" scores 14 (1+1+3+3+6)
-   4,5,5,6,1 placed on "chance" scores 21 (4+5+5+6+1)  

## Yatzy: 
If all dice have the same number,
the player scores 50 points. 
For example:
  
-   1,1,1,1,1 placed on "yatzy" scores 50
-   1,1,1,2,1 placed on "yatzy" scores 0

## Ones, Twos, Threes, Fours, Fives, Sixes: 
The player scores the sum of the dice that reads one, 
two, three, four, five or six, respectively. 
For example:

-   1,1,2,4,4 placed on "fours" scores 8 (4+4)
-   2,3,2,5,1 placed on "twos" scores 4  (2+2)
-   3,3,3,4,5 placed on "ones" scores 0

## Pair: 
The player scores the sum of the two highest matching dice.
For example, when placed on "pair":
  
-   3,3,3,4,4 scores 8 (4+4)
-   1,1,6,2,6 scores 12 (6+6)
-   3,3,3,4,1 scores 6 (3+3)
-   3,3,3,3,1 scores 6 (3+3)

## Two pairs: 
If there are two pairs of dice with the same number, the
player scores the sum of these dice. 
For example, when placed on "two pairs":
  
-   1,1,2,3,3 scores 8 (1+1+3+3)
-   1,1,2,3,4 scores 0
-   1,1,2,2,2 scores 6 (1+1+2+2)

## Three of a kind: 
If there are three dice with the same number, the player
scores the sum of these dice. 
For example, when placed on "three of a kind":
    
-    3,3,3,4,5 scores 9 (3+3+3)
-    3,3,4,5,6 scores 0
-    3,3,3,3,1 scores 9 (3+3+3)

## Four of a kind: 
If there are four dice with the same number, the player
scores the sum of these dice. 
For example, when placed on "four of a kind":
  
-    2,2,2,2,5 scores 8 (2+2+2+2)
-    2,2,2,5,5 scores 0
-    2,2,2,2,2 scores 8 (2+2+2+2)

## Small straight: 
When placed on "small straight", if the dice read

   1,2,3,4,5, 
   
the player scores 15 (the sum of all the dice).

## Large straight: 
When placed on "large straight", if the dice read

   2,3,4,5,6, 
   
the player scores 20 (the sum of all the dice).

## Full house: 
If the dice are two of a kind and three of a kind, the
player scores the sum of all the dice. 
For example, when placed on "full house":
   
-    1,1,2,2,2 scores 8 (1+1+2+2+2) 
-    2,2,3,3,4 scores 0
-    4,4,4,4,4 scores 0