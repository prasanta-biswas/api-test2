package io.apitest.example.stepsdefinition;

import cucumber.api.java.en.And;
import cucumber.api.java.en.When;
import io.restassured.RestAssured;
import io.restassured.http.Method;
import io.restassured.specification.RequestSpecification;
import org.json.simple.JSONArray;
import org.json.simple.parser.ParseException;
import org.junit.Assert;

/**
 * Created by prasantabiswas on 01/09/18.
 */
public class UserReposTest extends BaseStep{

    @When("^I send HTTP request with username (.+) and uri (.+)$")
    public void sendRequest(String username, String uri) {
        RequestSpecification httpRequest = RestAssured.given();
        response = httpRequest.request(Method.GET, "/"+username+uri);
        System.out.println("Response: "+response.asString());
    }

    @And("^I should receive (.+) as repo count$")
    public void verifyRepoCount(int count) throws ParseException {
        JSONArray json = (JSONArray) jsonParser.parse(response.asString());
        Assert.assertEquals(count,json.size());
    }
}
