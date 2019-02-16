package com.rodrigue.simplehiptestpoc.e2e;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

/**
 * @author <a href="mailto:claude-rodrigue.affodogandji@ace3i.com?">RODRIGUE
 * AFFODOGANDJI</a>
 */
@RunWith(Cucumber.class)
@CucumberOptions(
        strict = true,
        features = {"src/test/resources/features/simplepoc.feature"},
        plugin = {"pretty", "json:target/cucumber-reports/Cucumber.json"},
        monochrome = true)
public class CucumberRunnerTest {
}