/*******************************************************************************
 * Copyright (c) 2016 IBM Corp.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *    http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 *******************************************************************************/
package org.gameontext.sample.it.api;

import static org.junit.Assume.assumeFalse;
import static org.junit.Assume.assumeNotNull;

import org.gameontext.sample.it.EndpointClient;
import org.junit.Test;

public class TestApplicationEndpoint extends EndpointClient {

    @Test
    public void indexHtml() {
        String runningInBluemix = System.getProperty("running.bluemix");
        assumeNotNull(runningInBluemix);
        assumeFalse(Boolean.valueOf(runningInBluemix));
        String port = System.getProperty("liberty.test.port");
        testEndpoint("localhost:" + port, "/index.html", "Your room is running!");
    }

}