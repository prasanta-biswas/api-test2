package io.apitest.example.stepsdefinition;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.restassured.RestAssured;
import io.restassured.http.Method;
import io.restassured.specification.RequestSpecification;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;
import org.junit.Assert;

/**
 * Created by prasantabiswas on 01/09/18.
 */
public class UserDetailsTest extends BaseStep{

    @Given("^I have github api (.+)$")
    public void setUrl(String url) {
        RestAssured.baseURI = url;
    }

    @When("^I send HTTP request to api with username (.+)$")
    public void sendRequest(String username) {
        RequestSpecification httpRequest = RestAssured.given();
        response = httpRequest.request(Method.GET, "/"+username);
        System.out.println("Response: "+response.asString());
    }

    @Then("^I should get (.+) as HTTP status code$")
    public void verifyStatusCode(int statusCode) {
        Assert.assertEquals(statusCode,response.getStatusCode());
    }

    @And("^I should get my name (.+), company (.+), location (.+), bio (.+) and public repos (.+)$")
    public void verifyUserData(String name, String company, String location, String bio, String repos) throws ParseException {
        JSONObject json = (JSONObject) jsonParser.parse(response.asString());
        String _name = (String) json.get("name");
        String _company = (String) json.get("company");
        String _location = (String) json.get("location");
        String _bio = (String) json.get("bio");
        String _repos = String.valueOf(json.get("public_repos"));

        Assert.assertEquals(name,_name);
        Assert.assertEquals(company,_company);
        Assert.assertEquals(location,_location);
        Assert.assertEquals(bio,_bio);
        Assert.assertEquals(repos,_repos);
    }

    @And("^I should get (.+) as validation message$")
    public void validateMessage(String message) throws ParseException {
        JSONObject json = (JSONObject) jsonParser.parse(response.asString());
        String _message = (String) json.get("message");
        Assert.assertEquals(message,_message);
    }
}
