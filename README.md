BankAccount Class

Description:
The BankAccount class represents a basic bank account with properties like account number and balance.
It provides methods to deposit, withdraw, and get balance.

CheckingAccount Class

Description:
The CheckingAccount class represents a checking account, which is a type of bank account.
It extends the BankAccount class.

SavingsAccount Class

Description:
The SavingsAccount class represents a savings account, which is a type of bank account.
It extends the BankAccount class and includes additional properties like interest rate.
It provides a method to calculate interest and add it to the account balance.

Usage:
1. Create instances of CheckingAccount and SavingsAccount by providing account number, initial balance, and interest rate (for SavingsAccount).
2. Deposit and withdraw money using appropriate methods inherited from BankAccount.
3. Calculate interest for SavingsAccount using the calculateInterest() method.
4. Test the functionality of each class using the main method provided in the SavingsAccount class.
