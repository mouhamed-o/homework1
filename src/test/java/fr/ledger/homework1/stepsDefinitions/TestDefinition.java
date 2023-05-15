package fr.ledger.homework1.stepsDefinitions;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

import static com.codeborne.selenide.Selenide.*;

import org.openqa.selenium.By;

import com.codeborne.selenide.collections.ListSize;

import static com.codeborne.selenide.Condition.*;

public class TestDefinition {
	
	@Given("I go to Login page")
	public void i_go_to_Login_page() {
		$(By.linkText("Sign in")).click();
	}
	
	@Given("I got to new post page")
	public void i_go_to_new_post_page() {
		$(By.linkText("New Post")).click();
	}
	
	@When("I set my login email {string} and my password {string}")
	public void I_set_my_login_email(String mail, String passwword) {
		$("input[type=email]").setValue(mail);
		$("input[type=password]").setValue(passwword);
	}
	
	@When("I click on Sign In button")
	public void i_click_on_Sign_In_button() {
		$("button[class=\"btn btn-lg btn-primary pull-xs-right\"]").click();
	}
	
	@Then("I'm login as {string}")
	public void i_m_connected_as_X(String userName) {
		$(By.linkText(userName)).shouldBe(visible);
	}
	
	@When("My new post Article is {string}")
	public void my_new_post_article_is_x(String articleTitle) {
		$("input[class=\"form-control form-control-lg\"]").setValue(articleTitle);
	}
	
	@When("My new post Article about section is {string}")
	public void my_new_post_article_about_section_is_x(String ArticleSection) {
		$("input[class=\"form-control\"]").setValue(ArticleSection);
	}
	
	@When("My new post description is:")
	public void my_new_post_description_is_x(String articleDescription) {
		$("textarea[class=\"form-control\"]").setValue(articleDescription);
	}
	
	@When("My new post tags are {string}")
	public void my_new_post_tags_are_x(String tags) {
		$("input[placeholder=\"Enter tags\"]").setValue(tags);
	}
	
	@Then("I post my article")
	public void i_post_my_article() {
		$("button[class=\"btn btn-lg pull-xs-right btn-primary\"]").click();
	}
	
	@Then("My new post should be publish")
	public void my_new_post_named_should_be_post() {
		$(By.linkText("Edit Article")).shouldBe(visible);
	}
	
	@Given("I got on my feed page {string}")
	public void i_got_on_my_feed_page(String userName) {
		$(By.linkText(userName)).click();
	}
	
	@Given("I got on my favorite tab")
	public void i_got_on_my_favorite_tab() {
		$(By.linkText("Favorited Articles")).click();
	}
	
	@Given("My post Article {string} is my favorite")
	public void my_post_Article_is_my_favorite(String articleName) {
	    $$("div[class=\"article-preview\"").filter(text(articleName)).first().$("button[class=\"btn btn-sm btn-outline-primary\"]").click();
	}

	@Then("the article {string} should be one of my favorite article")
	public void the_article_should_be_one_of_my_favorite_artiicle(String articleName) {
		$$("div[class=\"article-preview\"").filter(text(articleName)).shouldHave(ListSize.size(1));
	}

	
}
