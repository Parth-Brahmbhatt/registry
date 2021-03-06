/**
 * Copyright 2016 Hortonworks.
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
 **/
package com.hortonworks.registries.storage.impl.jdbc.mysql;

import com.hortonworks.registries.storage.impl.jdbc.JdbcStorageManager;
import com.hortonworks.registries.storage.impl.jdbc.provider.sql.factory.QueryExecutor;
import com.hortonworks.registries.storage.DeviceInfoTest;
import com.hortonworks.registries.storage.StorableTest;

import java.util.Collections;

/**
 *
 */
public class MySqlStorageManagerNoCacheTest extends AbstractMySqlStorageManagerNoCacheIntegrationTest {

    @Override
    protected void setStorableTests() {
        storableTests = Collections.<StorableTest>singletonList(new DeviceInfoTest());
    }

    @Override
    public JdbcStorageManager createJdbcStorageManager(QueryExecutor queryExecutor) {
        JdbcStorageManager jdbcStorageManager = new JdbcStorageManager(queryExecutor);
        jdbcStorageManager.registerStorables(DeviceInfoTest.getStorableClasses());
        return jdbcStorageManager;
    }
}
