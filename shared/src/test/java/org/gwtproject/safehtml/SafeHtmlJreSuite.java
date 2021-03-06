/*
 * Copyright 2010 Google Inc.
 *
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not
 * use this file except in compliance with the License. You may obtain a copy of
 * the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS, WITHOUT
 * WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the
 * License for the specific language governing permissions and limitations under
 * the License.
 */
package org.gwtproject.safehtml;

//import org.gwtproject.safehtml.rebind.HtmlTemplateParserTest;
//import org.gwtproject.safehtml.rebind.ParsedHtmlTemplateTest;
import org.gwtproject.safehtml.server.SafeHtmlHostedModeUtilsTest;
import org.gwtproject.safehtml.server.SafeUriHostedModeUtilsTest;
import org.gwtproject.safehtml.server.UriUtilsTest;
import org.gwtproject.safehtml.shared.SafeHtmlBuilderTest;
import org.gwtproject.safehtml.shared.SafeHtmlStringTest;
import org.gwtproject.safehtml.shared.SafeHtmlUtilsTest;
import org.gwtproject.safehtml.shared.SimpleHtmlSanitizerTest;

import junit.framework.Test;
import junit.framework.TestSuite;

/**
 * Test suite for SafeHtml tests that require the JRE.
 */
public class SafeHtmlJreSuite {
  public static Test suite() {
    TestSuite suite = new TestSuite(
        "Test suite for SafeHtml tests that require the JRE");

    suite.addTestSuite(SafeHtmlUtilsTest.class);
    suite.addTestSuite(SafeHtmlBuilderTest.class);
    suite.addTestSuite(SimpleHtmlSanitizerTest.class);
    suite.addTestSuite(SafeHtmlStringTest.class);
    suite.addTestSuite(UriUtilsTest.class);
//    suite.addTestSuite(HtmlTemplateParserTest.class);
//    suite.addTestSuite(ParsedHtmlTemplateTest.class);
    suite.addTestSuite(SafeHtmlHostedModeUtilsTest.class);
    suite.addTestSuite(SafeUriHostedModeUtilsTest.class);
    suite.addTestSuite(org.gwtproject.safehtml.shared.UriUtilsTest.class);

    return suite;
  }

  private SafeHtmlJreSuite() {
  }
}
