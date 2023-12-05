# Antlr4 Commands

## Basic Command Structure

```bash
antlr4 [options] <grammar-file>
```

- `antlr4`: The ANTLR tool command.
- `[options]`: Optional flags and settings for the command.
- `<grammar-file>`: The grammar file (usually ending in `.g4`) you are processing.

## Common Options

- `-Dlanguage=<language>`: Specify the target language for the generated code (e.g., `Java`, `CSharp`, `Python3`, etc.).
- `-o <output-dir>`: Specify the output directory for generated files.
- `-lib <lib-dir>`: Specify the location of imported grammars.
- `-atn`: Generate a graphical representation of the grammar's ATN (Abstract Syntax Tree).
- `-visitor`: Generate visitor classes (used for the visitor pattern).
- `-listener`: Generate listener classes (used for the listener pattern; this is the default behavior).
- `-package <packageName>`: Specify a package/namespace for the generated code.
- `-encoding <encoding>`: Specify the encoding of the input grammar file.
- `-long-messages`: Show full exception error messages and other lengthy messages.
- `-Xexact-output-dir`: Generate all output into `-o` directory regardless of the input file location.
- `-Xlog`: Log the work done by the tool.

## Examples

1. **Generate Java Parser and Lexer with Listener**:

   ```bash
   antlr4 -Dlanguage=Java -listener -visitor -o src/main/java MyGrammar.g4
   ```

2. **Generate Python Parser with Visitor**:

   ```bash
   antlr4 -Dlanguage=Python3 -visitor -o generated MyGrammar.g4
   ```

3. **Generate C# Parser and Lexer in a Specific Namespace**:

   ```bash
   antlr4 -Dlanguage=CSharp -package MyNamespace MyGrammar.g4
   ```

## Post-Generation

After running ANTLR with your desired options, you'll typically find the following generated files:

- `<GrammarName>Lexer.java`: The lexer class.
- `<GrammarName>Parser.java`: The parser class.
- `<GrammarName>Listener.java` and `<GrammarName>BaseListener.java`: Listener interfaces for traversing parse trees (if `-listener` is used).
- `<GrammarName>Visitor.java` and `<GrammarName>BaseVisitor.java`: Visitor interfaces for traversing parse trees (if `-visitor` is used).

## Using Generated Code

After generating the parser and lexer, integrate them into your application:

- Write a main class or method to create instances of the lexer and parser.
- Parse input text and process the parse tree using either the listener or visitor patterns.

## Additional Resources

- The [ANTLR4 Documentation](https://www.antlr.org/) provides comprehensive information and is a great resource.
- Consider looking into ANTLR4 books or online tutorials for more detailed guides and examples.
