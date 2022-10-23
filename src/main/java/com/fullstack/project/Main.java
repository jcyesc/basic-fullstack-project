
package com.fullstack.project;

import com.fullstack.project.dao.jdbc.DbConnection;

public class Main {
    public static void main(String []args) {
	System.out.println("Basic fullstack project");
	DbConnection.printConnectionDetails();
    }
}
