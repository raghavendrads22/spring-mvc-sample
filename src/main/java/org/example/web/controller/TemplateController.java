package org.example.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * Page controller for demonstrating the use of template engines with Spring MVC.
 */
@Controller
public class TemplateController
{
  static final String PATH_PHP = "/php";

  static final String VIEW_PHP = "php/template";

  /**
   * Displays a page generated by a PHP script.
   */
  @GetMapping(PATH_PHP)
  public String php()
  {
    return VIEW_PHP;
  }
}
