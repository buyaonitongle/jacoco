/*******************************************************************************
 * Copyright (c) 2009, 2010 Mountainminds GmbH & Co. KG and Contributors
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *    Brock Janiczak - initial API and implementation
 *    
 * $Id: $
 *******************************************************************************/
package org.jacoco.ant;

import java.io.File;

import junit.framework.TestSuite;

import org.apache.ant.antunit.junit3.AntUnitSuite;
import org.apache.ant.antunit.junit4.AntUnitSuiteRunner;
import org.junit.runner.RunWith;

@RunWith(AntUnitSuiteRunner.class)
public class ReportTaskTest {

	public static TestSuite suite() {
		System.setProperty("org.jacoco.ant.reportTaskTest.classes.dir",
				getClassFileLocation());
		final File file = new File("src/org/jacoco/ant/ReportTaskTest.xml");
		return new AntUnitSuite(file, ReportTaskTest.class);
	}

	/**
	 * @return class path entry where this class is located
	 */
	private static String getClassFileLocation() {
		String name = ReportTaskTest.class.getName();
		final String res = "/" + name.replace('.', '/') + ".class";
		final String loc = ReportTaskTest.class.getResource(res).getFile();
		return loc.substring(0, loc.length() - res.length());
	}

}
