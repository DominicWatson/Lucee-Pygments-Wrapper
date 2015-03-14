package com.dominicwatson.pyginblankets;

import static org.junit.Assert.*;
import org.junit.Test;

public class PygmentsWrapperTest {

    @Test
    public void testSimpleHighlighting() {
        String source            = "String foo='bar';";
        String expectedHighlight = "<div class=\"highlight\"><pre><span class=\"n\">String</span> <span class=\"n\">foo</span><span class=\"o\">=</span><span class=\"err\">&#39;</span><span class=\"n\">bar</span><span class=\"err\">&#39;</span><span class=\"o\">;</span>\n</pre></div>\n";
        String actualHighlight   = PygmentsWrapper.highlight( source, "java", false );

        assertEquals( "Simple highlight test:", expectedHighlight, actualHighlight );
    }
}