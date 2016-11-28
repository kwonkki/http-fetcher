/**
 * Copyright 2016 Crawler-Commons
 * 
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * 
 *     http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package crawlercommons.test;

import crawlercommons.fetcher.http.UserAgent;

public class TestUtils {

    // User agent for when we're not doing external fetching, so we just need a
    // fake name.
    public static final UserAgent CC_TEST_AGENT = new UserAgent("test", "test@domain.com", "http://test.domain.com");

}