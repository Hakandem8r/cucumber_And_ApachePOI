package stepDefinitions;

import cucumber.api.DataTable;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

import java.util.List;

public class dataTableSteps {

    @Given("^User is on registration page$")
    public void user_is_on_registration_page()  {
        System.out.println("User navigates on registration page");
    }

    @When("^User enters following user details$")
    public void user_enters_following_user_details(DataTable dataTable) {
       List<List<String>> userList=dataTable.raw();
       for (List<String> e:userList){
           System.out.println(e);
       }
        /*System.out.println(userList.get(0).get(0));
        System.out.println(userList.get(0).get(1));
        System.out.println(userList.get(0).get(2).toString());
        System.out.println(userList.get(0).get(3).toString());
        System.out.println(userList.get(0).get(4).toString());

        System.out.println(userList.get(1).get(0));
        System.out.println(userList.get(1).get(1));
        System.out.println(userList.get(1).get(2));
        System.out.println(userList.get(1).get(3));
        System.out.println(userList.get(1).get(4)); */

    }

    @Then("^User registration should be succesfull$")
    public void user_registration_should_be_succesfull() {
        System.out.println("User registration should be succesfull");
    }
}
