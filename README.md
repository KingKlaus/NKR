# Object Oriented UML Modeling for ATM Systems

Abstract
The Object-Oriented Modeling assists the programmer to address the complexity of a problem domain by considering the problem not as a set of functions that can be performed but primarily as a set of related, interacting Objects. This article is based on the approach of Object Oriented modeling through Unified Modeling Language (UML) for an ATM system in banking sector. The main aim of this article is to provide a flexible and faithful environment for a customer, who wants to do online banking transactions. After successful authentication, the customer can withdraw the desire amount (within the prescribed limit) from the ATM machine or can transfer amount to other account. User can also change the pin code. The ATM has solved many problems and now customer can have money transaction 24/7. In this article UML Class, Interaction diagram, Activity diagram & Use Case diagram are also designed for the ATM System. 

Key Words: UML dynamic modeling, UML static modeling, Use case modelling

#Introduction  
The  Unified  Modeling  Language  (UML)  is  a  very dominant  modeling  graphical  language  for  specifying, constructing  and  documenting  the  artifacts  of  software system.  UML is simply another graphical representation of a common semantic model.  UML  provides  a comprehensive  notation  for  the  full  lifecycle  of  object-oriented  development  UML  is  a  collection  of  best engineering practices that have successful in the modeling for a design of  a  huge  and  complex  systems.  Modeling is very important for readability and reuse of the systems. 

Features of ATM Systems
The ATM will service one customer at a time. A customer will  be  required  to  insert  an  ATM  card  and  enter  a personal identification number (PIN) - both of which  will be  sent  to  the  bank  for  validation  as  part  of  each transaction.  The customer will then be able to perform one or more transactions.  

Object-Oriented Analysis
Object-oriented  analysis  looks  at  the  problem  domain, with  the  aim  of  producing  a  conceptual  model  of  the information  that  exists  in  the  area  being  analyzed. Analysis models do not consider any implementation constraints or how the system is to be built. The identified objects reflect entities and operations that are associated with the problem to be solved. 

Diagram Showing a Use Case diagram in UML(image file uploaded)
 

## THE DEPLOYMENT VIEW


Example showing the deployment view of  an  atm :(image file uploaded)

 
The sequence diagram of an atm:(file uploaded)
For this diagram the image uploaded is not completly finished because it doesnt show all the options that a customer have after insertind the card in the atm,the reason why we did this is because we wanted the image to look small and simple,but normally we know that an Atm sequence diagram should contain more than the options shown on the diagram.once a custumer insert his card in the Atm machine he should be able to:
-deposit
-Withdrawl money
-Make money transfer to other  accounts
-mobile topup
-check current balance
And once the card or PIN is invalid then the machine immediately rejects the card. 


Atm class diagram:(image file uploaded)
Also for this diagram  a customer has more options than withdrawl,deposit,mobile top up he can also transfer mmoney  and check current
balance .

 # Requirements
The ATM will service one customer at a time. A customer will be required to insert an ATM card and enter a personal identification number (PIN) both of which will be sent to the bank for validation as part of each transaction.After the customer performs the following operation The customer he will then be able to perform one or more transactions. The card will be retained in the machine until the customer indicates that he/she desires no further transactions, at which point it will be returned - except as noted below.

The ATM must be able to provide the following services to the customer:

A customer must be able to make a cash withdrawl from any suitable account linked to the card and Approval must be obtained from the bank before cash is dispensed.
A customer must be able to make a deposit to any account linked to the card. The customer will enter the amount of the deposit into the ATM, subject to manual verification when the envelope is removed from the machine by an operator. Approval must be obtained from the bank before physically accepting the envelope.
A customer must be able to make a transfer of money between any two accounts linked to the card.
A customer must be able to check balance inquiry of any account linked to the card.
The ATM will communicate each transaction to the bank and obtain verification that it was allowed by the bank. In the case of a cash withdrawl or deposit, a second message will be sent after the transaction has been physically completed (cash dispensed or envelope accepted).

If the bank determines that the customer's PIN is invalid, the customer will be required to re-enter the PIN before a transaction can proceed. If the customer is unable to successfully enter the PIN after three tries, the card will be rejected by the machine.

If a transaction fails for any reason other than an invalid PIN, the ATM will display an explanation of the problem, and will then ask the customer whether he/she wants to do another transaction.

The ATM will provide the customer with a printed receipt for each successful transaction, showing the date, time, machine location, type of transaction, account(s), amount, and ending and available balance(s) of the affected account ("to" account for tranfers).


## Conclusion:
As we are still working on this project , so far we know that OOAD is very important especially while you are designing  an atm system and our team believes that  the atm design  is simple and  is easy to use as a cardholder. As   it provides you more than one option and allows you to create more than one accounts as desired. 
