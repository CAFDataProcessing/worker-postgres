/*
 * Copyright 2020-2025 Open Text.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.github.cafdataprocessing.workers.postgres;

import com.github.cafdataprocessing.workers.document.extensibility.DocumentWorker;
import com.github.cafdataprocessing.workers.document.model.Document;
import com.github.cafdataprocessing.workers.document.model.HealthMonitor;

public final class PostgresWorker implements DocumentWorker
{
    @Override
    public void checkHealth(final HealthMonitor healthMonitor)
    {
    }

    @Override
    public void processDocument(final Document document)
    {
    }
}
