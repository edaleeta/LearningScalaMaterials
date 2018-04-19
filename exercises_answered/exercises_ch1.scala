/* Chapter 1 Exercises */

/*  1
--- QUESTION ---
Although println() is a good way to print a string, can you find a way to print a
string without println? Also, what kinds of numbers, strings, and other data does
the REPL support?
--- ANSWER ---
print()
string, int, double, probably lots of other things I don't know synxtax for
but will soon!

    2
---QUESTION ---
In the Scala REPL, convert the temperature value of 22.5 Centigrade to Fahrenheit.
The conversion formula is cToF(x) = (x * 9/5) + 32.
---ANSWER ---
(22.5 * (9.toDouble/5)) + 32
res23: Double = 72.5

    3
---QUESTION ---
Take the result from exercise 2, halve it, and convert it back to Centigrade. You can
use the generated constant variable (e.g., “res0”) instead of copying and pasting the
value yourself.
---ANSWER ---
((res23 / 2) - 32) * (5.toDouble / 9)
res25: Double = 2.361111111111111

    4
---QUESTION ---
The REPL can load and interpret Scala code from an external file with the :load
<file> command. Create a new file named Hello.scala and add a command that
will print a greeting, then execute it from the REPL.
---ANSWER ---
:load <path_to_file> -- Done!




