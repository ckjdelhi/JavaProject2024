package com.basic;

/*
Arithmetic Operators
+	Addition
-	Subtraction
*	Multiplication
/	Division
%	Modulo Operation (Remainder after division)

Assignment Operators
=	a = b;	a = b;
+=	a += b;	a = a + b;
-=	a -= b;	a = a - b;
*=	a *= b;	a = a * b;
/=	a /= b;	a = a / b;
%=	a %= b;	a = a % b;

Relational Operators: returns boolean value(true/false)
==	Is Equal To	3 == 5 returns false
!=	Not Equal To	3 != 5 returns true
>	Greater Than	3 > 5 returns false
<	Less Than	3 < 5 returns true
>=	Greater Than or Equal To	3 >= 5 returns false
<=	Less Than or Equal To	3 <= 5 returns true


Logical Operators
&& (Logical AND)	expression1 && expression2	true only if both expression1 and expression2 are true
|| (Logical OR)	expression1 || expression2	true if either expression1 or expression2 is true
! (Logical NOT)	!expression	true if expression is false and vice versa


Unary Operators
+	Unary plus: not necessary to use since numbers are positive without using it
-	Unary minus: inverts the sign of an expression
++	Increment operator: increments value by 1
--	Decrement operator: decrements value by 1
!	Logical complement operator: inverts the value of a boolean


Bitwise Operators
~	Bitwise Complement
&	Bitwise AND
|   Bitwise OR
^	Bitwise exclusive OR

Shift Operators
<<	Left Shift
>>	Right Shift 
>>>	Unsigned Right Shift

instanceOf Operators

Ternary Operator (condition? true statement : false statement)
 */

/*
 0 = 0000
 1 = 0001
 2 = 0010
 3 = 0011
 4 = 0100
 5 = 0101
 6 = 0110
 7 = 0111
 8 = 1000
 */
class A {
	
}
class B extends A {
	
}
class C extends B {
	
}

public class OperatorsDemo {

	String s="abc";
	public static void main(String[] args) {
		
		int a =5;
		int b =12;
		System.out.println(a > b ? (a +" is greater than "+ b) : (a +" is not greater than "+ b));
		
		
//		OperatorsDemo obj = new OperatorsDemo();
//		System.out.println(obj.s instanceof String);//true
//		System.out.println(obj.s instanceof Object);//true
//		//System.out.println(obj.s instanceof OperatorsDemo); //false
//		
//		C o = new C();
//		System.out.println(o instanceof C);
//		System.out.println(o instanceof B);
//		System.out.println(o instanceof A);
//		System.out.println(o instanceof Object);
//		
		
	}

}
