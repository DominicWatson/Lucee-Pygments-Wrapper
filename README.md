# Lucee Pygments Wrapper

This simple project provides an interface to the [Python Pygments](http://pygments.org) library for Lucee applications. Example usage:

    highlighted = new PygmentsWrapper().highlight( 
    	  code            = codeToHighlight
    	, lexer           = "cfm"
    	, showLineNumbers = true
    );

## Implementation

The project has first created a simple Java wrapper to Pygments based on the Python in Java instructions here: 

http://pygments.org/docs/java/

For now, the compiled jar file, including its dependencies, has been included in the source of this project and I have also included the source (`lib/src/pyg-in-blankets`) with a maven build should one wish to extend it / play about with it. To build, ensure you have [Maven](http://maven.apache.org/) installed and then run:

    lib/src/pyg-in-blankets/> mvn package

The Lucee implementation is a dumb CFC wrapper to the `com.dominicwatson.pyginblankets.PygmentsWrapper` java class (which itself is pretty brutish).

Enjoy :)