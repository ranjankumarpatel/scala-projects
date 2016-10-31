package org.pract.scala.spring_scala.config

import org.springframework.context.annotation.Configuration
import org.springframework.context.annotation.ComponentScan
import org.springframework.web.servlet.config.annotation.EnableWebMvc
import org.springframework.web.servlet.view.InternalResourceViewResolver
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter
import org.springframework.context.annotation.Bean
import org.springframework.web.servlet.view.JstlView

@Configuration
@ComponentScan(basePackages = Array("org.pract.scala.spring_scala"))
@EnableWebMvc
class MvcConfig extends WebMvcConfigurerAdapter {

  @Bean
  def viewResolver = {

    val viewResolver = new InternalResourceViewResolver
    viewResolver.setViewClass(classOf[JstlView])
    viewResolver.setPrefix("/WEB-INF/views/")
    viewResolver.setSuffix(".jsp")
    viewResolver

  }

  override def addResourceHandlers(registry: ResourceHandlerRegistry) {
    registry.addResourceHandler("/resources/**").addResourceLocations("/resources/")
  }

}