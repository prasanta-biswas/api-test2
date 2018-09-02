# api-test2
GitHub API Test

## Run test with `mvn clean test`

#### Assumptions & Approach

As an Engineer I take this project development in Agile Method where we plan our sprint with 
scrum master and PO. Also I will take Behaviour Driven Development as the product development approach as this involves each stake holder to build user stories
and test scenarios. This way I can get clear idea of the product and there by I can develop BDD based test cases which are easily understood by anyone.

#### Jmeter Config
I have also added a Jmeter .jmx file for a simple API load testing with 100 requests from a single user at 1 second. This shows reports if the API can handle these many requests concurrently. It maigh fail if the max API rate exceeds from a single Host IP.