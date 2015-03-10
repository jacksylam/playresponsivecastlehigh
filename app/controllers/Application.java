package controllers;

import play.mvc.Controller;
import play.mvc.Result;
import views.html.Alumni;
import views.html.Contact;
import views.html.Faculty;
import views.html.Index;
import views.html.Students;

/**
 * Provides controllers for this application.
 */
public class Application extends Controller {

  /**
   * Returns the home page.
   * @return The resulting home page.
   */
  public static Result index() {
    return ok(Index.render("Welcome to the home page."));
  }


  /**
   * Returns the Students page.
   * @return The resulting Students page.
   */
  public static Result students() {
    return ok(Students.render("Welcome to the home page."));
  }


  /**
   * Returns the Faculty page.
   * @return The resulting Faculty page.
   */
  public static Result faculty() {
    return ok(Faculty.render("Welcome to the home page."));
  }


  /**
   * Returns the Alumni page.
   * @return The resulting Alumni page.
   */
  public static Result alumni() {
    return ok(Alumni.render("Welcome to the home page."));
  }


  /**
   * Returns the contact page.
   * @return The resulting contact page.
   */
  public static Result contact() {
    return ok(Contact.render("Welcome to the home page."));
  }
}
