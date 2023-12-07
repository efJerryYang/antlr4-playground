grammar PC;

// Entry point for parsing
parse
    : proposition EOF
    ;

// Propositions can be atoms or any higher-precedence expression
proposition
    : implication
    ;

// Implications are the lowest precedence binary operator
implication
    : unary (IMPLY implication)?
    ;

// Unary operators like negation have higher precedence than implication
unary
    : negation
    | atom
    ;

// Atoms can be a simple character or a parenthesized proposition
atom
    : ATOM 
    | LPAREN proposition RPAREN
    ;

// Negation can be '¬', '-', '!', or their LaTeX equivalents, followed by a unary expression
negation
    : (NEGATE | HYPHEN | EXCLAMATION | LATEX_NEGATE | LATEX_LNOT) unary
    ;

// Define atoms as lowercase characters (extend this range as needed)
ATOM: [a-z];

// Define the necessary tokens for logical operations and parentheses
LPAREN: '(';
RPAREN: ')';
IMPLY: '→' | LATEX_RIGHTARROW | HYPHEN_GREATER;
NEGATE: '¬';
HYPHEN: '-';
EXCLAMATION: '!';
LATEX_NEGATE: '\\neg';
LATEX_RIGHTARROW: '\\rightarrow';
LATEX_LNOT: '\\lnot';
HYPHEN_GREATER: '->';

// We can ignore whitespaces and newlines in our language
WS: [ \t\r\n]+ -> skip;

// Optional: Handle LaTeX math mode delimiters
// Start and end tokens are the same in LaTeX, so we define only one token for math mode delimiter
LATEX_DELIM: '$';

