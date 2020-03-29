package com.bestBuy.runners;


import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
        features = "src/test/resources/features",
        tags = {"@api"},
        monochrome = true,
        plugin = {
        "pretty", "html:target/cucumber-report/productsapi",
        "json:target/cucumber-report/productsapi/cucumber.json",
        "rerun:target/cucumber-report/productsapi/rerun.txt"},
        glue = {"com/bestBuy/stepDefs"},
        dryRun = false)

public class ProductsRunner extends AbstractTestNGCucumberTests {
}
