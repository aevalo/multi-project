/*
 * Copyright 2015-2016 the original author or authors.
 *
 * All rights reserved. This program and the accompanying materials are
 * made available under the terms of the Eclipse Public License v1.0 which
 * accompanies this distribution and is available at
 *
 * http://www.eclipse.org/legal/epl-v10.html
 */

package org.example.core;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInfo;

@Tag("fast")
class GreeterTest {
	@Test
	@DisplayName("Greeter test - default constructor")
	void defaultGreeting(TestInfo testInfo) {
        Greeter greeter = new Greeter();
		assertEquals("Hello, World!!!", greeter.greeting(), "Greeter did not default to World");
    }

	@Test
	@DisplayName("Greeter test - parametrized constructor")
	void customGreeting(TestInfo testInfo) {
        Greeter greeter = new Greeter("Woz");
		assertEquals("Hello, Woz!!!", greeter.greeting(), "The Woz was not greeted");
	}
}