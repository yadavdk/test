
@test3
Feature: Test feature 3
  

  @tag3
  Scenario: Varify error msg functionality.
		And when enter Your expenses
			| Monthly living expenses  | Current home loan monthly repayments | Other loan monthly repayments  |  Other monthly commitments | Total credit card limits|
      | 1   				       		 |     0 							 									| 0     											 |  0															| 0								  |
		And click Work out how much I could borrow button
		Then verify the error msg
			|errormsg|
			|Based on the details you've entered, we're unable to give you an estimate of your borrowing power with this calculator. For questions, call us on 1800 035 500.|
		

		

