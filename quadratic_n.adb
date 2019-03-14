
-- quadratic_n.adb takes the value of a, b, c and computes x
--
-- Input: A, B, C
-- Precondition: A must be greater than 0
-- Output: The value of X
-- By: Lorrayya Williams	
-- Date: March 5, 2019
--------------------------------------------------------------

with Ada.Text_IO, Ada.Integer_Text_IO;
use  Ada.Text_IO, Ada.Integer_Text_IO;
with Ada.Text_IO, Ada.Float_Text_IO;
use  Ada.Text_IO, Ada.Float_Text_IO;
with Ada.Numerics.Elementary_Functions;
use Ada.Numerics.Elementary_Functions;

procedure quadratic_n is

	a, b, c, root1, root2 : Float;


 ------------------------------------------------
   --  quadratic() gives the value of x using the quadratic formula     
   -- Receive: A, B, C       
   -- PRE: A /= 0, Arg /< 0
   -- Passback: root1, root2
   ------------------------------------------------
procedure quadratic( a : in Float; b : in Float; c : in Float; root1 : out Float; root2 : out Float) is

arg : Float;

begin
	if(a /= 0.0) then
	arg := b**(2.0) - (4.0*a*c);
		if(arg >= 0.0) then
		root1 :=  ((-b)- Sqrt(arg))/(2.0 *a);
		root2 :=  ((-b)+ Sqrt(Arg))/(2.0* a);
		else 
			root1 := 0.0;
			root2 := 0.0;
			Put("The square root of zero cannot be taken.");
		end if;
	else
		root1 := 0.0;
		root2 := 0.0;
		Put("The value of x cannot be obtained if a is 0.");
	end if;

end quadratic;

begin

	Put_Line("This programs helps you solve the value of X.");
	Put_Line("Enter the value of a: ");
   	Get(a);
  	Put_Line("Enter the value of b: ");
   	Get(b);
   	Put_Line("Enter the value of c: ");
   	Get(c);

	quadratic(a, b, c, root1, root2);

	Put("The value of x is ");
    Put(root1);
    Put(" or ");
    Put(root2);
end quadratic_n;