
@test1
Feature: Test feature 1
  

  @tag1
  Scenario: How much could I borrow?
    Given when enter your details
      | Application type  | Number of dependants | Property you would like to buy  | 
      | Single 						|     0 							 | Home to live in 								 |
		And when enter Your earnings
			| Your annual income (before tax)  | Your annual other income (optional) |  
      | 80000 													 | 10000						  								 | 
		And when enter Your expenses
			| Monthly living expenses  | Current home loan monthly repayments | Other loan monthly repayments  |  Other monthly commitments | Total credit card limits|
      | 500   				       		 |     0 							 									| 100     											 |  0																	| 10000									  |
		And click Work out how much I could borrow button
		Then validate Amount
			|Expected Amount|
			| 479000				|
		

		

