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

package crawlercommons.fetcher;

import crawlercommons.util.Headers;

/**
 */
@SuppressWarnings({ "serial" })
public class HttpFetchException extends BaseFetchException {

    private int _httpStatus;
    private Headers _httpHeaders;

    public HttpFetchException() {
        super();
    }

    public HttpFetchException(String url, String msg, int httpStatus, Headers httpHeaders) {
        super(url, msg);
        _httpStatus = httpStatus;
        _httpHeaders = httpHeaders;
    }

    public int getHttpStatus() {
        return _httpStatus;
    }

    public Headers getHttpHeaders() {
        return _httpHeaders;
    }

    @Override
    public String getMessage() {
        StringBuilder result = new StringBuilder(super.getMessage());
        result.append(" (");
        result.append(_httpStatus);
        result.append(") Headers: ");
        result.append(_httpHeaders.toString());

        return result.toString();
    }

}
