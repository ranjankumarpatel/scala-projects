/**
 *
 */
package org.test;

import py4j.GatewayServer;

/**
 * @author ranjan
 *
 */
public class PyJavaGateway {

	/**
	 *
	 */
	public PyJavaGateway() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		final PyJavaGateway app = new PyJavaGateway();
		// app is now the gateway.entry_point
		final GatewayServer server = new GatewayServer(app);
		server.start();

	}

}
