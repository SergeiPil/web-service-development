package com.javaskills;

import com.javaskills.servlets.AllRequestsServlet;
import org.eclipse.jetty.server.Server;
import org.eclipse.jetty.servlet.ServletContextHandler;
import org.eclipse.jetty.servlet.ServletHolder;

public class WebServiceApplication {
    public static void main(String[] args) throws Exception {
        /**
         * Creation Servlet
         */
        AllRequestsServlet allRequestServlets = new AllRequestsServlet();
        /**
         * Creation Handler
         */
        ServletContextHandler context = new ServletContextHandler(ServletContextHandler.SESSIONS);
        /**
         * Added Servlet to Handler
         */
        context.addServlet(new ServletHolder(allRequestServlets), "/*");

        Server server = new Server(8080);
        server.setHandler(context);

        server.start();
        server.join();

    }
}
