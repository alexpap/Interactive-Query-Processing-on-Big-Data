/**
 * Copyright 2011-2013 FoundationDB, LLC
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

/**
 * Isolation levels.
 */

package com.foundationdb.sql.parser;

public enum IsolationLevel {
    UNSPECIFIED_ISOLATION_LEVEL("UNSPECIFIED"),
    READ_UNCOMMITTED_ISOLATION_LEVEL("READ UNCOMMITTED"),
    READ_COMMITTED_ISOLATION_LEVEL("READ COMMITTED"),
    REPEATABLE_READ_ISOLATION_LEVEL("REPEATABLE READ"),
    SERIALIZABLE_ISOLATION_LEVEL("SERIALIZABLE");

    private String syntax;
    IsolationLevel(String syntax) {
        this.syntax = syntax;
    }
    
    public String getSyntax() {
        return syntax;
    }
}
