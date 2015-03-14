package com.dominicwatson.pyginblankets;

import org.python.util.PythonInterpreter;

public class PygmentsWrapper
{
	public PygmentsWrapper() {}

	public static String highlight( String code, String lexer, Boolean printLineNumbers ) {
		PythonInterpreter interpreter = new PythonInterpreter();
		String pythonCodeToExecutePygments =
			  "from pygments import highlight\n"
			+ "from pygments.lexers import get_lexer_by_name\n"
			+ "from pygments.formatters import HtmlFormatter\n\n"

			+ "lexer = get_lexer_by_name(lexer, stripall=True)\n"
			+ "formatter = HtmlFormatter(linenos=printLineNumbers)\n"
			+ "result = highlight(code, lexer, formatter)";

		interpreter.set( "code"            , code             );
		interpreter.set( "lexer"           , lexer            );
		interpreter.set( "printLineNumbers", printLineNumbers );

		interpreter.exec( pythonCodeToExecutePygments );

		return (String) interpreter.get( "result", String.class );
	}
}
