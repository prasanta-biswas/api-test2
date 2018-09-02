package io.apitest.example.stepsdefinition;

import io.restassured.response.Response;
import org.json.simple.parser.JSONParser;

/**
 * Created by prasantabiswas on 01/09/18.
 */
public class BaseStep {

    protected static Response response;
    protected static final JSONParser jsonParser = new JSONParser();
}
