# api-test2
GitHub API Test


* Assuming this specification to be implemented, as Test Engineer I would have few concerns. These include some basic questions about the product to be implemented. They are described below - 

    1. What is the product and its usage?
The first thing comes to mind is to know the product itself. I should have crystal clear understanding of the product specifications and features. I also should have clear idea of how the product is going to be used.

    2. Who are the end users and how many?
I should have idea of the end users who are going to use the product. The number of end users is big factor to consider here.

    3. What technology stack to be used?
	I would like to know the underlying technology stack used for this product. This is required to design test cases accordingly.

	4.  What would be the development approach?
	I should know the development approach to be considered for this product development so that I can plan the test development approach like TDD or BDD.

	5.  What are the prerequisites?
	It is important to know the prerequisites for testing of the product like hardware resources, test environment, accessibility etc. This helps to setup the test environment.

	6.  What are the different components or modules of the product?
	This information will help to develop tests specific for different components.

With all the above information, it will be a clear picture of the product and it will be simple to list down product features, its requirements, prerequisites. So I can plan the test approach along the test scenarios of each features of the product.

* To tackle the Quality Assurance of the product I would go by the following steps
	
	1. Plan, Segregate and Prioritise
	Firstly I will create a plan how I am going to test the product. This plan will contain the step by step approach of creating, executing and generating reports of tests. Then comes the segregation part where I will segregate different parts of the product to be tested independently. Now I will prioritise each of the segregation based on which I will start working. The high priority task will be done first.

	2. Write Test Cases
	As I have the initial requirements, based on priority I will pick one feature at a time and write the possible user stories with positive and negative scenarios. I will involve the Product Owner here to take his/her input as well for the test scenarios. These scenarios are documented and also automated if possible. 
	This way I will prepare the set of test scenarios for the product which should pass in any environment. This confirms that my requirements are matching and the product is working as it is expected. 
	This work will start as soon as the requirements are provided to the team. The test scenarios may change overtime as the requirements changes. 

	The quality of a software product is not always functionality. We should also verify how it performs with different environmental parameters like load, stress and with different hardware configurations including security testing. So These test cases are also very important for me to verify the quality of the product. I will prepare test cases for these as well.

	3. Execute the Test Cases
	Now as we have the test cases ready for the features and I have a first build product, I will execute the test cases feature wise and verify the functional quality of the product. I will also report any failure of any test cases that violates the functional quality of the product to get it fixed.

	4. Regression Test
	Once the first deliverable is ready from Dev, I will do full regression test (manual or automated) to check everything is working and check if any functionality is broken for fixing any other issues. I will report any failures to get the regression issue fixed before delivery to product owner.

	5. Non-Functional Test
	As discussed above I will also do performance test on the product with different parameters like hardware configurations, huge users, concurrent access, load, stress to check if the product is able to work efficiently at any environment or to identify the limits of the application.

	6. Demo to PO and Stakeholders
	After passing through all the quality checks above, Now team will demonstrate the product features to the PO and stakeholders to verify.

	7. Release
	If all the quality checks are passing then I will allow the product to be released and delivered to the Product Owner.

* Test cases can be both manual and automated depending on the test case and its complexity. I would be having different types of test cases given below -
	
	1. Unit Test Cases
	These test cases are a must and must not be skipped. These test cases ensure the single unit of code is working or not. This must be automated.

	2. Functional Test Cases
	This include test cases related to the functionality of the product. This is both manual and automated. These are mainly black box testing.
	
	3. Integration Test Cases
	This include test cases that check the integration of different components of the product that the combination between the components are working as expected. This must be automated automated.

	4. System Integration Test
	This test cases ensure the integration of the product to the external system if any. This is mostly manual but can be automated depending on the complexity.

	5. Sanity Test
	These are some test cases that checks new functionality and bug fixes to ensure application working as expected. This can be both manual and automated.

	6. Smoke test cases
	These test cases ensure the critical functionalities of the application like if it installs properly, it starts or loads properly etc. This is both manual and automated.

* There are different tools available that helps ensuring and keeping track of quality of the product. In this cases I would the following tools
	
	1. SoapUI
	2. Java
	3. Jmeter
	4. RestAssured/Apache HTTP Client
	5. Cucumber
	6. Junit/TestNG
	7. JIRA/HP ALM/or Any ALM tool
	8. Jenkins/Bamboo
	9. Maven
	10. Git
		
	

