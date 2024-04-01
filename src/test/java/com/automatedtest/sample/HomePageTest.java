package com.automatedtest.sample;


import io.cucumber.junit.platform.engine.Constants;
import org.junit.platform.suite.api.ConfigurationParameter;
import org.junit.platform.suite.api.IncludeEngines;
import org.junit.platform.suite.api.SelectClasspathResource;
import org.junit.platform.suite.api.Suite;

@Suite
@IncludeEngines("cucumber")
@SelectClasspathResource("com/automatedtest/sample")
@ConfigurationParameter(key = Constants.FEATURES_PROPERTY_NAME, value = "src/test/resources/com/automatedtest/sample/Home_page.feature")
@ConfigurationParameter(key = Constants.GLUE_PROPERTY_NAME, value = "com.automatedtest.sample.infrastructure.driver, com.automatedtest.sample.homepage")
@ConfigurationParameter(key = Constants.EXECUTION_DRY_RUN_PROPERTY_NAME, value = "false")
@ConfigurationParameter(key = Constants.PLUGIN_PROPERTY_NAME, value = "pretty, html:target/cucumber-report/cucumber.html")
public class HomePageTest {
}
