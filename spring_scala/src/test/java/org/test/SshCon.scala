package org.test

import com.jcabi.ssh.Shell

import com.jcabi.ssh.SSH

object SshCon extends App {
  val shell = new SSH("192.168.0.4", 22, "cloudera", "cloudera");
  val stdout = new Shell.Plain(shell).exec("echo 'Hello, world!'");
  println(stdout);
}
