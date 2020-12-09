# atm_machine

Console based ATM machine.

User needs to Login (put in their card number and pin) in order to use the program (all cards are hardcoded in .resources.login_en.properties) that they can deposit and withdraw money and check the balance.

All text shown to console is handled by ConsoleHelper class that uses java.util.ResourceBundle

There is Factory pattern used for different currencies (EUR and USD)

Written during CodeGym.cc Java course.
