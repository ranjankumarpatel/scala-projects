package org.pract.scala.spring_scala.controller

import org.springframework.stereotype.Controller
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.servlet.ModelAndView

@Controller
@RequestMapping(value = Array("/"))
class HomeCtrl {

  @RequestMapping(value = Array(""))
  def test = {
    new ModelAndView("home")
  }

}