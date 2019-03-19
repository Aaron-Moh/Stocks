# Stocks
Given a class of Stocks, give the portfolio test!

Write the Portfolio  class which manages a portfolio of Stock objects. You are given the Stock class. Here is the documentation for Stock class , but the only thing you really need to know is that it has getPrice and getSymbol methods. Portfolio has methods to manage an array (not an ArrayList)
Portfolio  has a Stock[] as an instance variable. Call it stocks . It has a constructor that takes an array of Stocks as a parameter and initializes the instance variable with it.
It has methods
public double totalValue() finds the total value of all the Stocks in this Portfolio (This is assuming 1 share of each stock)
public String cheapest() gets the symbol for the Stock with the lowest price per share. If more than one Stock has the same low price, return the symbol for the first.
public String toString() provided for you which is why you need to call the instance variable stocks
(You can assume the array is not empty)
