package com.day1.ewalletapplication;

//Abstraction: defines fund transfer behavior
interface Transferrable {
 void transferTo(User receiver, double amount);
}

