#! /usr/bin/ruby
# quadratic.rb displays the value of x
#Lorrayya Williams for CS 214 at Calvin College
#
# Input: The values of A,B,C
# Precondition: A must not equal zero
# Output:The value of x
#################################################
include Math

def quadratic(a = 0.0, b= 0.0 , c= 0.0, roots)
  root1 = 0.0
  root2 = 0.0
  if a != 0
    arg = ((b**2.0) - (4 * a * c))
    if arg >= 0
      root1 = (-b + (Math.sqrt(arg)))/(2*a)
      root2 =(-b - (Math.sqrt(arg)))/(2*a)
      roots[0] = root1
      roots[1] = root2
      return true
    else root1 = root2= 0.0
      puts "Cannot get the square root of zero or imaginary numbers"
      roots[0] = root1
      roots[1] = root2
      return false
    end
  else root1 = root2 = 0.0
    roots[0] = root1
    roots[1] = root2
    puts "Cannot find x if a is 0."
    return false
  end
end

def main
print "Enter the value of A: ";
a = gets.chomp.to_f

print "Enter the value of B: " ;
b = gets.chomp.to_f

print "Enter the value of C: ";
c = gets.chomp.to_f

roots = Array.new(2)
quadratic( a, b, c, roots);
puts "The value of X is #{roots[0]} or #{roots[1]} ."



end

main
