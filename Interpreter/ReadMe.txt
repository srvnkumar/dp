Interpreter pattern defines a grammar for a language and uses expression objects to
interpret sentences in that language.

you it when you need to evaluate structured expressions such as rules engines,
math expressions, filter DSLs, query languages, or configuration scripts.

DSL

A AND B OR C

Need a way to:
Represent grammar as classes
Parse expressions
Evaluate them

UML structure
Expression (interface)
--Terminal Expression
-- NonTerminal Expression
    -- And Expression
    -- Or Expression
    -- (other grammar rules)
