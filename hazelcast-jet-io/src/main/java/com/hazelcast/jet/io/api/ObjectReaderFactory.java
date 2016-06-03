/*
 * Copyright (c) 2008-2016, Hazelcast, Inc. All Rights Reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.hazelcast.jet.io.api;

/**
 * Provides interface to work with object reader;
 */
public interface ObjectReaderFactory {
    /**
     * Returns reader for the corresponding typeID;
     *
     * @param typeID - typeID;
     * @param <T>    - type of the object;
     * @return - corresponding reader;
     */
    <T> ObjectReader<T> getReader(byte typeID);
}