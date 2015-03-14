component {
	public string function highlight( required string code, required string lexerName, boolean showLineNumbers=false ) {
		return _getJavaWrapper().highlight( code, lexerName, showLineNumbers );
	}

	private any function _getJavaWrapper() {
		var jars = [ "./lib/pyg-in-blankets-1.0-SNAPSHOT-jar-with-dependencies.jar" ];

		return CreateObject( 'java', 'com.dominicwatson.pyginblankets.PygmentsWrapper', jars );
	}
}