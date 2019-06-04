Feature: Westpac Kiwisaver Retirement Calculator

@scenario1
Scenario: Users clicks on info icon to get the details

Given the user navigates to Westpac kiwisaver scheme retirement calculator
When the user clicks on the info icon the user is able to read the details
Then close browser

@scenario2
Scenario Outline: Calculate Projected Balance at retirement for an employee

Given the user navigates to Westpac kiwisaver scheme retirement calculator
And the user enters the values on the screen for employees "<Current_Age>" "<Emp_Status>" "<SalBTax>" "<KiwiContri>" "<PIR>" "<RiskProfile>"

Examples:
|Current_Age|Emp_Status     |SalBTax|KiwiContri|PIR  |RiskProfile|
|25         |Employed       |72000  |3	       |17.5%|high       |

@scenario3
Scenario Outline: Calculate Projected Balance at retirement for self-employed

Given the user navigates to Westpac kiwisaver scheme retirement calculator
And the user enters the values on the screen for selfemployed "<Current_Age>" "<Emp_Status>" "<PIR>" "<CurrBalance>" "<VolContri>" "<Freq>" "<RiskProfile>" "<SavingGoal>"

Examples:
|Current_Age|Emp_Status     |PIR  |CurrBalance|VolContri|Freq       |RiskProfile|SavingGoal| 
|41         |Self-employed	|10.5%|90000      |   90    |Monthly    |medium     |290000    |
    

@scenario4
Scenario Outline: Calculate Projected Balance at retirement for not employed

Given the user navigates to Westpac kiwisaver scheme retirement calculator
And the user enters the values on the screen for nonemployed "<Current_Age>" "<Emp_Status>" "<PIR>" "<CurrBalance>" "<VolContri>" "<Freq>" "<RiskProfile>" "<SavingGoal>"

Examples:
|Current_Age|Emp_Status     |PIR  |CurrBalance|VolContri|Freq       |RiskProfile|SavingGoal| 
|55         |Not employed   |10.5%|140000     |   10    |Annually   |high       |200000    |    