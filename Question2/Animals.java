package Question2;
/*2.	There is an animal class which has the common characteristics of all animals. Dog, Horse, Cat are animals(sub-class). Each can shout, but each shout is different. Use polymorphism to create objects of same and using an animal variable, make each of the animals shout.*/

class Animal{  
void eat(){System.out.println("Shouting...");}  
}  
class Dog extends Animal{  
void eat(){System.out.println("Shouting Dog...");}  
}  
class Cat extends Animal{  
void eat(){System.out.println("Shouting Cat...");}  
}  
class Horse extends Animal{  
void eat(){System.out.println("Shouting Horse...");}  
}  
class Animals{  
public static void main(String[] args){  
Animal a;  
a=new Dog();  
a.eat();  
a=new Cat();  
a.eat();  
a=new Horse();  
a.eat();  
}}  