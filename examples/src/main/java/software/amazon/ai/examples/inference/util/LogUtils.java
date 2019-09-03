/*
 * Copyright 2019 Amazon.com, Inc. or its affiliates. All Rights Reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License"). You may not use this file except in compliance
 * with the License. A copy of the License is located at
 *
 * http://aws.amazon.com/apache2.0/
 *
 * or in the "license" file accompanying this file. This file is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES
 * OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions
 * and limitations under the License.
 */
package software.amazon.ai.examples.inference.util;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.slf4j.impl.SimpleLogger;

/** Utility class for simple slf4j. */
public final class LogUtils {

    static {
        System.setProperty(SimpleLogger.DEFAULT_LOG_LEVEL_KEY, "INFO");
        System.setProperty(SimpleLogger.SHOW_DATE_TIME_KEY, "false");
        System.setProperty(SimpleLogger.SHOW_THREAD_NAME_KEY, "false");
        System.setProperty(SimpleLogger.SHOW_LOG_NAME_KEY, "false");
        System.setProperty(SimpleLogger.LEVEL_IN_BRACKETS_KEY, "true");
    }

    private LogUtils() {}

    /**
     * Returns sl4fj Logger instance.
     *
     * @param cls class of the logger
     * @return {@code Logger} instance
     */
    public static Logger getLogger(Class<?> cls) {
        return LoggerFactory.getLogger(cls);
    }
}